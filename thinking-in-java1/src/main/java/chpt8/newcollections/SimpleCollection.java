package chpt8.newcollections;

//: SimpleCollection.java
//A simple example using the new Collections
import java.util.*;

public class SimpleCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		for (int i = 0; i < 10; i++)
			c.add(Integer.toString(i));
		System.out.println(c.add("1"));
		Iterator it = c.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
} // /:~
