package com.hawk.c01.custom.thread_concurrency;

public class ThreadValue extends Thread {

	private String value1;
	private String value2;

	@Override
	public void run() {
		value1 = "return data from member variable";
		value2 = "return data from member method";
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadValue thread = new ThreadValue();

		thread.start();
		thread.join();

		// while (thread.value1 != null || thread.value2 != null)
		// sleep(100);
		System.out.println("value1: " + thread.value1);
		System.out.println("value2: " + thread.value2);
	}
}
