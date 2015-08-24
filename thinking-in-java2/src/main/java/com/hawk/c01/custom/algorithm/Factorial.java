package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// find out factorial of given no.
public class Factorial {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("give any no.");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f*i;
		}
		System.out.println(f);
	}
}
