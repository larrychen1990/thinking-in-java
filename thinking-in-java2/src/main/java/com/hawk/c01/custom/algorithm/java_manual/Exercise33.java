package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise33 {
	public static void main(String[] args) {
		int[][] a = new int[10][10];

		for (int i = 0; i < a.length; i++) {
			a[i][i] = 1;
			a[i][0] = 1;
		}

		for (int i = 2; i < a.length; i++) {
			for (int j = 1; j < i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < 2 * (10 - i) - 1; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
			}
			for (int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}
}
