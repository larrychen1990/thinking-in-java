package com.hawk.c01.custom.algorithm;

// print all prime numbers in between 1 and 20
public class PrimeNO {
	public static void main(String[] args) {
		for (int i = 2; i <= 20; i++) {
			int flag = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = flag + 1;
				}
			}
			if (flag == 0) {
				System.out.println("prime no." + i);
			}
		}
	}
}
