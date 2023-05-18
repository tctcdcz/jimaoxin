package EliminationScore;
import javax.swing.*;
import java.awt.*;
import Hexagon.HexagonalGrid;
import Hexagon.HexagonalFigure;
import java.awt.image.BufferedImage;
//实时得分Real_Time_Score
public class EliminationScore extends JPanel{
	
public int Real_Time_Score=0;	
public void paintComponent(Graphics g)
{	
	 Graphics2D g2d = (Graphics2D)g;
	 super.paintComponent(g);
    Color[][] ArryColor = new Color[10][30];//存储所有格子的颜色
    HexagonalGrid gird=new HexagonalGrid(18,5,60);//
	for (int row = 0; row <4 ; row++) {
        for (int col = 0; col < 17; col++) {   
        
        	ArryColor[row][col] = g2d.getColor()  ;      	
        }
        }
	
	//横行的消除和加分
	//1
	if(ArryColor[0][5].getAlpha()!=0 & ArryColor[0][7].getAlpha()!=0 & ArryColor[0][9].getAlpha()!=0&ArryColor[0][11].getAlpha()!=0&ArryColor[0][13].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);  
        Real_Time_Score=Real_Time_Score+5;
	}
	//2
	if(ArryColor[1][4].getAlpha()!=0&ArryColor[1][6].getAlpha()!=0&ArryColor[1][8].getAlpha()!=0&ArryColor[1][10].getAlpha()!=0&ArryColor[1][12].getAlpha()!=0&ArryColor[1][14].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon); 
        Real_Time_Score=Real_Time_Score+6;
	}	
	//3
	if(ArryColor[1][3].getAlpha()!=0&ArryColor[1][5].getAlpha()!=0&ArryColor[1][7].getAlpha()!=0&ArryColor[1][9].getAlpha()!=0&ArryColor[1][11].getAlpha()!=0&ArryColor[1][13].getAlpha()!=0&ArryColor[1][15].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon); 
        Real_Time_Score=Real_Time_Score+7;
	}
	//4
	if(ArryColor[2][2].getAlpha()!=0&ArryColor[2][4].getAlpha()!=0&ArryColor[2][6].getAlpha()!=0&ArryColor[2][8].getAlpha()!=0&ArryColor[2][10].getAlpha()!=0&ArryColor[2][12].getAlpha()!=0&ArryColor[2][14].getAlpha()!=0&ArryColor[2][16].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);    
        Real_Time_Score=Real_Time_Score+8;
	}
	//5
	if(ArryColor[2][1].getAlpha()!=0&ArryColor[2][3].getAlpha()!=0&ArryColor[2][5].getAlpha()!=0&ArryColor[2][7].getAlpha()!=0&ArryColor[2][9].getAlpha()!=0&ArryColor[2][11].getAlpha()!=0&ArryColor[2][13].getAlpha()!=0&ArryColor[2][15].getAlpha()!=0&ArryColor[2][17].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);   
        Real_Time_Score=Real_Time_Score+9;
	}
	//6
	if(ArryColor[3][2].getAlpha()!=0&ArryColor[3][4].getAlpha()!=0&ArryColor[3][6].getAlpha()!=0&ArryColor[3][8].getAlpha()!=0&ArryColor[3][10].getAlpha()!=0&ArryColor[3][12].getAlpha()!=0&ArryColor[3][14].getAlpha()!=0&ArryColor[3][16].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);  
        Real_Time_Score=Real_Time_Score+8;
	}
	//7
	if(ArryColor[3][3].getAlpha()!=0&ArryColor[3][5].getAlpha()!=0&ArryColor[3][7].getAlpha()!=0&ArryColor[3][9].getAlpha()!=0&ArryColor[3][11].getAlpha()!=0&ArryColor[3][13].getAlpha()!=0&ArryColor[3][15].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);  
        Real_Time_Score=Real_Time_Score+7;
	}
	//8
	if(ArryColor[4][4].getAlpha()!=0&ArryColor[4][6].getAlpha()!=0&ArryColor[4][8].getAlpha()!=0&ArryColor[4][10].getAlpha()!=0&ArryColor[4][12].getAlpha()!=0&ArryColor[4][14].getAlpha()!=0)
	{
	     g2d.setColor(Color.TRANSLUCENT);
	     g2d.fill(hexagon);
	     Real_Time_Score=Real_Time_Score+6;
	}	
	//9
	if(ArryColor[4][5].getAlpha()!=0&ArryColor[4][7].getAlpha()!=0&ArryColor[4][9].getAlpha()!=0&ArryColor[4][11].getAlpha()!=0&ArryColor[4][13].getAlpha()!=0)
	{
        g2d.setColor(Color.TRANSLUCENT);
        g2d.fill(hexagon);
        Real_Time_Score=Real_Time_Score+5;
	}
	
	
	
	
	 //左斜
	//1
    Color ArrayColor[][]=new Color[5][18];
    if(ArrayColor[0][5].getAlpha()!=0& ArrayColor[1][4].getAlpha()!=0 & ArrayColor[1][3].getAlpha()!=0 & ArrayColor[2][2].getAlpha()!=0 & ArrayColor[2][1].getAlpha()!=0 )
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+5*20;
    }
    //2
    if(ArrayColor[0][7].getAlpha()!=0& ArrayColor[1][6].getAlpha()!=0 & ArrayColor[1][5].getAlpha()!=0 & ArrayColor[2][4].getAlpha()!=0 & ArrayColor[2][3].getAlpha()!=0 & ArrayColor[3][2].getAlpha()!=0 )
    {
    	g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
    	Real_Time_Score=Real_Time_Score+6*20;
    }
        
    //3
    if(ArrayColor[0][9].getAlpha()!=0 & ArrayColor[1][8].getAlpha()!=0 & ArrayColor[1][7].getAlpha()!=0 & ArrayColor[2][6].getAlpha()!=0 & ArrayColor[2][5].getAlpha()!=0 & ArrayColor[3][4].getAlpha()!=0 & ArrayColor[3][3].getAlpha()!=0 )	
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+7*20;
		
    }
    //4
    if(ArrayColor[0][11].getAlpha()!=0 & ArrayColor[1][10].getAlpha()!=0 & ArrayColor[1][9].getAlpha()!=0 & ArrayColor[2][8].getAlpha()!=0 & ArrayColor[2][7].getAlpha()!=0 & ArrayColor[3][6].getAlpha()!=0 & ArrayColor[3][5].getAlpha()!=0 & ArrayColor[4][4].getAlpha()!=0 )
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+8*20;
    }
	//5
		if(ArrayColor[0][13].getAlpha()!=0 & ArrayColor[1][12].getAlpha()!=0 & ArrayColor[1][11].getAlpha()!=0 & ArrayColor[2][10].getAlpha()!=0 & ArrayColor[2][9].getAlpha()!=0 & ArrayColor[3][8].getAlpha()!=0 & ArrayColor[3][7].getAlpha()!=0 & ArrayColor[4][5].getAlpha()!=0 )
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+9*20;
	}
		//6
		if(ArrayColor[1][14].getAlpha()!=0 & ArrayColor[1][13].getAlpha()!=0 & ArrayColor[2][12].getAlpha()!=0 & ArrayColor[2][11].getAlpha()!=0 & ArrayColor[3][10].getAlpha()!=0 & ArrayColor[3][9].getAlpha()!=0 & ArrayColor[4][8].getAlpha()!=0 & ArrayColor[4][7].getAlpha()!=0 )
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+8*20;
	}
		//7
	if(ArrayColor[1][15].getAlpha()!=0 & ArrayColor[2][14].getAlpha()!=0 & ArrayColor[2][13].getAlpha()!=0 & ArrayColor[3][12].getAlpha()!=0 & ArrayColor[3][11].getAlpha()!=0 & ArrayColor[4][10].getAlpha()!=0 & ArrayColor[4][9].getAlpha()!=0 )	
	{
 		g2d.setColor(Color.TRANSLUCENT);
 		g2d.fill(hexagon);
 		Real_Time_Score=Real_Time_Score+7*20;
 	}
		//8
	if(ArrayColor[2][16].getAlpha()!=0& ArrayColor[2][15].getAlpha()!=0 & ArrayColor[3][14].getAlpha()!=0 & ArrayColor[3][13].getAlpha()!=0 & ArrayColor[4][12].getAlpha()!=0 & ArrayColor[4][11].getAlpha()!=0 )
    {
    	g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
    	Real_Time_Score=Real_Time_Score+6*20;
	}
		//9
	if(ArrayColor[2][17].getAlpha()!=0& ArrayColor[3][16].getAlpha()!=0 & ArrayColor[3][15].getAlpha()!=0 & ArrayColor[4][14].getAlpha()!=0 & ArrayColor[4][13].getAlpha()!=0 )
	{
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+5*20;
	}
	
     
//右斜
//1

if (ArrayColor[2][1].getAlpha() != 0&ArrayColor[3][2].getAlpha() != 0&ArrayColor[3][3].getAlpha() != 0&ArrayColor[4][4].getAlpha() != 0&ArrayColor[4][5].getAlpha() != 0 )
{
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+5*20;
}
//2
if (ArrayColor[2][2].getAlpha() != 0&ArrayColor[2][3].getAlpha() != 0&ArrayColor[3][4].getAlpha() != 0&ArrayColor[3][5].getAlpha() != 0&ArrayColor[4][6].getAlpha() != 0&ArrayColor[4][7].getAlpha() != 0)
{
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+6*20;
}
    
//3
if (ArrayColor[1][3].getAlpha() != 0&ArrayColor[2][4].getAlpha() != 0&ArrayColor[2][5].getAlpha() != 0&ArrayColor[3][6].getAlpha() != 0&ArrayColor[3][7].getAlpha() != 0&ArrayColor[4][8].getAlpha() != 0&ArrayColor[4][9].getAlpha() != 0) {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+7*20;
	
}
//4
if (ArrayColor[1][4].getAlpha() != 0&ArrayColor[1][5].getAlpha() != 0&ArrayColor[2][6].getAlpha() != 0&ArrayColor[2][7].getAlpha() != 0&ArrayColor[3][8].getAlpha() != 0&ArrayColor[3][9].getAlpha() != 0&ArrayColor[4][10].getAlpha() != 0&ArrayColor[4][11].getAlpha() != 0) {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+8*20;
}
//5
	if (ArrayColor[0][5].getAlpha() != 0&ArrayColor[1][6].getAlpha() != 0&ArrayColor[1][7].getAlpha() != 0&ArrayColor[2][8].getAlpha() != 0&ArrayColor[2][9].getAlpha() != 0&ArrayColor[3][10].getAlpha() != 0&ArrayColor[3][11].getAlpha() != 0&ArrayColor[4][12].getAlpha() != 0&ArrayColor[4][13].getAlpha() != 0) {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+9*20;
}
	//6
	if (ArrayColor[0][7].getAlpha() != 0&ArrayColor[1][8].getAlpha() != 0&ArrayColor[1][9]!=Color.TRANSLUCENT&ArrayColor[2][10]!=Color.TRANSLUCENT&ArrayColor[2][11]!=Color.TRANSLUCENT&ArrayColor[3][12].getAlpha() != 0&ArrayColor[3][13].getAlpha() != 0&ArrayColor[4][14].getAlpha() != 0) {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+8*20;
}
	//7
if (ArrayColor[0][9].getAlpha() != 0&ArrayColor[1][10].getAlpha() != 0&ArrayColor[1][11].getAlpha() != 0&ArrayColor[2][12].getAlpha() != 0&ArrayColor[2][13].getAlpha() != 0&ArrayColor[3][14].getAlpha() != 0&ArrayColor[3][15].getAlpha() != 0) {
		g2d.setColor(Color.TRANSLUCENT);
		g2d.fill(hexagon);
		Real_Time_Score=Real_Time_Score+7*20;
	}
	//8
if (ArrayColor[0][11].getAlpha() != 0&ArrayColor[1][12].getAlpha() != 0&ArrayColor[1][13].getAlpha() != 0&ArrayColor[2][14].getAlpha() != 0&ArrayColor[2][15].getAlpha() != 0&ArrayColor[3][16].getAlpha() != 0 ) {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+6*20;
}
	//9
if (ArrayColor[0][13].getAlpha() != 0&ArrayColor[1][14].getAlpha() != 0&ArrayColor[1][15].getAlpha() != 0&ArrayColor[2][16].getAlpha() != 0&ArrayColor[2][17].getAlpha() != 0 )  {
	g2d.setColor(Color.TRANSLUCENT);
	g2d.fill(hexagon);
	Real_Time_Score=Real_Time_Score+5*20;
}
	
	
	
}
}
}

