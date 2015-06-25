package com.hawk.c01.custom.interview.itfc;

public class Person implements IPerson{
	protected String nameString = "ddddd";

	public Double getSalary() {
		return 7000.0;
	}
	
	public static void main(String[] args) {
		IPerson me = new Person();
		System.out.println(me.COUNTRY);
	}

}
