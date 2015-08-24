package com.hawk.c01.custom.algorithm;


// print the pattern
//1
//2 3
//4 5 6
//7 8 9 10
public class Pattern3 {
	public static void main(String[] args) {
		int n = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(n +" ");
				n++;
			}
			System.out.print("\n");
		}
	}
}
