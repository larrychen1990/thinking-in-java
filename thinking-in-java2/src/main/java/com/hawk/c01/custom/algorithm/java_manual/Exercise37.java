package com.hawk.c01.custom.algorithm.java_manual;

public class Exercise37 {
	public static void main(String[] args) {
		int n = 3;

		boolean a[] = new boolean[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = true;
		}

		int leftCount = n;
		int countNumber = 1;
		int index = 0;
		while (leftCount > 1) {
			if (a[index] == true) {
				if (countNumber == 3) {
					countNumber = 0;
					a[index] = false;
					leftCount--;
				}
				countNumber++;
			}
			index++;
			if (index == n) {
				index = 0;
			}
		}
		System.out.println(index + 1);
	}
}
