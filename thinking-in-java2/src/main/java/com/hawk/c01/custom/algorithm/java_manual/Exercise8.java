package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise8 {
	public static void main(String[] args) {
		int n = 2;
		int times = 5;

		int sum = 0;
		// for (int i = times; i > 0; i--) {
		// sum += n*i*Math.pow(10, times-i);
		// }

		int i = 0;
		int b = 0;
		while (i < times) {
			b = b + n;

			sum += b;

			n = n * 10;
			++i;
		}

		System.out.println(sum);
	}
}
