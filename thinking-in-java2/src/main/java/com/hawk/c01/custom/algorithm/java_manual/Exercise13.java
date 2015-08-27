package com.hawk.c01.custom.algorithm.java_manual;

// Perfect square
public class Exercise13 {
	public static void main(String[] args) {
		int i = 1;
		while (true) {
			if (isPerfectSquare(i+100) && isPerfectSquare(i+268)) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
	
	public static boolean isPerfectSquare(int n){
		boolean flag = false;
		for (int i = 1; i <= n; i++) {
			if (n%i==0 && n/i == i) {
				flag = true;
			}
		}
		return flag;
	}
}
