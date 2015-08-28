package com.hawk.c01.custom.algorithm.java_manual;

import java.util.Scanner;

public class Exercise47 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 1;
		while (n <= 7) {
			int num = in.nextInt();

			if (num >= 1 && num <= 50) {
				for (int i = 0; i < num; i++) {
					System.out.print("*");
				}
			}
			n++;

		}
	}
}
