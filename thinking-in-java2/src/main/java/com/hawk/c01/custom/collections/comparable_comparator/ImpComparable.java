package com.hawk.c01.custom.collections.comparable_comparator;

import java.util.Comparator;
import java.util.TreeSet;

//class Dog {
//	int size;
// 
//	Dog(int s) {
//		size = s;
//	}
//
//	@Override
//	public String toString() {
//		return "Dog [size=" + size + "]";
//	}
//	
//}
// 
//class SizeComparator2 implements Comparator<Dog> {
//	public int compare(Dog d1, Dog d2) {
//		return d1.size - d2.size;
//	}
//}
// 
//public class ImpComparable {
//	public static void main(String[] args) {
//		TreeSet<Dog> d = new TreeSet<Dog>(new SizeComparator2()); // pass comparator
//		d.add(new Dog(1));
//		d.add(new Dog(2));
//		d.add(new Dog(1));
//		
//		for (Dog dog : d) {
//			System.out.println(dog);
//		}
//	}
//}


class Dog implements Comparable<Dog>{
	int size;
 
	Dog(int s) {
		size = s;
	}
 
	public int compareTo(Dog o) {
		return this.size - o.size;
	}

	@Override
	public String toString() {
		return "Dog [size=" + size + "]";
	}
	
}
 
public class ImpComparable {
	public static void main(String[] args) {
		TreeSet<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1));
		d.add(new Dog(2));
		d.add(new Dog(1));
		
		for (Dog dog : d) {
			System.out.println(dog);
		}
	}
}