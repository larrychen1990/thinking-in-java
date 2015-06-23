package com.hawk.c01.custom.liner.arraylink;

/**
 * Java 实现的�?��?�链表。 注：java自带的集�?�包中有实现�?��?�链表，路径是:java.util.LinkedList
 *
 * @author skywang
 * @date 2013/11/07
 */

public class DlinkText {

	// �?��?�链表�?作int数�?�
	private static void int_test() {
		int[] iarr = { 10, 20, 30, 40 };

		System.out.println("\n------int_test---");
		// 创建�?��?�链表
		DoubleLink<Integer> dlink = new DoubleLink<Integer>();

		dlink.insert(0, 20); // 将 20 �?�入到第一个�?置
		dlink.appendLast(10); // 将 10 追加到链表末尾
		dlink.insertFirst(30); // 将 30 �?�入到第一个�?置
		dlink.insert(1, 230); // 将 20 �?�入到第2个�?置

		// �?��?�链表是�?�为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// �?��?�链表的大�?
		System.out.printf("size()=%d\n", dlink.size());

		// 打�?�出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}
	// �?��?�链表�?作int数�?�
	private static void int_test2() {
		
		System.out.println("\n------int_test2---");
		// 创建�?��?�链表
		DoubleLink<Integer> dlink = new DoubleLink<Integer>();
		dlink.insert(0, 0); // 将 20 �?�入到第一个�?置
		dlink.appendLast(77);
		dlink.appendLast(88);
		dlink.appendLast(99);
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		
		System.out.println("=========================================");
		dlink.insert(1, 1); // 将 20 �?�入到第一个�?置
		dlink.insert(2, 2); // 将 20 �?�入到第一个�?置
		dlink.insert(0, 230); // 将 20 �?�入到第2个�?置
		
		// 打�?�出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	private static void string_test() {
		String[] sarr = { "ten", "twenty", "thirty", "forty" };

		System.out.println("\n----string_test----");
		// 创建�?��?�链表
		DoubleLink<String> dlink = new DoubleLink<String>();

		dlink.insert(0, sarr[1]); // 将 sarr中第2个元素 �?�入到第一个�?置
		dlink.appendLast(sarr[0]); // 将 sarr中第1个元素 追加到链表末尾
		dlink.insertFirst(sarr[2]); // 将 sarr中第3个元素 �?�入到第一个�?置

		// �?��?�链表是�?�为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// �?��?�链表的大�?
		System.out.printf("size()=%d\n", dlink.size());

		// 打�?�出全部的节点
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	// 内部类
	private static class Student {
		private int id;
		private String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "[" + id + ", " + name + "]";
		}
	}

	private static Student[] students = new Student[] { new Student(10, "sky"),
			new Student(20, "jody"), new Student(30, "vic"),
			new Student(40, "dan"), };

	private static void object_test() {
		System.out.println("\n----object_test----");
		// 创建�?��?�链表
		DoubleLink<Student> dlink = new DoubleLink<Student>();

		dlink.insert(0, students[1]); // 将 students中第2个元素 �?�入到第一个�?置
		dlink.appendLast(students[0]); // 将 students中第1个元素 追加到链表末尾
		dlink.insertFirst(students[2]); // 将 students中第3个元素 �?�入到第一个�?置

		// �?��?�链表是�?�为空
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// �?��?�链表的大�?
		System.out.printf("size()=%d\n", dlink.size());

		// 打�?�出全部的节点
		for (int i = 0; i < dlink.size(); i++) {
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		}
	}

	public static void main(String[] args) {
		int_test(); // 演示�?��?��?�链表�?作“int数�?��?。
		int_test2();
		string_test(); // 演示�?��?��?�链表�?作“字符串数�?��?。
		object_test(); // 演示�?��?��?�链表�?作“对象�?。
	}
}
