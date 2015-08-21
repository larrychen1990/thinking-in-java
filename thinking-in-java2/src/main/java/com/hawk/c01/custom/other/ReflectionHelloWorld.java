package com.hawk.c01.custom.other;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;

public class ReflectionHelloWorld {

	@Test
	@Ignore
	public void getClassName() {
		Foo f = new Foo();
		System.out.println(f.getClass().getName()); // com.hawk.c01.custom.other.Foo
	}

	@Test
	@Ignore
	public void invokeMethod() {
		Foo f = new Foo();

		Method method;
		try {
			method = f.getClass().getMethod("print", new Class<?>[0]);
			method.invoke(f);
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException
						| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

	@Test
	@Ignore
	public void classInstance() {
		// create instance of "Class"
		Class<?> c = null;
		try {
			c = Class.forName("com.hawk.c01.custom.other.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// create instance of "Foo"
		Foo f = null;
		try {
			f = (Foo) c.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		f.print();

	}

	@Test
	@Ignore
	public void constructorInstance() {
		// create instance of "Class"
		Class<?> c = null;
		try {
			c = Class.forName("com.hawk.c01.custom.other.Foo");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// create instance of "Foo"
		Foo f1 = null;
		Foo f2 = null;

		// get all constructors
		Constructor<?> cons[] = c.getConstructors();

		try {
			f1 = (Foo) cons[0].newInstance();
			f2 = (Foo) cons[1].newInstance("abc");
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
			e.printStackTrace();
		}

		f1.print();
		f2.print();
	}

	@Test
//	@Ignore
	public void changeArraySize() {
		int[] intArray = { 1, 2, 3, 4, 5 };

		int[] newIntArray = (int[]) changeArraySize(intArray, 10);

		print(newIntArray);

		String[] strArray = { "a", "b", "c", "d", "e" };

		String[] newStrArray = (String[]) changeArraySize(strArray, 10);
		print(newStrArray);

	}

	// change array size
	private Object changeArraySize(Object obj, int len) {
		Class<?> arrClass = obj.getClass().getComponentType();
		Object newArray = Array.newInstance(arrClass, len);

		// do array copy
		int co = Array.getLength(obj);
		System.arraycopy(obj, 0, newArray, 0, co);

		return newArray;
	}

	// print
	private void print(Object obj) {
		Class<?> c = obj.getClass();
		if (!c.isArray()) {
			return;
		}

		System.out.println("\nArray length: " + Array.getLength(obj));

		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
	}

}

class Foo {
	String s;

	public Foo() {
	}

	public Foo(String s) {
		this.s = s;
	}

	public void print() {
		System.out.println(s);
	}
}