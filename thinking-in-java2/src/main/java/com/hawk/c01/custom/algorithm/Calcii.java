package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// calculator for add, substract, multiply, divide, modulus operation

public class Calcii {
	public static int add(int a, int b){
		int c = a + b;
		return c;
	}
	
	public static int sub(int a, int b){
		int c = a - b;
		return c;
	}
	
	public static int mul(int a, int b){
		int c = a * b;
		return c;
	}
	
	public static int div(int a, int b){
		int c = a / b;
		return c;
	}
	
	public static int mod(int a, int b){
		int c = a % b;
		return c;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("**Operations in my calculator**");
		
		System.out.println("1 --> (+) addition (+)");
		System.out.println("2 --> (-) substract (-)");
		System.out.println("3 --> (*) multiply (*)");
		System.out.println("4 --> (/) divide (/)");
		System.out.println("5 --> (%) modulus (%)");
		
		System.out.println("*** give first no. ***: -->");
		Scanner in1 = new Scanner(System.in);
		int x = in1.nextInt();
		
		System.out.println("*** give second no. ***: -->");
		Scanner in2 = new Scanner(System.in);
		int y = in2.nextInt();
		
		System.out.println("*** Enter your choice ***: -->");
		Scanner in3 = new Scanner(System.in);
		int c = in3.nextInt();
		
		int z = 0;
		switch (c) {
		case 1:
			z = add(x, y);
			break;
		case 2:
			z = sub(x, y);
			break;
		case 3:
			z = mul(x, y);
			break;
		case 4:
			z = div(x, y);
			break;
		case 5:
			z = mod(x, y);
			break;

		default:
			System.out.println("*** Wrong choice!! ***: -->");
			break;
		}
		System.out.println("*** result ***: --> " + z);
		
		System.out.println("** press 6 to continue **");
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		if (r == 6) {
			String[] s = null;
			main(s);
		}
		
		
		
	}
	
}
