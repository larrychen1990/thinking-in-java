package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise10 {
	public static void main(String[] args) {
		double h = 100;
		double s = 100;

		for (int i = 1; i <= 10; i++) {
			s = s + h;
			h = h / 2;
		}
		System.out.println(s);
		System.out.println(2);

	}
}
