package com.hawk.c01.custom.other;

class A {
	A me(){
		return this;
	}
	
	public void doA(){
		System.out.println("Do A");
	}
}

class B extends A {
	public void doB(){
		System.out.println("Do B");
	}
}

class C extends A{
	public void doBad(){
		System.out.println("Do C");
	}
}

public class StaticTypeCheck {
	
	public static void main(String[] args) {
		A me = new B().me();
		System.out.println(me);
		
//		new B().me().doB();
		
		new B().me().doA();
		
		((B)new B().me()).doB();
		
		((C)new B().me()).doBad();	// ClassCastException
		
		
	}
}
