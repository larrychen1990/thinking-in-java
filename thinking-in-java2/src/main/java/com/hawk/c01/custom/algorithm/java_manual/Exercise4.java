package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise4 {
	public static void main(String[] args) {
		int n = 90;
		int k = 2;

		System.out.print(n + "=");
		while (k <= n) {
			if (k == n) {
				System.out.print(k);
				break;
			} else if (n % k == 0) {
				System.out.print(k + "*");
				n = n / k;
			} else {
				k++;
			}
		}
	}

}
