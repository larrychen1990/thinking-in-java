package com.hawk.c01.custom.thread_concurrency;

public class SyncThread extends Thread {

	private static final String sync = "";
	private String methodType = "";

	private static void method(String s) {
		System.out.println(12);
		synchronized (sync) {
//			sync = s;
			System.out.println(s);
			while (true);
		}
	}

	public void method1() {
		method("method1");
	}

	public static void staticMethod1() {
		method("staticMethod1");
	}

	@Override
	public void run() {
		if (methodType.equals("static")) {
			staticMethod1();
		} else if(methodType.equals("nonstatic")){
			method1();
		}
	}

	public SyncThread(String methodType) {
		this.methodType = methodType;
	}
	
	public static void main(String[] args) {
		SyncThread sample1 = new SyncThread("nonstatic");
		SyncThread sample2 = new SyncThread("static");
		
		sample1.start();
		sample2.start();
	}
	
	
}
