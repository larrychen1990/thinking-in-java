package chpt13;

//: Applet1.java
//Very simple applet
import java.awt.*;
import java.applet.*;

public class Applet1 extends Applet {
	// <applet code=MyApplet.class width=200 height=100></applet>
	public void paint(Graphics g) {
		g.drawString("First applet", 10, 10);
	}
} // /:~
