package com.hawk.c01.custom.collections.overload_override;

public class OverloadingVSOverride {
	public static void main(String[] args) {
		A a = new A();
		a.M(1);
		a.M("abc");
	 
		B b = new B();
		b.M(1234);
		b.M(1234.00D);
	}
}

class A {
	protected void M(int i) {
		System.out.println("int");
	}

	public void M(String s) {
		// this is an overloading method
		System.out.println("string");
	}
}

class B extends A {
	public void M(int i) {
		// this is overriding method
		System.out.println("overriden int");
	}
	public void M(Double d) {
		// this is overriding method
		System.out.println("overload double");
	}
}