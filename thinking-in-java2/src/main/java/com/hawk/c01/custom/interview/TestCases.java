package com.hawk.c01.custom.interview;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class TestCases {

	@Test
	@Ignore
	public void test1() {
		int i = 2;
		long l = 3333333L;
		System.out.println(i + l);

		byte b = 127;
		byte c = 4;
		byte d = (byte) (b + c);
		System.out.println(d);

		double dd = 9.9;
		double ddd = dd + i;
		System.out.println(ddd);

	}

	@Test
	public void test2() {
		String input = "1 2 a 3 45 6";
		Scanner sc = new Scanner(input);
		int x = 0;

//		do {
//			x = sc.nextInt();
//			System.out.println(x + " ");
//		} while (x != 0);
		
		while (sc.hasNextInt()) {
			x = sc.nextInt();
			System.out.println(x + " ");
		}

	}
}
