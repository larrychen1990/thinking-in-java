package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise48 {
	public static void main(String[] args) {
		int m = 1234;

		// split
		int q = m / 1000;
		int Q = m % 1000;
		int b = Q / 100;
		int B = Q % 100;
		int s = B / 10;
		int g = B % 10;

		// swap
		q = (q + 5) % 10;
		b = (b + 5) % 10;
		s = (s + 5) % 10;
		g = (g + 5) % 10;

		// composit
		int mm = g * 1000 + b * 100 + s * 10 + q;
		
		System.out.println(mm);

	}
}
