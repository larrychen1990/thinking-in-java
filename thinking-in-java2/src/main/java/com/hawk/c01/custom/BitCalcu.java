package com.hawk.c01.custom;

public class BitCalcu {
	public int singleNumber(int[] A) {
		int total = 0;
		for (int a : A) {
			total ^= a;
		}

		return total;
	}
	
	public static void main(String[] args) {
		BitCalcu bc=new BitCalcu();
		int[] i=new int[]{1,2,3,2,2,3,3};
		
		
		System.out.println(bc.singleNumber(i));
	}
}
