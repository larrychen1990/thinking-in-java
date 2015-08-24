package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// check whether the given string is palindrome or not
public class PalindromeString {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter any String: ");
		
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		StringBuilder sb = new StringBuilder();
		
		int n = s1.length();
		
		for (int i = n-1; i >= 0; i--) {
			char c = s1.charAt(i);
			sb.append(c);
		}
		
		if (s1.equals(sb.toString())) {
			System.out.println("given String is palindrome");
		} else {
			System.out.println("given String is not palindrome");
		}
		
		
	}
}
