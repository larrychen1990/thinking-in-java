package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// check whether the given NO. is palindrome or not
public class PalindromeNO {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("given any no. not more than 4 digit.");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int A = n / 10;
		int a = n % 10;
		int B = A / 10;
		int b = A % 10;
		int C = B / 10;
		int c = B % 10;

		int x = a * 1000 + b * 100 + c * 10 + C;
		if (n == x) {
			System.out.println("given no. is palindrome");
		} else {
			System.out.println("given no. is not palindrome");
		}

	}
}
