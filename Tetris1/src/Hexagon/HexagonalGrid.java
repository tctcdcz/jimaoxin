package Hexagon;
import javax.swing.*;
import java.awt.*;

public class HexagonalGrid extends JPanel {

    private int numColumns; // 列数
    private int numRows; // 行数
    private int hexSize; // 六边形大小

    public HexagonalGrid(int numColumns, int numRows, int hexSize) {
        this.numColumns = numColumns; // 将构造函数中传递的列数参数值赋值给类的成员变量numColumns
        this.numRows = numRows; // 将构造函数中传递的行数参数值赋值给类的成员变量numRows
        this.hexSize = hexSize; // 将构造函数中传递的六边形大小参数值赋值给类的成员变量hexSize

        // 设置面板的首选大小以适应六边形网格
        int width = (int)( 0.868* hexSize * numColumns);
        int height = (int)( 0.78* hexSize * numColumns);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics是用来绘制组件的
        super.paintComponent(g);//paintComponent是Graphics的重新绘制的方法
        Graphics2D g2d = (Graphics2D)g;//Graphics2D 是 Graphics 类的子类，它提供了更多的 2D 绘图操作。Graphics2D 对象是 Graphics 对象的扩展，它可以通过 Graphics 对象的 getGraphics 方法得到。

        // 在每个网格位置上绘制一个六边形
        //网格实现部分
        for (int row = 0; row < numRows; row++) {  	
        	
            for (int col = 0; col < numColumns; col++) {
           	if(  (row==0 && 4<col&&col<14)||(row==1&&2<col&&col<16)||(row==2&&col>0) ||(row==3&&col>1&&col<17)||(row==4&&col>3&&col<15)  ){
            		int x = (int)(Math.sqrt(3) /2* hexSize * col);
            	int y = (int)((3*hexSize)* row + (col % 2) * (hexSize * 0.5+hexSize));
            	Polygon hexagon = createHexagon(x, y, hexSize);//名为 hexagon 的多边形变量，createHexagon是自己创造的一个方法
                g2d.draw(hexagon);
            	}
            }
        }
    }

    private Polygon createHexagon(int x, int y, int size) {
        int[] xPoints = {x, (int) (x +Math.sqrt(3)*size/2), (int) (x +Math.sqrt(3)*size/2), x , (int) (x -(Math.sqrt(3)*size/2)),(int)(x-Math.sqrt(3)*size/2)};
        int[] yPoints = {y +(int)(0.5 * size) ,y,y-size,y-(int)(1.5 * size),y-size,y};
        return new Polygon(xPoints, yPoints, 6);
    }
    public static void main(String[] args) {
        //HexagonalGrid grid = new HexagonalGrid(18, 5, 60); // 创建六边形网格对象，指定8列，8行，50个像素大小的六边形
        //JFrame frame = new JFrame("Hexagonal Grid"); // 创建一个名为"Hexagonal Grid"的窗口框架
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗口框架的默认关闭操作
        //frame.add(grid); // 将六边形网格添加到窗口框架中
        //frame.pack(); // 调整窗口框架大小以适应六边形网格的大小
        //frame.setLocationRelativeTo(null); // 将窗口框架居中显示在屏幕上
        //frame.setVisible(true);
    }
}

    