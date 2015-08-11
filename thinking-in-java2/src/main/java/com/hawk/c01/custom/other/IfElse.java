package com.hawk.c01.custom.other;

public class IfElse {
	static void process(boolean flag) {

		int a = 0;

		if (flag) {

			a = 1;

		} else {   

			a = 2;

		}

		int b = flag == true ? 1 : 2;

	}
//生�?的字节�?
//0 iconst_0
//1 istore_2 [a]
//2 iload_1 [flag]
//3 ifeq 11
//6 iconst_1
//7 istore_2 [a]
//8 goto 13
//11 iconst_2
//12 istore_2 [a]
//13 iload_1 [flag]
//14 ifeq 21
//17 iconst_1
//18 goto 22
//21 iconst_2
//22 istore_3 [b]
//23 return
}

