package chpt13.test;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Night extends Applet{
	public void paint(Graphics g) {
		resize(500, 500);
		setBackground(Color.BLACK);
		g.setColor(Color.WHITE);
		g.fillArc(400, 20, 40, 50, 0, 360);
		g.setColor(Color.BLACK);
		g.fillArc(390, 20, 40, 50, 0, 360);
		
		g.setColor(Color.WHITE);
		g.drawLine(100, 0, 80, 100);
		g.drawLine(100, 0, 120, 100);
		
		g.drawLine(60, 30, 140, 30);
		
		g.drawLine(60, 30, 120, 100);
		g.drawLine(140, 30, 80, 100);
		
		
		
		
		
		g.dispose();
		
	}


}
