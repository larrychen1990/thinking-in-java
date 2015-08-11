package com.hawk.c01.custom.thread_concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Volatile {

//	public static volatile int a = 0;
	 public static volatile  AtomicInteger a = new AtomicInteger(0);
	public static void main(String args[]) throws InterruptedException {

		List<Thread> list = new ArrayList<Thread>();
		for (int i = 0; i < 11; i++) {
			list.add(new Pojo());
		}

		for (Thread thread : list) {
			thread.start();
		}

		
//		new Pojo().start();
		Thread.sleep(20000);
		System.out.println(a);
	}
}

class Pojo extends Thread {
	int a = 10001;

	public void run() {
		while (a-- > 0) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			Volatile.a++;
//			System.out.println("a = " + Volatile.a);
			
			Volatile.a.decrementAndGet();
			System.out.println("a = "+Volatile.a);
		}
	}
}
