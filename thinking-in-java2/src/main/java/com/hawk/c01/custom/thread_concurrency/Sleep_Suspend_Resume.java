package com.hawk.c01.custom.thread_concurrency;

import java.util.Date;

public class Sleep_Suspend_Resume extends Thread {

	class SleepThread extends Thread {
		@Override
		public void run() {
			try {
				sleep(3000);
				System.out.println("SleepThread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			System.out.println(new Date().getTime());
		}
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		Sleep_Suspend_Resume myThread = new Sleep_Suspend_Resume();
		SleepThread sleepThread = myThread.new SleepThread();
		sleepThread.start(); // start SleepThread
		sleepThread.join(); // SleepThread delay 2 sec

		myThread.start();

		boolean flag = false;

		while (true) {
			sleep(5000); // main Thread delay 5 sec
			System.out.println("main sleep");
			flag = !flag;
			if (flag) {
				myThread.suspend();
			} else {
				myThread.resume();
			}
		}

	}
}
