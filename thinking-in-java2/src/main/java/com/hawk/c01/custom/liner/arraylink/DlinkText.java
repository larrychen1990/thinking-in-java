package com.hawk.c01.custom.liner.arraylink;

/**
 * Java å®žçŽ°çš„å?Œå?‘é“¾è¡¨ã€‚ æ³¨ï¼šjavaè‡ªå¸¦çš„é›†å?ˆåŒ…ä¸­æœ‰å®žçŽ°å?Œå?‘é“¾è¡¨ï¼Œè·¯å¾„æ˜¯:java.util.LinkedList
 *
 * @author skywang
 * @date 2013/11/07
 */

public class DlinkText {

	// å?Œå?‘é“¾è¡¨æ“?ä½œintæ•°æ?®
	private static void int_test() {
		int[] iarr = { 10, 20, 30, 40 };

		System.out.println("\n------int_test---");
		// åˆ›å»ºå?Œå?‘é“¾è¡¨
		DoubleLink<Integer> dlink = new DoubleLink<Integer>();

		dlink.insert(0, 20); // å°† 20 æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.appendLast(10); // å°† 10 è¿½åŠ åˆ°é“¾è¡¨æœ«å°¾
		dlink.insertFirst(30); // å°† 30 æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.insert(1, 230); // å°† 20 æ?’å…¥åˆ°ç¬¬2ä¸ªä½?ç½®

		// å?Œå?‘é“¾è¡¨æ˜¯å?¦ä¸ºç©º
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// å?Œå?‘é“¾è¡¨çš„å¤§å°?
		System.out.printf("size()=%d\n", dlink.size());

		// æ‰“å?°å‡ºå…¨éƒ¨çš„èŠ‚ç‚¹
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}
	// å?Œå?‘é“¾è¡¨æ“?ä½œintæ•°æ?®
	private static void int_test2() {
		
		System.out.println("\n------int_test2---");
		// åˆ›å»ºå?Œå?‘é“¾è¡¨
		DoubleLink<Integer> dlink = new DoubleLink<Integer>();
		dlink.insert(0, 0); // å°† 20 æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.appendLast(77);
		dlink.appendLast(88);
		dlink.appendLast(99);
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		
		System.out.println("=========================================");
		dlink.insert(1, 1); // å°† 20 æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.insert(2, 2); // å°† 20 æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.insert(0, 230); // å°† 20 æ?’å…¥åˆ°ç¬¬2ä¸ªä½?ç½®
		
		// æ‰“å?°å‡ºå…¨éƒ¨çš„èŠ‚ç‚¹
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	private static void string_test() {
		String[] sarr = { "ten", "twenty", "thirty", "forty" };

		System.out.println("\n----string_test----");
		// åˆ›å»ºå?Œå?‘é“¾è¡¨
		DoubleLink<String> dlink = new DoubleLink<String>();

		dlink.insert(0, sarr[1]); // å°† sarrä¸­ç¬¬2ä¸ªå…ƒç´  æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.appendLast(sarr[0]); // å°† sarrä¸­ç¬¬1ä¸ªå…ƒç´  è¿½åŠ åˆ°é“¾è¡¨æœ«å°¾
		dlink.insertFirst(sarr[2]); // å°† sarrä¸­ç¬¬3ä¸ªå…ƒç´  æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®

		// å?Œå?‘é“¾è¡¨æ˜¯å?¦ä¸ºç©º
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// å?Œå?‘é“¾è¡¨çš„å¤§å°?
		System.out.printf("size()=%d\n", dlink.size());

		// æ‰“å?°å‡ºå…¨éƒ¨çš„èŠ‚ç‚¹
		for (int i = 0; i < dlink.size(); i++)
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
	}

	// å†…éƒ¨ç±»
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
		// åˆ›å»ºå?Œå?‘é“¾è¡¨
		DoubleLink<Student> dlink = new DoubleLink<Student>();

		dlink.insert(0, students[1]); // å°† studentsä¸­ç¬¬2ä¸ªå…ƒç´  æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®
		dlink.appendLast(students[0]); // å°† studentsä¸­ç¬¬1ä¸ªå…ƒç´  è¿½åŠ åˆ°é“¾è¡¨æœ«å°¾
		dlink.insertFirst(students[2]); // å°† studentsä¸­ç¬¬3ä¸ªå…ƒç´  æ?’å…¥åˆ°ç¬¬ä¸€ä¸ªä½?ç½®

		// å?Œå?‘é“¾è¡¨æ˜¯å?¦ä¸ºç©º
		System.out.printf("isEmpty()=%b\n", dlink.isEmpty());
		// å?Œå?‘é“¾è¡¨çš„å¤§å°?
		System.out.printf("size()=%d\n", dlink.size());

		// æ‰“å?°å‡ºå…¨éƒ¨çš„èŠ‚ç‚¹
		for (int i = 0; i < dlink.size(); i++) {
			System.out.println("dlink(" + i + ")=" + dlink.get(i));
		}
	}

	public static void main(String[] args) {
		int_test(); // æ¼”ç¤ºå?‘å?Œå?‘é“¾è¡¨æ“?ä½œâ€œintæ•°æ?®â€?ã€‚
		int_test2();
		string_test(); // æ¼”ç¤ºå?‘å?Œå?‘é“¾è¡¨æ“?ä½œâ€œå­—ç¬¦ä¸²æ•°æ?®â€?ã€‚
		object_test(); // æ¼”ç¤ºå?‘å?Œå?‘é“¾è¡¨æ“?ä½œâ€œå¯¹è±¡â€?ã€‚
	}
}
