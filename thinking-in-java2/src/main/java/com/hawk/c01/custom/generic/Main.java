package com.hawk.c01.custom.generic;

class Room {
	 
	private Object object;
 
	public void add(Object object) {
		this.object = object;
	}
 
	public Object get() {
		return object;
	}
}
 
public class Main {
	public static void main(String[] args) {
		Room room = new Room();
		room.add(60);
//		room.add("60"); //this will cause a run-time error
		Integer i = (Integer)room.get();
		System.out.println(i);
//		String i = (String)room.get();
//		System.out.println(i);
	}
}
