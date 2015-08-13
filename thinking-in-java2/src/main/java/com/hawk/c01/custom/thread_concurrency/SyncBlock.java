package com.hawk.c01.custom.thread_concurrency;

public class SyncBlock {
	
	public static SyncBlock instance;
	
	private SyncBlock() {
		instance = this;
	}

	public void method1() {
		synchronized (this) { // equal with use synchronized keyword in the
								// method declaration

		}
	}

	public void method2() {
		synchronized (SyncBlock.this) { // equal with use synchronized keyword
										// in the
			// method declaration

		}
	}

	public synchronized void method3() {

	}

	class InnerClass {
		public void method4() {
			synchronized (SyncBlock.this) { // equal with use synchronized
											// keyword in the
				// method declaration

			}
		}
	}
	
	static class Test{
		public static void method() {	// sync this static method with SyncBlock's static methods
			synchronized (SyncBlock.class) {
				
			}
		}
		
	}
	
	public static void method5() {
		synchronized (instance.getClass()) { // equal with use synchronized keyword
			// in the
			// method declaration
			
		}
	}
	
	public static synchronized void method6() {
		
	}
	
	
}
