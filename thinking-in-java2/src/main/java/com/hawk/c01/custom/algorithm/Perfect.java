package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// check whether the given no. is perfect or not
public class Perfect {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("give any no.");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s = s + i;
			}
		}
		if (s == n) {
			System.out.println("no. is perfect");
		} else {
			System.out.println("no. is not perfect");
		}

	}
}
