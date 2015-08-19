package com.hawk.c01.custom.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class Test {
	// private static final Map map;
	// static {
	// map = new HashMap();
	// map.put(1, "one");
	// map.put(2, "two");
	// }
	// public static void main(String[] args) {
	// System.out.println(map);
	// map.put(3, "three");
	// System.out.println(map);
	// }

	private static final Map map;
	static {
		Map aMap = new HashMap();
		aMap.put(1, "one");
		aMap.put(2, "two");
		map = Collections.unmodifiableMap(aMap);
		System.out.println("static");
	}
	

	public Test() {
	System.out.println("cons");
	}

	public static void main(String[] args) {
		System.out.println(map);
		// map.put(3, "three"); // throw UnsupportedOperationException
		// System.out.println(map);

		System.out.println(Character.isDigit('2'));

		Pattern p = Pattern.compile("[A-Z]*");

		System.out.println(p.matcher("ABCD").matches());

		// ArrayList<E>
		// System.arraycopy(src, srcPos, dest, destPos, length);

		Queue<Integer> queue = new LinkedBlockingDeque<Integer>();

		for (int i = 0; i < 5; i++) {
			queue.offer(i);
		}
		for(Integer i : queue){
			System.out.println(i);
		}
		System.out.println(queue);
		while (queue.peek() != null) {
			System.out.println(queue.poll());
		}
		System.out.println(queue);
		
		System.out.println(0x10 + 10 + 010); 
		
		
		Test test = new Test();
		
		String[] stringArray = { "a", "b", "c", "d", "e" };
		System.out.println(Arrays.toString(stringArray));
		System.out.println(stringArray.toString());

		
		System.out.println(Arrays.binarySearch(stringArray, "a"));
		
		String join = StringUtils.join(stringArray, ".");
		System.out.println(join);
		
	}
	
	{
		{
			System.out.println("a ha");
		}
	}
}
