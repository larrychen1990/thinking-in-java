package com.hawk.c01.custom.algorithm;

// print the fibonachi series.
public class Fibonachi {
	public static void main(String[] args) {
		int a = 0;
		System.out.println(a);
		int b = 1;
		for (int i = 0; i < 5; i++) {
			b = a + b;
			a = a + b;
			System.out.println(b);
			System.out.println(a);
		}

	}
}
