package com.hawk.c01.custom.algorithm.java_manual;

import java.util.Scanner;

public class Exercise12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			Scanner in = new Scanner(System.in);
			double l = in.nextDouble();
			double bonus = 0.0;
			if (l <= 10) {
				bonus = l * 0.1;
			} else if (l > 10 && l <= 20) {
				bonus = 10 * 0.1 + (l - 10) * 0.075;
			} else if (l > 20 && l <= 40) {
				bonus = 10 * 0.1 + (l - 20) * 0.05;
			} else if (l > 40 && l <= 60) {
				bonus = 10 * 0.1 + 20 * 0.075 + (l - 40) * 0.03;
			} else if (l > 60 && l <= 100) {
				bonus = 10 * 0.1 + 20 * 0.075 + 20 * 0.03 + (l - 60) * 0.015;
			} else if (l > 100) {
				bonus = 10 * 0.1 + 20 * 0.075 + 20 * 0.03 + 40 * 0.015 + (l - 100) * 0.01;
			}
			System.out.println("bonus:" + bonus);
		}
	}
}
