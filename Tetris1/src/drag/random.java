package drag;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Hexagon.HexagonalFigure;
public class random extends JPanel{
	private List<JPanel> panels;
	private List<HexagonalFigure> figures;
	int start=1;//��Ϸ��ʼ������һ������
	int flag;//���ֵΪ�Ƿ���ק��ͼ���Ѿ���������������ϣ�����Ѿ������˾�Ϊ1��û����Ϊ0
	
	public random(){
		setLayout(new GridLayout(3,1));
		panels = new ArrayList<>();
		
		HexagonalFigure h[]=new HexagonalFigure[100];
		
		for(int j=0;j<3;j++)
		{
			JPanel panel = new JPanel();
            panels.add(panel);
            add(panel);
		}//������3�����
		
		
		figures = new ArrayList<>();
		int i;
		if(start==1)
		{
			for(int j=1;j<3;) {
				Random ran = new Random();
				int rNumber = ran.nextInt(12); // ���� 0 �� 11 ֮����������
				HexagonalFigure figure=new HexagonalFigure(18,5,40);
				figure.setindex(rNumber);
				figures.add(figure);
				panels.get(j).add(figure);
				j++;
			}
		}
		
		flag=1;
		if(flag==1) {
				actionPerformed();
				for(i=3;i<100;) {
					Random ran = new Random();
					int rNumber = ran.nextInt(12); // ���� 0 �� 11 ֮����������
					HexagonalFigure figure=new HexagonalFigure(18,5,40);
					figure.setindex(rNumber);
					figures.add(figure);
					panels.get(panels.size()-1).add(figure);
					i++;
					break;
				}
		}
		
		
	}
	
	// ������ʱ��
    //Timer timer = new Timer(10, new ActionListener() {
    	 public void actionPerformed() {
    			if(panels.get(0).getComponentCount()==0)
    			{
    				for(int n=1;n<panels.size();n++)
    				{
    					JPanel sourcePanel = panels.get(n);
                        JPanel targetPanel = panels.get(n - 1);
                        targetPanel.add(sourcePanel.getComponent(0));
    				}
    				flag=0;
          			// ((Timer) e.getSource()).stop();
    			}
    			if(panels.get(1).getComponentCount()==0)
    			{
    				for(int n=2;n<panels.size();n++)
    				{
    					JPanel sourcePanel = panels.get(n);
                        JPanel targetPanel = panels.get(n - 1);
                        targetPanel.add(sourcePanel.getComponent(0));
    				}
    				flag=0;
         			 //((Timer) e.getSource()).stop();
    		     }
    	 }
    //});
	
	public static void main (String[] args){
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 900);
        random q=new random();
        frame.add(q);
        frame.setVisible(true);
	}
}