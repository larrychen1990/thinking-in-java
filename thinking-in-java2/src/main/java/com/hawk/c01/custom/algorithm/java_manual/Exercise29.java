package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise29 {
	public static void main(String[] args) {
		int[][] c = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				if (i == j) {
					sum = sum + c[i][j];
				}

				if (i == 0 && j == c.length - 1 || j == 0 && i == c[i].length - 1) {
					sum = sum + c[i][j];
				}
			}
		}
		System.out.println(sum);

	}
}
