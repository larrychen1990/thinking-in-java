package com.hawk.c01.custom.thread_concurrency;

public class ThreadFlag extends Thread {
	
	public volatile boolean exit = false;
	@Override
	public void run() {
		while (!exit) {
			System.out.println("Hello");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadFlag thread = new ThreadFlag();
		thread.start();
		sleep(1000*5);
		thread.exit = true;
		thread.join();
		
		System.out.println("thread exit");
		
						
	}
}
