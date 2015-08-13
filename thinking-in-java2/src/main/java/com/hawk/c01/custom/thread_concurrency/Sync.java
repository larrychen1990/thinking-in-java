package com.hawk.c01.custom.thread_concurrency;

class Test {
	public static synchronized void method() {
		System.out.println("method");
	}
}

public class Sync implements Runnable {
	
	private Test test;

	public void run() {
		test.method();
	}

	public Sync(Test test) {
		this.test = test;
	}
	
	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		
		Sync sync1 = new Sync(test1);
		Sync sync2 = new Sync(test2);
		
		new Thread(sync1).start();
		new Thread(sync2).start();
		
	}
	

}
