package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise19 {
	public static void main(String[] args) {
		//another simple way * k<(i+1)*2
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < i+1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 4-i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 4-i-1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
