package com.hawk.c01.custom.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenericSet {
	public static void main(String[] args) {
		HashSet<Integer> s1 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		printSet(s1);
	 
		HashSet<String> s2 = new HashSet<String>(Arrays.asList("a", "b", "c"));
		printSet(s2);
	}
	
	public static void printSet(Set<?> s /* generic make the list immutable */){
		for (Object o : s) {
			System.out.println(o);
		}
	}
}
