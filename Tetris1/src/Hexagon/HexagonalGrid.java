package Hexagon;
import javax.swing.*;
import java.awt.*;

public class HexagonalGrid extends JPanel {

    private int numColumns; // ����
    private int numRows; // ����
    private int hexSize; // �����δ�С

    public HexagonalGrid(int numColumns, int numRows, int hexSize) {
        this.numColumns = numColumns; // �����캯���д��ݵ���������ֵ��ֵ����ĳ�Ա����numColumns
        this.numRows = numRows; // �����캯���д��ݵ���������ֵ��ֵ����ĳ�Ա����numRows
        this.hexSize = hexSize; // �����캯���д��ݵ������δ�С����ֵ��ֵ����ĳ�Ա����hexSize

        // ����������ѡ��С����Ӧ����������
        int width = (int)( 0.868* hexSize * numColumns);
        int height = (int)( 0.78* hexSize * numColumns);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public void paintComponent(Graphics g) {//Graphics���������������
        super.paintComponent(g);//paintComponent��Graphics�����»��Ƶķ���
        Graphics2D g2d = (Graphics2D)g;//Graphics2D �� Graphics ������࣬���ṩ�˸���� 2D ��ͼ������Graphics2D ������ Graphics �������չ��������ͨ�� Graphics ����� getGraphics �����õ���

        // ��ÿ������λ���ϻ���һ��������
        //����ʵ�ֲ���
        for (int row = 0; row < numRows; row++) {  	
        	
            for (int col = 0; col < numColumns; col++) {
           	if(  (row==0 && 4<col&&col<14)||(row==1&&2<col&&col<16)||(row==2&&col>0) ||(row==3&&col>1&&col<17)||(row==4&&col>3&&col<15)  ){
            		int x = (int)(Math.sqrt(3) /2* hexSize * col);
            	int y = (int)((3*hexSize)* row + (col % 2) * (hexSize * 0.5+hexSize));
            	Polygon hexagon = createHexagon(x, y, hexSize);//��Ϊ hexagon �Ķ���α�����createHexagon���Լ������һ������
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
        //HexagonalGrid grid = new HexagonalGrid(18, 5, 60); // �����������������ָ��8�У�8�У�50�����ش�С��������
        //JFrame frame = new JFrame("Hexagonal Grid"); // ����һ����Ϊ"Hexagonal Grid"�Ĵ��ڿ��
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���ô��ڿ�ܵ�Ĭ�Ϲرղ���
        //frame.add(grid); // ��������������ӵ����ڿ����
        //frame.pack(); // �������ڿ�ܴ�С����Ӧ����������Ĵ�С
        //frame.setLocationRelativeTo(null); // �����ڿ�ܾ�����ʾ����Ļ��
        //frame.setVisible(true);
    }
}

    