package com.hawk.c01.custom.interview.normal;

public class InitializerExamples_static {
	static int count;
    int i;

    static{
        //This is a static initializers. Run only when Class is first loaded.
        //Only static variables can be accessed
        System.out.println("Static Initializer");
        //i = 6;//COMPILER ERROR
        System.out.println("Count when Static Initializer is run is " + count);
    }

    public static void main(String[] args) {
    	InitializerExamples_static example = new InitializerExamples_static();
    	InitializerExamples_static example2 = new InitializerExamples_static();
    	InitializerExamples_static example3 = new InitializerExamples_static();
    }
}
