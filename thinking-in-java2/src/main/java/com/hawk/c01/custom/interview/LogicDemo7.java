package com.hawk.c01.custom.interview;

import java.util.Scanner;

public class LogicDemo7 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int total = s.nextInt();
	int size = 10;
	int page = total%size == 0 ? total/size : total/size+1;
	System.out.println(page);
}
}
