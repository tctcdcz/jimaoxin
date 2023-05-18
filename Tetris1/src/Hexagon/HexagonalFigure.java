package Hexagon;
import javax.swing.*;
import java.awt.*;

public class HexagonalFigure extends JPanel {

    private int numColumns; // ����
    private int numRows; // ����
    private int hexSize; // �����δ�С

    public HexagonalFigure(int numColumns, int numRows, int hexSize) {
        this.numColumns = numColumns; // �����캯���д��ݵ���������ֵ��ֵ����ĳ�Ա����numColumns
        this.numRows = numRows; // �����캯���д��ݵ���������ֵ��ֵ����ĳ�Ա����numRows
        this.hexSize = hexSize; // �����캯���д��ݵ������δ�С����ֵ��ֵ����ĳ�Ա����hexSize

        // ����������ѡ��С����Ӧ����������
        int width = (int)( 0.868* hexSize * 9);
        int height = (int)( 0.78* hexSize * 9);
        setPreferredSize(new Dimension(width, height));
    }
    
        public int index;
        public void setindex(int index) {
    	this.index=index;//��ʾ����������index�͵���������������index
    }
        //11��ͼ��
        public void paintComponent(Graphics g) {//Graphics���������������
        super.paintComponent(g);//paintComponent��Graphics�����»��Ƶķ���
        Graphics2D g2d = (Graphics2D)g;//Graphics2D �� Graphics ������࣬���ṩ�˸���� 2D ��ͼ������Graphics2D ������ Graphics �������չ��������ͨ�� Graphics ����� getGraphics �����õ���

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numColumns; col++) {
                int x = (int)(Math.sqrt(3) /2* hexSize * col);
                int y = (int)((3*hexSize)* row + (col % 2) * (hexSize * 0.5+hexSize));

                Polygon hexagon = createHexagon(x, y, hexSize);
                //һ����
                if(index==0) {
                	if (row == 0 &&col ==1) {
	                    g2d.setColor(Color.gray);
	                    g2d.fill(hexagon);
	                    
	                }
                }
                // ֱ���� ��ˮƽ��Set the fill color to blue for hexagons at positions (0, 5), (0, 7), (0, 9), and (0, 11)
                else if(index==1) {
	                if (row == 0 &&( col ==1|col==3|col==5|col==7) ) {
	                    g2d.setColor(Color.green);
	                    g2d.fill(hexagon);
	                    
	                }
                }
                //"/"��
                else if(index==2) {
	                if ((row==2 && col==2)|(row==1 && col==3)|(row==1 && col==4)|(row==0 && col==5)){ 
	                	g2d.setColor(Color.green);
	                	g2d.fill(hexagon);
	                }
                }
                //"\"��
                else if(index==3) {
	                if((row==0 && col==1)|(row==1 && col==2)|(row==1 && col==3)|(row==2 && col==4)) {
	                	g2d.setColor(Color.green);
	                	g2d.fill(hexagon);
	                }
                }
                
                //����
                else if(index==4) {
                	//������
                	if((row==0 && col==3)|(row==1 && col==3)|(row==1 && col==2)|(row==1 && col==4)) {
	                	g2d.setColor(Color.BLUE);
	                	g2d.fill(hexagon);
	                }
                }
                else if(index==5) {
                	//Z������
                	if((row==0 && col==3)|(row==0 && col==5)|(row==1 && col==2)|(row==1 && col==4)) {
                		g2d.setColor(Color.BLUE);
	                	g2d.fill(hexagon);
                	}
                }
                
              //C��
                //��������
                else if(index==6) {
                	if((row==0 && col==3)|(row==1 && col==3)|(row==1 && col==1)|(row==1 && col==4)) {
	                	g2d.setColor(Color.YELLOW);
	                	g2d.fill(hexagon);
	                }
                }
                //��������
            	else if(index==7) {
                	if((row==0 && col==3)|(row==1 && col==2)|(row==1 && col==3)|(row==1 && col==5)) {
	                	g2d.setColor(Color.YELLOW);
	                	g2d.fill(hexagon);
	                }
                }
                
              //б����
               else if(index==8){
            	   //3��1��
            	   if((row==1)&&(col==1||col==2||col==3||col==5)) { 
            		   g2d.setColor(Color.BLUE);
            		   g2d.fill(hexagon); }
                }
               else if(index==9) {
            	   //3��1��
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
        //HexagonalFigure grid = new HexagonalFigure(18, 5, 60); // �����������������ָ��8�У�8�У�50�����ش�С��������
        //JPanel p = new JPanel(); // ����һ����Ϊ"Hexagonal Grid"�Ĵ��ڿ��
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô��ڿ�ܵ�Ĭ�Ϲرղ���
        //p.add(grid); // ��������������ӵ����ڿ����
        //frame.pack(); // �������ڿ�ܴ�С����Ӧ����������Ĵ�С
        //frame.setLocationRelativeTo(null); // �����ڿ�ܾ�����ʾ����Ļ��
        //frame.setVisible(true);
    //}
}