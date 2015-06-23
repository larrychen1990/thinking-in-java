package com.hawk.c01.custom;

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

        System.out.println("b instanceof a: " + (b instanceof A));
        System.out.println("b isInstance a: " + A.class.isInstance(b));
        System.out.println("a isInstance b: " + B.class.isInstance(a));
        System.out.println("b isAssignableFrom a: " + A.class.isAssignableFrom(B.class));
        System.out.println("a isAssignableFrom b: " + B.class.isAssignableFrom(A.class));
        System.out.println("bArr isInstance A: " + A.class.isInstance(bArr));
        System.out.println("bArr isInstance aArr: " + aArr.getClass().isInstance(bArr));
        System.out.println("bArr isAssignableFrom aArr: " + aArr.getClass().isAssignableFrom(bArr.getClass()));
    }

    class A{}
    
    class B extends A{}
    
}
