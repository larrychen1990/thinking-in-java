package chpt13.test;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class CanvasTest extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		resize(500, 500);

		g.draw3DRect(0, 0, 200, 50, true);		//正方形
		g.drawArc(0, 0, 100, 50, 0, 360);		//椭圆,亦可画弧
		g.drawArc(100, 0, 50, 50, 0, 360);		//圆,亦可画弧
		g.drawLine(0, 63, 200, 63);				//直线
		g.drawOval(130, 0, 70, 50);				//椭圆
		g.drawRoundRect(0, 80, 100, 50, 10, 10);//圆角长方形
		g.fillRoundRect(0, 140, 100, 50, 10, 10);//填充圆角长方形
		g.setColor(Color.green);				//设置当前颜色
		g.setFont(new Font(Font.DIALOG,Font.BOLD,20));
		g.drawString("Larry Chen", 0, 220);		//字
		int[] xPoints={200,250,220};
		int[] yPoints={300,180,330};
		g.drawPolygon(xPoints, yPoints, 3);		//闭合多边形
		int[] xlPoints={0,20,200};
		int[] ylPoints={330,140,300};
		g.drawPolyline(xlPoints, ylPoints, 3);
		
		
		Dialog d=new Dialog(new Frame());
		d.show();
		
		
		
		
		g.dispose();
		
		
		
	}

	
}
