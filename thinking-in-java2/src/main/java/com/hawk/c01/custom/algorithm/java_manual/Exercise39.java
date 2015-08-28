package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise39 {
	public static void main(String[] args) {
		int n = 8;
		double sum = 0;
		if (n % 2 == 0) {
			for (int i = 2; i <= n; i += 2) {
				sum = sum + (double)1 / i;
			}
			System.out.println("even "+sum);
		} else if (n % 2 != 0) {
			for (int i = 1; i <= n; i += 2) {
				sum = sum + (double)1 / i;
			}
			System.out.println("odd "+sum);
		}
	}
}
