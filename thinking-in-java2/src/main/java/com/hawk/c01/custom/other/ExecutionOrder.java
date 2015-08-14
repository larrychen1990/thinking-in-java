package com.hawk.c01.custom.other;

public class ExecutionOrder {
	//instance variable initializer
		String s = "abc";
	 
		//constructor
		public ExecutionOrder() {
			System.out.println("constructor called");
		}
	 
		//static initializer
		static {
			System.out.println("static initializer called");
		}
	 
		//instance initializer
		{
			System.out.println("instance initializer called");
		}
	 
		public static void main(String[] args) {
			new ExecutionOrder();
			new ExecutionOrder();
		}
}
