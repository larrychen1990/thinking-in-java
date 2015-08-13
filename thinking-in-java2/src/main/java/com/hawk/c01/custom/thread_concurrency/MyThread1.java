package com.hawk.c01.custom.thread_concurrency;

public class MyThread1 extends Thread {

	public String methodName;

	public static void method(String s) {
		System.out.println(s);
		while (true)
			;
	}

	public synchronized void method1() {
		method("nonstatic method1");
	}

	public synchronized void method2() {
		method("nonstatic method2");
	}

	public static synchronized void method3() {
		method("static method3");
	}

	public static synchronized void method4() {
		method("static method4");
	}

	@Override
	public void run() {
		try {
			getClass().getMethod(methodName).invoke(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread1 myThread1 = new MyThread1();

		for (int i = 1; i <= 4; i++) {
			myThread1.methodName = "method" + String.valueOf(i);
		}
//		new Thread(myThread1).start();
		myThread1.start();
		sleep(1000);
	}
}
