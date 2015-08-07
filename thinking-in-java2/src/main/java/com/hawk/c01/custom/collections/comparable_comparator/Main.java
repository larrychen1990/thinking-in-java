package com.hawk.c01.custom.collections.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		HDTV2 tv1 = new HDTV2(55, "Samsung");
		HDTV2 tv2 = new HDTV2(60, "Sony");
		HDTV2 tv3 = new HDTV2(42, "Panasonic");

		ArrayList<HDTV2> al = new ArrayList<HDTV2>();
		al.add(tv1);
		al.add(tv2);
		al.add(tv3);

		Collections.sort(al, new SizeComparator());
		for (HDTV2 a : al) {
			System.out.println(a.getBrand());
		}
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(1);
		a.add(2);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		 
		Comparator<Integer> comparator = Collections.reverseOrder();
		Collections.sort(a,comparator);
		System.out.println(a);
		
	}
}

class HDTV2 {
	private int size;
	private String brand;

	public HDTV2(int size, String brand) {
		this.size = size;
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}

class SizeComparator implements Comparator<HDTV2> {
	public int compare(HDTV2 tv1, HDTV2 tv2) {
		int tv1Size = tv1.getSize();
		int tv2Size = tv2.getSize();

		if (tv1Size > tv2Size) {
			return 1;
		} else if (tv1Size < tv2Size) {
			return -1;
		} else {
			return 0;
		}
	}
}