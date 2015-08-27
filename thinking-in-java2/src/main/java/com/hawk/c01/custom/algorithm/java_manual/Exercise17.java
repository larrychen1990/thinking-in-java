package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise17 {
	public static void main(String[] args) {
		int n = 1;
		while (true) {
			int t = n;
			for (int j = 1; j < 10; j++) {
				n = n / 2 - 1;
			}
			if (n == 1) {
				System.out.println(t);
				break;
			}

			n = t;
			n++;
		}

		int x = 1;
		for (int i = 2; i <= 10; i++) {
			x = (x + 1) * 2;
		}
		System.out.println(x);
	}
}
