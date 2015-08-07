package com.hawk.c01.custom.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSort {

	public CollectionsSort() {
	}
	
	public static void main(String[] args) {
		double array[] = {111, 111, 1, 23, 456, 231, 1};
		List list = new ArrayList();
		List li = new ArrayList();
		
		for (int i = 0; i < array.length; i++) {
			list.add(new Double(array[i]));
		}
		System.out.println(list);
		
		double arr[] = {111};
		for (int j = 0; j < arr.length; j++) {
			li.add(new Double(arr[j]));
		}
		System.out.println(li);
		
		// Sort
		Collections.sort(list);
		System.out.println(list);
		
		// Shuffing
		Collections.shuffle(list);
		System.out.println(list);
		
		// Reverse
		Collections.reverse(list);
		System.out.println(list);
		
		// Fill i.e. replace
		Collections.fill(li, 1.0);
		System.out.println(li);
		
		// Copy
		List destList = new ArrayList();
		List srcList = new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			destList.add(i);
		}
		for (int i = 20; i < 28; i++) {
			srcList.add(i);
		}
		Collections.copy(destList, srcList);
		System.out.println(destList);
		System.out.println(srcList);
		
		// Min
		Comparable min = Collections.min(list);
		System.out.println(min);
		
		// Max
		Comparable max = Collections.max(list);
		System.out.println(max);
		
		// LastIndexOfSubList
		System.out.println(list);
		System.out.println(li);
		int lastIndexOfSubList = Collections.lastIndexOfSubList(list, li);
		System.out.println(lastIndexOfSubList);
		
		// indexOfSubList
		int indexOfSubList = Collections.indexOfSubList(list, li);
		System.out.println(indexOfSubList);
		
		// Rotate
		System.out.println(srcList);
		Collections.rotate(srcList, -1);
		System.out.println(srcList);
		
		
		
		
		
		
		
	}

}
