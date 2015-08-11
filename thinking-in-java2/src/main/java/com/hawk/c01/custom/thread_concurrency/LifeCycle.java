package com.hawk.c01.custom.thread_concurrency;

public class LifeCycle extends Thread{

	@Override
	public void run() {
		int n = 0;
		while ((++n) < 1000) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		LifeCycle thread1 = new LifeCycle();
		System.out.println("isAlive: "+thread1.isAlive());
		thread1.start();
		System.out.println("isAlive: "+thread1.isAlive());
		
		thread1.join(); // wait for current thread's an end then continue to execute follows
		
		System.out.println("thread1 is over");
		System.out.println("isAlive: "+thread1.isAlive());
	}

}
