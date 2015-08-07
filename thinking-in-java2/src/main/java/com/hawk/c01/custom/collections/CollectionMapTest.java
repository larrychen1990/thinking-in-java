package com.hawk.c01.custom.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @author
 *
 */
@FixMethodOrder(MethodSorters.JVM)
public class CollectionMapTest {
	@Test
	@Ignore
	public void testVector() {
		Vector<Object> v = new Vector<Object>();
		v.add(1);
		v.add(1);
		v.add(null);
		v.add(null);
		v.add(0, "index");
		v.addElement("element");
		Object clone = v.clone();

		System.out.println("clone : " + clone);
		System.out.println("v : " + v);

		System.out.println("initial capacity: " + v.capacity());
		v.ensureCapacity(20);
		System.out.println("after capacity: " + v.capacity());
		System.out.println(v.size());

		System.out.println("contains : " + v.contains(null));
		Object[] object = new Object[20];

		v.copyInto(object);
		System.out.println(v);
		System.out.println(object);

		System.out.println(v.equals(object));

		System.out.println(v.firstElement());
		System.out.println(v);
		v.trimToSize();
		System.out.println(v.capacity());

		Vector vector = new Vector();
		vector.add(1);
		Object[] array = vector.toArray();
		System.out.println(array);
		Object[] array2 = vector.toArray(new Integer[6]);
		System.out.println(array2);

		ListIterator<Object> listIterator = v.listIterator();
		Object removed = listIterator.next();
		listIterator.remove();
		System.out.println("removed : " + removed);
		while (listIterator.hasNext()) {
			System.out.println(listIterator.nextIndex() + " : " + listIterator.next());
		}

		List<Object> subList = v.subList(0, 3);
		System.out.println(subList);
		subList.set(0, "set");
		System.out.println(subList);
		System.out.println(v);

	}

	@Test
	@Ignore
	public void testLinkedList() {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		list.addFirst("first");
		list.addLast("last");
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);

	}

	/***
	 * TreeSet is sorted How to iterate a TreeSet How to check empty How to
	 * retrieve first/last element How to remove an element
	 */

	@Test
	@Ignore
	public void testSet() {
		System.out.println("Tree Set Example!\n");
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(5);
		tree.add(3);

		System.out.print("Tree set data: ");

		Iterator<Integer> it = tree.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();

		if (tree.isEmpty()) {
			System.out.println("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: " + tree.size());
		}

		System.out.println("Last data : " + tree.last());

		if (tree.remove(5)) { // remove element by value
			System.out.println("Data is removed from tree set");
		} else {
			System.out.println("Data doesn't exist!");
		}
		System.out.print("Now the tree set contain: ");
		it = tree.iterator();

		// Displaying the Tree set data
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("Now the size of tree set: " + tree.size());

		System.out.println("ceiling : " + tree.ceiling(2));
		System.out.println("comparator : " + tree.comparator());

		NavigableSet<Integer> descendingSet = tree.descendingSet();

		SortedSet<Integer> headSet = tree.headSet(2, true);
		System.out.println("headSet : " + headSet);

		// Remove all
		tree.clear();
		if (tree.isEmpty()) {
			System.out.println("Tree Set is empty.");
		} else {
			System.out.println("Tree Set size: " + tree.size());
		}

		TreeSet<Dog> dSet = new TreeSet<Dog>();
		dSet.add(new Dog(2));
		dSet.add(new Dog(1));
		dSet.add(new Dog(3));
		System.out.println(dSet);

	}

	@Test
	@Ignore
	public void testHashSet() {
		HashSet<Dog> dset = new HashSet<Dog>();
		dset.add(new Dog(2));
		dset.add(new Dog(1));
		dset.add(new Dog(3));
		dset.add(new Dog(5));
		dset.add(new Dog(4));
		Iterator<Dog> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	@Test
	@Ignore
	public void testLinkedHashSet() {
		LinkedHashSet<Dog> dset = new LinkedHashSet<Dog>();
		dset.add(new Dog(2));
		dset.add(new Dog(1));
		dset.add(new Dog(3));
		dset.add(new Dog(5));
		dset.add(new Dog(4));
		Iterator<Dog> iterator = dset.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
	}

	@Test
	@Ignore
	public void testSetPerformance() {

		Random r = new Random();

		HashSet<Dog> hashSet = new HashSet<Dog>(); // 11161754
		TreeSet<Dog> treeSet = new TreeSet<Dog>(); // 3046198
		LinkedHashSet<Dog> linkedSet = new LinkedHashSet<Dog>(); // 974146

		// start time
		long startTime = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			hashSet.add(new Dog(x));
		}
		// end time
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("HashSet: \t" + duration);

		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			treeSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("TreeSet: \t" + duration);

		// start time
		startTime = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			int x = r.nextInt(1000 - 10) + 10;
			linkedSet.add(new Dog(x));
		}
		// end time
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedHashSet: \t" + duration);
	}

	@Test
	@Ignore
	public void testListPerformance() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// ArrayList add
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			arrayList.add(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println("ArrayList add: \t" + duration);

		// LinkedList add
		startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			linkedList.add(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList add: \t" + duration);

		// ArrayList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			arrayList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList get: \t" + duration);

		// LinkedList get
		startTime = System.nanoTime();

		for (int i = 0; i < 10000; i++) {
			linkedList.get(i);
		}
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList get: \t" + duration);

		// ArrayList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			arrayList.remove(i);
		}
		// for (int i = 0; i < 10000; i++) {
		// arrayList.remove(i);
		// }
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("ArrayList remove: \t" + duration);

		// LinkedList remove
		startTime = System.nanoTime();

		for (int i = 9999; i >= 0; i--) {
			linkedList.remove(i);
		}
		// for (int i = 0; i < 10000; i++) {
		// linkedList.remove(i);
		// }
		endTime = System.nanoTime();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: \t" + duration);
	}

	@Test
	@Ignore
	public void testHashMap() {
		HashMap<Dog2, Integer> hashMap = new HashMap<Dog2, Integer>();
		Dog2 d1 = new Dog2("red");
		Dog2 d2 = new Dog2("black");
		Dog2 d3 = new Dog2("white");
		Dog2 d4 = new Dog2("white");
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);

		// print size
		System.out.println(hashMap);
		System.out.println(hashMap.size());

		Set<Entry<Dog2, Integer>> entrySet = hashMap.entrySet();
		for (Entry<Dog2, Integer> entry : entrySet) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}

	@Test
	@Ignore
	public void testTreeMap() {
		Dog2 d1 = new Dog2("red");
		Dog2 d2 = new Dog2("black");
		Dog2 d3 = new Dog2("white");
		Dog2 d4 = new Dog2("white");

		TreeMap<Dog2, Integer> treeMap = new TreeMap<Dog2, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);

		for (Entry<Dog2, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

	@Test
	@Ignore
	public void testOther() {
		List<Object> emptyList = Collections.emptyList();
		System.out.println(emptyList);

		Object[] objects = new Object[5];
		for (int i = 0; i < objects.length; i++) {
			objects[i] = i;
		}
		System.out.println(objects);

		change(objects);
		System.out.println(objects);

		Integer i = 1;
		changeInt(integer);
		System.out.println(integer);

		List<Integer> list = new ArrayList<Integer>(20);
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println(list);
		System.out.println(list2);
		list.add(5);
		ArrayList<Integer> list3 = new ArrayList<Integer>(list2.size());
		list3.add(9);
		list3.add(9);
		list3.add(9);
		Collections.copy(list3, list2);
		System.out.println(list3);

		// System.arraycopy(src, srcPos, dest, destPos, length);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "1v");
		map.put(2, "2v");
		map.put(3, "3v");
		map.put(null, "null");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		List li = new ArrayList(entrySet);
		System.out.println("list entrySet" + li);

		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		System.out.println(map.containsKey(null));

		Collection<String> values = map.values();
		System.out.println(values);
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Integer key = iterator.next().getKey();
			System.out.println(key + ":" + map.get(key));
		}

		int identityHashCode = System.identityHashCode(2);
		System.out.println(identityHashCode);
		System.out.println(System.identityHashCode(2));
		
	}

	@Test
	@Ignore
	public void testIdentityHashMap() {
		  IdentityHashMap<String, String> identityMap = new IdentityHashMap<String, String>();
	      
	        identityMap.put("sony", "bravia");
	        identityMap.put(new String("sony"), "mobile");
	      
	        //size of identityMap should be 2 here because two strings are different objects
	        System.out.println("Size of IdentityHashMap: " + identityMap.size());
	        System.out.println("IdentityHashMap: " + identityMap);
	      
	        identityMap.put("sony", "videogame");
	      
	         //size of identityMap still should be 2 because "sony" and "sony" is same object
	        System.out.println("Size of IdentityHashMap: " + identityMap.size());
	        System.out.println("IdentityHashMap: " + identityMap);

	}
	
	@Test
	public void testIdentityHashMap2() {
//		 Map<Age, String> map = new HashMap<Age, String>();
		Map<Age, String> map = new IdentityHashMap<Age, String>();
	     
	      map.put(new Age(7), "seven");
	      System.out.println("One Element added: Size is " + map.size());
	      Age age7 = new Age(7);
	      map.put(age7, "seven Again");
	      System.out.println("Two Elements added: Size is " + map.size());
	      map.put(new Age(7), "Seven a Third time");
	      System.out.println("Three Elements added: Size is " + map.size());
	      System.out.println("Value recovered For 7 is :  [ " + map.get(age7) + " ]");
	}
	
	class Age {
		   public final Integer val;

		   public Age(Integer val) {
		      this.val = val;
		   }

		   @Override
		   public int hashCode() {
		      return val.hashCode();
		   }

		   @Override
		   public boolean equals(Object obj) {
		      return this.val.equals(((Age) obj).val);
		   }
		}

	private static Integer integer = 2;

	public void change(Object... obj) {
		obj[0] = 100;
	}

	public void changeInt(Integer i) {
		i = 100;
	}

	class Dog2 implements Comparable<Dog2> {
		String color;

		Dog2(String c) {
			color = c;
		}

		public boolean equals(Object o) {
			return ((Dog2) o).color.equals(this.color);
		}

		public int hashCode() {
			return color.length();
		}

		public String toString() {
			return color + " dog";
		}

		public int compareTo(Dog2 o) {
			return color.compareTo(o.color);
		}
	}

	class Dog implements Comparable<Dog> {
		int size;

		public Dog(int s) {
			size = s;
		}

		public String toString() {
			return size + "";
		}

		public int compareTo(Dog o) {
			return size - o.size;
		}

	}

}
