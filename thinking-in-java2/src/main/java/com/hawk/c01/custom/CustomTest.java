package com.hawk.c01.custom;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class CustomTest {

	@Test
	@Ignore
	public void testArrayClass() {
		int[] arr = new int[3];
		System.out.println(arr.getClass());
		String[] str = new String[3];
		System.out.println(str.getClass());
		boolean[] boo = new boolean[3];
		System.out.println(boo.getClass());
	}

	@Test
	public void testFib() {
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
	}

	public int fib(int n) {
		int fib = 0;
		int a = 1;
		int temp;
		for (int i = 0; i < n; i++) {
			temp = fib + a;
			a = fib;
			fib = temp;
		}
		return fib;
	}
}
