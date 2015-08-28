package com.hawk.c01.custom.algorithm.java_manual;

import edu.emory.mathcs.backport.java.util.Arrays;

public class Exercise40 {
	public static void main(String[] args) {
		// String s[] = { "matter", "state", "solid", "liquid", "gas" };
		String s[] = { "b", "a", "c", "cbb", "caa" };

		int n = s.length;
		for (int i = 0; i < n - 1; i++) {
			String temp = s[i];
			for (int j = i + 1; j < s.length; j++) {
				if (compare(temp, s[j]) == false) {
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static boolean compare(String s1, String s2) {
		boolean res = true;

		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				res = false;
				break;
			} else if (s1.charAt(i) < s2.charAt(i)) {
				res = true;
				break;
			} else {
				if (s1.length() < s2.length()) {
					res = true;
				} else {
					res = false;
				}
			}
		}

		return res;
	}
}
