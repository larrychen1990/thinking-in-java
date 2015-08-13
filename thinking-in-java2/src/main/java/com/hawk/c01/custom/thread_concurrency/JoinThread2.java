package com.hawk.c01.custom.thread_concurrency;

public class JoinThread2 extends Thread {

	public static volatile int n = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				n = n + 1;
				sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread threads[] = new Thread[100];

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new JoinThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

		for (int i = 0; i < threads.length; i++) {
			// go on after 100 threads' end
			threads[i].join();
		}
		System.out.println("n = " + JoinThread.n);
	}
}
