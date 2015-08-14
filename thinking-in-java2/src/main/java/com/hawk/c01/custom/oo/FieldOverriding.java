package com.hawk.c01.custom.oo;

/*
 * Within a class, a field that has the same name as a field in the superclass hides the superclass's field, 
 * even if their types are different. Within the subclass, the field in the superclass cannot be referenced
 *  by its simple name. Instead, the field must be accessed through super. Generally speaking, we don't 
 *  recommend hiding fields as it makes code difficult to read
 * 
 * */

class Super {
	String s = "Super";
	String ss = "Super ss";
}
 
class Sub extends Super {
	String s = "Sub";
}
 
public class FieldOverriding {
	public static void main(String[] args) {
		Sub c1 = new Sub();
		System.out.println(c1.s);
		System.out.println(((Super)c1).s);
		System.out.println(c1.ss);
 
		Super c2 = new Sub();
		System.out.println(c2.s);
	}
}