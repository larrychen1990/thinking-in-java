package com.hawk.c01.custom.collections;

import java.util.HashSet;
import java.util.Set;

public class FindDups2 {
	public static void main(String[] args) {

		String[] strings = new String[] { "a", "a", "a", "c", "c", "b", "b", "e" };

		Set<String> uniques = new HashSet<String>();
		Set<String> dups = new HashSet<String>();

		for (String a : strings)
			if (!uniques.add(a))
				dups.add(a);

		// Destructive set-difference
		uniques.removeAll(dups);

		System.out.println("Unique words:    " + uniques);
		System.out.println("Duplicate words: " + dups);
	}
}
