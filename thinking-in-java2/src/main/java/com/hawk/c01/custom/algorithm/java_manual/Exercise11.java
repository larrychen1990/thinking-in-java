package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise11 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int j2 = 1; j2 <= 4; j2++) {
					if (i != j && i != j2 && j != j2) {
						++count;
						int num = i * 100 + j * 10 + j2;
						System.out.println(num);
					}
				}
			}
		}
		System.out.println(count);
	}
}
