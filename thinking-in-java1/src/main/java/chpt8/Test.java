package chpt8;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
//		int random = (int)
//		double random = (Math.random() * 8);
//		System.out.println(random);
//		double d = 3.9;
//		int i = (int) d;
//		System.out.println(i);
		Random random = new Random();
		byte b=(byte) random.nextInt();
		System.out.println(b);

	}
}
