package Hexagon;
import javax.swing.*;
import java.awt.*;

public class HexagonalFigure extends JPanel {

    private int numColumns; // 列数
    private int numRows; // 行数
    private int hexSize; // 六边形大小

    public HexagonalFigure(int numColumns, int numRows, int hexSize) {
        this.numColumns = numColumns; // 将构造函数中传递的列数参数值赋值给类的成员变量numColumns
        this.numRows = numRows; // 将构造函数中传递的行数参数值赋值给类的成员变量numRows
        this.hexSize = hexSize; // 将构造函数中传递的六边形大小参数值赋值给类的成员变量hexSize

        // 设置面板的首选大小以适应六边形网格
        int width = (int)( 0.868* hexSize * 9);
        int height = (int)( 0.78* hexSize * 9);
        setPreferredSize(new Dimension(width, height));
    }
    
        public int index;
        public void setindex(int index) {
    	this.index=index;//表示这个类里面的index就等于这个函数传入的index
    }
        //11种图形
        public void paintComponent(Graphics g) {//Graphics是用来绘制组件的
        super.paintComponent(g);//paintComponent是Graphics的重新绘制的方法
        Graphics2D g2d = (Graphics2D)g;//Graphics2D 是 Graphics 类的子类，它提供了更多的 2D 绘图操作。Graphics2D 对象是 Graphics 对象的扩展，它可以通过 Graphics 对象的 getGraphics 方法得到。

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                int x = (int)(Math.sqrt(3) /2* hexSize * col);
                int y = (int)((3*hexSize)* row + (col % 2) * (hexSize * 0.5+hexSize));

                Polygon hexagon = createHexagon(x, y, hexSize);
                //一个点
                if(index==0) {
                	if (row == 0 &&col ==1) {
	                    g2d.setColor(Color.gray);
	                    g2d.fill(hexagon);
	                    
	                }
                }
                // 直线型 ，水平。Set the fill color to blue for hexagons at positions (0, 5), (0, 7), (0, 9), and (0, 11)
                else if(index==1) {
	                if (row == 0 &&( col ==1|col==3|col==5|col==7) ) {
	                    g2d.setColor(Color.green);
	                    g2d.fill(hexagon);
	                    
	                }
                }
                //"/"形
                else if(index==2) {
	                if ((row==2 && col==2)|(row==1 && col==3)|(row==1 && col==4)|(row==0 && col==5)){ 
	                	g2d.setColor(Color.green);
	                	g2d.fill(hexagon);
	                }
                }
                //"\"形
                else if(index==3) {
	                if((row==0 && col==1)|(row==1 && col==2)|(row==1 && col==3)|(row==2 && col==4)) {
	                	g2d.setColor(Color.green);
	                	g2d.fill(hexagon);
	                }
                }
                
                //菱形
                else if(index==4) {
                	//正菱形
                	if((row==0 && col==3)|(row==1 && col==3)|(row==1 && col==2)|(row==1 && col==4)) {
	                	g2d.setColor(Color.BLUE);
	                	g2d.fill(hexagon);
	                }
                }
                else if(index==5) {
                	//Z字菱形
                	if((row==0 && col==3)|(row==0 && col==5)|(row==1 && col==2)|(row==1 && col==4)) {
                		g2d.setColor(Color.BLUE);
	                	g2d.fill(hexagon);
                	}
                }
                
              //C形
                //开口左上
                else if(index==6) {
                	if((row==0 && col==3)|(row==1 && col==3)|(row==1 && col==1)|(row==1 && col==4)) {
	                	g2d.setColor(Color.YELLOW);
	                	g2d.fill(hexagon);
	                }
                }
                //开口右上
            	else if(index==7) {
                	if((row==0 && col==3)|(row==1 && col==2)|(row==1 && col==3)|(row==1 && col==5)) {
	                	g2d.setColor(Color.YELLOW);
	                	g2d.fill(hexagon);
	                }
                }
                
              //斜角形
               else if(index==8){
            	   //3下1上
            	   if((row==1)&&(col==1||col==2||col==3||col==5)) { 
            		   g2d.setColor(Color.BLUE);
            		   g2d.fill(hexagon); }
                }
               else if(index==9) {
            	   //3上1下
                    if((row==1)&&(col==1||col==3||col==5)||(row==2)&&(col==2)) {
                    	g2d.setColor(Color.BLUE);
                    	g2d.fill(hexagon); }
               }
               else if(index==10) { 
            	   //2+1+1
                	   if((row==0)&&(col==1||col==3)||(row==1)&&(col==1)||(row==1)&&(col==2)) {
                	   g2d.setColor(Color.BLUE);
                	   g2d.fill(hexagon); }
               }
               else if(index==11) { 
            	   //1+2+1
                	   if((row==1)&&(col==3||col==4||col==2)||(row==0)&&(col==5)) {
                	   g2d.setColor(Color.BLUE); 
                	   g2d.fill(hexagon); }
               } 
            }
        }

    }

    private Polygon createHexagon(int x, int y, int size) {
        int[] xPoints = {x, (int) (x +Math.sqrt(3)*size/2), (int) (x +Math.sqrt(3)*size/2), x , (int) (x -(Math.sqrt(3)*size/2)),(int)(x-Math.sqrt(3)*size/2)};
        int[] yPoints = {y +(int)(0.5 * size) ,y,y-size,y-(int)(1.5 * size),y-size,y};
        return new Polygon(xPoints, yPoints, 6);
    }
    //public static void main(String[] args) {
        //HexagonalFigure grid = new HexagonalFigure(18, 5, 60); // 创建六边形网格对象，指定8列，8行，50个像素大小的六边形
        //JPanel p = new JPanel(); // 创建一个名为"Hexagonal Grid"的窗口框架
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗口框架的默认关闭操作
        //p.add(grid); // 将六边形网格添加到窗口框架中
        //frame.pack(); // 调整窗口框架大小以适应六边形网格的大小
        //frame.setLocationRelativeTo(null); // 将窗口框架居中显示在屏幕上
        //frame.setVisible(true);
    //}
}