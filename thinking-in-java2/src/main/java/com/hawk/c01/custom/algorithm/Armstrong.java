package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// check whether the NO. is armstrong
// (a^3 + b^3 + c^3) = abc
public class Armstrong {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Given any 3 digit number.");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a = n / 100;
		int A = n % 100;
		int b = A / 10;
		int c = A % 10;
		
		int x = a*a*a + b*b*b + c*c*c;
		if (n == x) {
			System.out.println("Given NO. is armstrong.");
		} else {
			System.out.println("Given NO. is not armstrong.");
		}
		
		
	}
}
