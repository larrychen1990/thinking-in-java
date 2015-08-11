package com.hawk.c01.custom.thread_concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread_Safe {
	
	static class MyCounter {
		private static int counter = 0;

		public static synchronized int getCounter() {
			return counter++;
		}
	}

	static class MyCounter2 {
		private static AtomicInteger counter = new AtomicInteger();

		public static int getCounter() {
			return counter.getAndIncrement();
		}
	}
}
