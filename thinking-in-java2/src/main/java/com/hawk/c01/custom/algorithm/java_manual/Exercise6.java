package com.hawk.c01.custom.algorithm.java_manual;

import java.util.Scanner;

public class Exercise6 {
	private static Scanner s;

	public static void main(String[] args) {
		int a, b, m;
		s = new Scanner(System.in);

		System.out.println("pls input an integer: ");
		a = s.nextInt();

		System.out.println("pls input another integer: ");
		b = s.nextInt();

		Deff cd = new Deff();
		m = cd.deff(a, b);

		int n = a * b / m;

		System.out.println("最大公约数：" + m);
		System.out.println("最小公倍数：" + n);

	}
}

class Deff {
	public int deff(int x, int y) {
		int t;
		// ensure x > y
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}

		while (y != 0) {
			if (x == y) {
				return x;
			} else {
				int k = x % y;
				x = y;
				y = k;
			}
		}

		return x;
	}
}
