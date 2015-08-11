package com.hawk.c01.custom.other;

public class ClassInstance{
    public static void main(String[] args){
        ClassInstance nm = new ClassInstance();
        nm.doit();
    }

    public void doit(){
        A a = new A();
        B b = new B();
        A[] aArr = new A[0];
        B[] bArr = new B[0];

        System.out.println("b instanceof a: " + (b instanceof A));	// true
        System.out.println("b isInstance a: " + A.class.isInstance(b));	// true
        System.out.println("a isInstance b: " + B.class.isInstance(a));	// false
        System.out.println("b isAssignableFrom a: " + A.class.isAssignableFrom(B.class));	// true
        System.out.println("a isAssignableFrom b: " + B.class.isAssignableFrom(A.class));	// false
        System.out.println("bArr isInstance A: " + A.class.isInstance(bArr));	// false
        System.out.println("bArr isInstance aArr: " + aArr.getClass().isInstance(bArr));	// true
        System.out.println("bArr isAssignableFrom aArr: " + aArr.getClass().isAssignableFrom(bArr.getClass()));	// true
    }

    class A{}
    
    class B extends A{}
    
}
