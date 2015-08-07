package com.hawk.c01.custom.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hashtable_Enumeration {
	public static void main(String[] args) {
		Hashtable hash = new Hashtable();
		hash.put(1, "one");
		hash.put(2, "two");
		hash.put(3, "three");
		
		System.out.println(hash);
		
		Enumeration enumkey = hash.keys();
		while (enumkey.hasMoreElements()) {
			Integer key = (Integer) enumkey.nextElement();
			System.out.println("key = " + key);
			Object valueObject = hash.get(key);
			System.out.println("value = " + valueObject);
			if (key.equals(2)) {
				hash.remove(key);
			}
		}
		System.out.println(hash);
		
	}
}
