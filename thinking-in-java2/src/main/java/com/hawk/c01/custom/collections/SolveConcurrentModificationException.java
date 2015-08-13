package com.hawk.c01.custom.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class SolveConcurrentModificationException {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		
//		for (String string : list) {
//			if (string.equals("B")) {
//				list.remove(string);	// java.util.ConcurrentModificationException
//			}
//		}
		System.out.println(list);
		
//		Solution 1
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			if (string.equals("B")) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
//		Solution 2
		list = new CopyOnWriteArrayList<String>();
		list.add("A");
		list.add("B");
		
		for (String string : list) {
			if (string.equals("B")) {
				list.remove(string);	
			}
		}
		System.out.println(list);
		
		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
	 
		for (String s : set) {
			if (s.equals("B")) {
				set.remove(s);
			}
		}
		System.out.println(set);
		
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("A");
		llist.add("B");
	 
		for (String s : llist) {
			if (s.equals("B")) {
				llist.remove(s);
			}
		}
		System.out.println(llist);
		
	}
}
