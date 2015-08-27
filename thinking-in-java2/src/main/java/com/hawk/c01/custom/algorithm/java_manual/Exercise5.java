package com.hawk.c01.custom.algorithm.java_manual;


public class Exercise5 {
	public static void main(String[] args) {
		int n = 90;
		String res = "FAILURE";
		res = (n >= 90) ? "A" : n >= 60 ? "B" : "FAILURE";
		System.out.println(res);
	}
}
