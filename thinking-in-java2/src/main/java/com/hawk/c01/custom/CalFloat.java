package com.hawk.c01.custom;

import java.math.BigDecimal;

public class CalFloat {
	public static void main(String[] args) {
		//不精确
		System.out.println(0.05 + 0.01);
		System.out.println(1.0 - 0.42);
		System.out.println(4.015 * 100);
		System.out.println(123.3 / 100);

		//BigDecimal
		BigDecimal bd1 = new BigDecimal(0.05);
		System.out.println(bd1.toString());
		BigDecimal bd2 = new BigDecimal("0.05");
		System.out.println(bd2.toString());
		System.out.println(bd1.add(bd2));
		
		System.out.println(BigDecimal.valueOf(0.05));
		
		//format
		System.out.println(new java.text.DecimalFormat("0.00").format(3.125));
		System.out.println(new java.text.DecimalFormat("0.00").format(3.135));
	}
}
