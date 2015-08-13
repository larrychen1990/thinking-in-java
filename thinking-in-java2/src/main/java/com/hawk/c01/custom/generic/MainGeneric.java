package com.hawk.c01.custom.generic;

class Room2<T> {
	 
	private T t;
 
	public void add(T t) {
		this.t = t;
	}
 
	public T get() {
		return t;
	}
}
 
public class MainGeneric {
	public static void main(String[] args) {
		Room2<Integer> room = new Room2<Integer>();
		room.add(60);
//		room.add("60");	// compile-time error
 
		Integer i = room.get();
		System.out.println(i);
	}
}
