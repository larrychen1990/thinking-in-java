package com.hawk.c01.custom.generic;

import java.util.ArrayList;

public class CommonMistake {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");

		accept(al);
	}

	private static void accept(ArrayList<String> al) {
		for (Object o : al)
			System.out.println(o);

	}
}
