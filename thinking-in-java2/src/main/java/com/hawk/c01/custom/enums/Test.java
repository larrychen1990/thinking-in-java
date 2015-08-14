package com.hawk.c01.custom.enums;

public class Test {
	public static void main(String[] args) {
		for (Color color : Color.values()) {
			color.printValue();
			System.out.println(color);
		}
	}
}
