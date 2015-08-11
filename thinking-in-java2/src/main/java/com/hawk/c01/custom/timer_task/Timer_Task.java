package com.hawk.c01.custom.timer_task;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_Task {
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Calendar calendar = Calendar.getInstance(); // this is the method you should use, not the Date(), because it is desperated.
				int hour = calendar.get(Calendar.HOUR_OF_DAY); // get the hour number of the day, from 0 to 23
				
				if (hour == 13) {
					System.out.println("doing the scheduled task");
				}
			}
		};
		
		timer.schedule(task, 1000, 1000*5); // delay the task 1 second, and then run task every five seconds
	}
}
