package com.hawk.c01.custom;
import java.util.LinkedList;
import java.util.List;

public class Api {
    public static final void main(String[] args) {
        int tmp = 10;
        change(tmp);
        //�?�以看到,传入的temp没有被修改掉
        System.out.println(tmp);

        List<Integer> list = new LinkedList<Integer>();
        System.out.println("size=" + list.size());
        change(list);
        //�?�以看出,传入的List被修改了,之�?大�?是0,现在打�?�结果是1
        System.out.println("size=" + list.size());
    }

    public static void change(int tmp) {
        tmp = tmp * 2;
    }

    public static void change(final List<Integer> list) {
        list.add(1);
    }

}