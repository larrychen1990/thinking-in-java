package com.hawk.c01.custom.algorithm.java_manual;

import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int n = in.nextInt();
			int count = 0;
			while (n > 8) {
				if (n % 9 == 0) {
					n = n / 9;
					count++;
				}else {
					break;
				}
			}
			System.out.println(count);
			
			if (n == -1) {
				break;
			}
		}

	}
}
