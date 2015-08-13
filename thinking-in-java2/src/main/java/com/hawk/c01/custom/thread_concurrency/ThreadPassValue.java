package com.hawk.c01.custom.thread_concurrency;

import java.util.Random;

class Data {
	public int value = 0;
}

class Work {
	public void process(Data data, Integer... numbers) {
		for (int n : numbers) {
			data.value += n;
		}
	}
}

public class ThreadPassValue extends Thread {
	//
	// public String threadName;
	//
	// public ThreadPassValue(String threadName) {
	// this.threadName = threadName;
	// }
	//
	// public void setThreadName(String threadName) {
	// this.threadName = threadName;
	// }
	//
	// @Override
	// public void run() {
	// System.out.println("Hello " + threadName);
	// }
	//
	// public static void main(String[] args) {
	// ThreadPassValue thread = new ThreadPassValue("world!");
	// thread.setThreadName("world2!");
	// // thread.start();
	//
	// Thread thread2 = new Thread(thread);
	// thread2.start();
	// }

	private Work work;

	private ThreadPassValue(Work work) {
		this.work = work;
	}

	@Override
	public void run() {
		Random random = new Random();
		Data data = new Data();

		int n1 = random.nextInt(1000);
		int n2 = random.nextInt(2000);
		int n3 = random.nextInt(3000);

		work.process(data, n1, n2, n3);

		System.out.println(String.valueOf(n1) + "+" + String.valueOf(n1) + "+" + String.valueOf(n1) + "="
						+ data.value);

	}
	
	public static void main(String[] args) {
		ThreadPassValue thread = new ThreadPassValue(new Work());
		
		thread.start();
	}

}
