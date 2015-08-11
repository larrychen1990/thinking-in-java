package com.hawk.c01.custom.thread_concurrency;

import java.io.IOException;

public class ThreadInterrupt extends Thread {
	@Override
	public void run() {
		try {
			sleep(1000 * 5);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		Thread thread = new ThreadInterrupt();
		thread.start();
		System.out.println("Press any key to interrupt thread in 5 sec");
		System.in.read();
		thread.interrupt();
		thread.join();
		System.out.println("Thread exit!");

	}
}
