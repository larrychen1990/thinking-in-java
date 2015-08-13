package com.hawk.c01.custom.collections;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Ignore;
import org.junit.Test;

public class EfficientCounter {
	private String s = "one two three two three three";
	private String[] sArr = s.split(" ");
	
	private static final int NUM_ITERATIONS = 1000000;

	@Test
	@Ignore
	public void naiveCounter() {

		// naive approach
		HashMap<String, Integer> counter = new HashMap<String, Integer>();

		for (String a : sArr) {
			if (counter.containsKey(a)) {
				int oldValue = counter.get(a);
				counter.put(a, oldValue + 1);
			} else {
				counter.put(a, 1);
			}
		}

		System.out.println(counter);
	}

	@Test
	@Ignore
	public void betterCounter() {
		HashMap<String, MutableInteger> counter = new HashMap<String, MutableInteger>();

		for (String a : sArr) {
			if (counter.containsKey(a)) {
				MutableInteger oldValue = counter.get(a);
				oldValue.set(oldValue.get() + 1);
			} else {
				counter.put(a, new MutableInteger(1));
			}
		}

		System.out.println(counter);
	}

	@Test
	@Ignore
	public void efficientCounter() {
		HashMap<String, MutableInteger> counter = new HashMap<String, MutableInteger>();

		for (String a : sArr) {
			MutableInteger initValue = new MutableInteger(1);
			MutableInteger oldValue = counter.put(a, initValue);

			if (oldValue != null) {
				initValue.set(oldValue.get() + 1);
			}
		}

		System.out.println(counter);
	}

	@Test
	public void performanceDifference() {
		 
		long startTime = 0;
		long endTime = 0;
		long duration = 0;
		 
		// naive approach
		startTime = System.nanoTime();
		HashMap<String, Integer> counter = new HashMap<String, Integer>();
		 
		for (int i = 0; i < NUM_ITERATIONS; i++)
			for (String a : sArr) {
				if (counter.containsKey(a)) {
					int oldValue = counter.get(a);
					counter.put(a, oldValue + 1);
				} else {
					counter.put(a, 1);
				}
			}
		 
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Naive Approach :  \t" + duration);
		 
		// better approach
		startTime = System.nanoTime();
		HashMap<String, MutableInteger> newCounter = new HashMap<String, MutableInteger>();
		 
		for (int i = 0; i < NUM_ITERATIONS; i++)
			for (String a : sArr) {
				if (newCounter.containsKey(a)) {
					MutableInteger oldValue = newCounter.get(a);
					oldValue.set(oldValue.get() + 1);
				} else {
					newCounter.put(a, new MutableInteger(1));
				}
			}
		 
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Better Approach:  \t" + duration);
		 
		// efficient approach
		startTime = System.nanoTime();
		 
		HashMap<String, MutableInteger> efficientCounter = new HashMap<String, MutableInteger>();
		 
		for (int i = 0; i < NUM_ITERATIONS; i++)
			for (String a : sArr) {
				MutableInteger initValue = new MutableInteger(1);
				MutableInteger oldValue = efficientCounter.put(a, initValue);
		 
				if (oldValue != null) {
					initValue.set(oldValue.get() + 1);
				}
			}
		 
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("Efficient Approach:  \t" + duration);
		
		// without containsKey
		startTime = System.nanoTime();
		
		HashMap<String, MutableInteger> efficientCounter2 = new HashMap<String, MutableInteger>();
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			for (String a : sArr) {
				MutableInteger value = efficientCounter2.get(a);
		 
				if (value != null) {
					value.set(value.get() + 1);
				} else {
					efficientCounter2.put(a, new MutableInteger(1));
				}
			}
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("without containsKey:  \t" + duration);
		
		// without containsKey, with AtomicInteger
		startTime = System.nanoTime();
		
		HashMap<String, AtomicInteger> atomicCounter = new HashMap<String, AtomicInteger>();
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			for (String a : sArr) {
				AtomicInteger value = atomicCounter.get(a);
		 
				if (value != null) {
					value.incrementAndGet();
				} else {
					atomicCounter.put(a, new AtomicInteger(1));
				}
			}
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("with AtomicInteger:  \t" + duration);
		
		// without containsKey, with int[]
		startTime = System.nanoTime();
		
		HashMap<String, int[]> intCounter = new HashMap<String, int[]>();
		for (int i = 0; i < NUM_ITERATIONS; i++) {
			for (String a : sArr) {
				int[] valueWrapper = intCounter.get(a);
		 
				if (valueWrapper == null) {
					intCounter.put(a, new int[] { 1 });
				} else {
					valueWrapper[0]++;
				}
			}
		}
		
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("with int[]:  \t" + duration);
		
	}
}

class MutableInteger {
	private int val;

	public MutableInteger(int val) {
		this.val = val;
	}

	public int get() {
		return val;
	}

	public void set(int val) {
		this.val = val;
	}

	@Override
	public String toString() {
		// return String.valueOf(val);
		return Integer.toString(val);
	}

}
