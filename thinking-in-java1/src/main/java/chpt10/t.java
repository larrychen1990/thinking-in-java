package chpt10;

import java.util.Random;

public class t {
	public static void main(String[] args) {
		Random r = new Random();
		int i=r.nextInt();
		System.out.println(i);
		System.out.println(i%100);
	}
}
