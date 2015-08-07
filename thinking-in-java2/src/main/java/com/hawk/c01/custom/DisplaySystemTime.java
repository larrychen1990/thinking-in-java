package com.hawk.c01.custom;

import java.applet.Applet;
import java.awt.Label;
import java.util.Date;

public class DisplaySystemTime extends Applet {
	public Label label = new Label("Your system time :");
	public Label timeDisplay = new Label("          ");

	public void init() {// 把这里改动一下同样可以在窗体中执行
		this.add(label);// 在applet中加入label下同
		this.add(timeDisplay);
		new Time();// 生成一Time类的对象
	}

	class Time extends Thread {// 发现了没有，这是一个内部类
		String hour = null; // 内部类可以直接访问外布类的数据
		String minuter = null; // 外部类却不可以访问内部类的数据
		String second = null;

		public Time() {
			start();// 这样线程类一被构造，马上就运行run()
		}

		public void run() {
			while (true) {
				try {
					sleep(1000);// 暂停一秒
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				Date date = new Date();
				hour = String.valueOf(date.getHours());
				minuter = String.valueOf(date.getMinutes());
				second = String.valueOf(date.getSeconds());
				timeDisplay.setText(hour + ":" + minuter + ":" + second);
			}
		}
	}// 内部类到此为止
}
