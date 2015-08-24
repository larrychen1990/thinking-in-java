package com.hawk.c01.custom.algorithm;

import java.util.Scanner;

// program for bank management

@SuppressWarnings("resource")
public class Bank {
	public static int amount = 0;
	public static String name = null;

	public static void open(String s, int n) {
		System.out.println("Enter your name:");
		Scanner in = new Scanner(System.in);
		Bank.name = in.nextLine();

		System.out.println("Enter the initial amount:");
		Scanner in2 = new Scanner(System.in);
		Bank.amount = in2.nextInt();

		System.out.println("Your name: " + name);
		System.out.println("\balance : " + amount);
	}

	public static void deposit(String s, int n) {
		System.out.println("Enter the amount to be deposit:");
		Scanner in1 = new Scanner(System.in);
		int a = in1.nextInt();
		Bank.amount = amount + a;
		System.out.println("Current amount = " + amount);
	}

	public static void withdraw(String s, int n) {
		System.out.println("Enter the amount to be withdraw:");
		Scanner in1 = new Scanner(System.in);
		int a = in1.nextInt();
		Bank.amount = amount - a;
		System.out.println("Current amount = " + amount);
	}

	public static void check(String s, int n) {
		System.out.println("Current user = " + Bank.name);
		System.out.println("Current amount = " + Bank.amount);
	}

	public static void close(String s, int n) {
		System.out.println("Current amount = 0");
	}

	public static void main(String[] args) {
		System.out.println("1.Open Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Check Balance");
		System.out.println("5.Close Account");

		System.out.println("Enter your choice: ");
		Scanner in = new Scanner(System.in);
		int c = in.nextInt();

		String s = new String();
		int n = 0;
		switch (c) {
		case 1:
			open(s, n);
			break;
		case 2:
			deposit(s, n);
			break;
		case 3:
			withdraw(s, n);
			break;
		case 4:
			check(s, n);
			break;
		case 5:
			close(s, n);
			break;
		default:
			System.out.println("Wrong choice!!");
			break;
		}

		System.out.println("Press 6 to continue");
		Scanner in5 = new Scanner(System.in);
		int r = in5.nextInt();
		if (r == 6) {
			String[] s2 = null;
			main(s2);
		}
	}

}
