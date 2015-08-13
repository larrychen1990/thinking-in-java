package com.hawk.c01.custom.thread_concurrency;

class Singleton {
	private static Singleton sample;
//	private static final Singleton sample = new Singleton();

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		if (sample == null) {
			Thread.yield();
			sample = new Singleton();
		}
		return sample;
	}

}

public class MyThread extends Thread {
	
//	public synchronized int n;	// illegal
	
	public synchronized void method() {}
	synchronized public void method2() {}
//	 public void synchronized method3() {}	// illegal
	public static synchronized void staticMethod() {}
	public synchronized static void staticMethod2() {}
	synchronized public  static void staticMethod3() {}
	
	@Override
	public void run() {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}

	public static void main(String[] args) {
		Thread threads[] = new Thread[5];
		
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread();
		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}

	}
}
