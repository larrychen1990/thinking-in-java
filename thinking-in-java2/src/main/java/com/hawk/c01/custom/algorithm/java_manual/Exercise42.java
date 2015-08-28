package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise42 {
	public static void main(String[] args) {
		for (int i = 10; i < 100; i++) {
			if (809 * i == (800 * i + 9 * i)) {
				if (8 * i >= 10 && 8 * i < 100) {
					if (9 * i >= 100 && 9 * i < 1000) {
						System.out.println(i);
						System.out.println(809 * i);
					}
				}

			}
		}
	}
}
