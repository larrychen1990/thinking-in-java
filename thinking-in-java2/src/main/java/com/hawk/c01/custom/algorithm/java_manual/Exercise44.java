package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise44 {
	public static void main(String[] args) {
		int n = 6;
		while (n < 100) {
			if (n % 2 == 0) {
				for (int i = 2; i < n; i++) {
					for (int j = 2; j <= i; j++) {
						if (isPrime(i) && isPrime(j)) {
							if (i + j == n) {
								System.out.println(n + "=" + i + "+" + j);
							}
						}
					}
				}
			}
			n++;
		}
	}

	public static boolean isPrime(int num /* num > 1 */) {
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		if (num < 2) {
			flag = false;
		}
		return flag;
	}
}
