package com.hawk.c01.custom.liner.stack;

/**
 * Java : 数组实现的栈，能存储任�?类型的数�?�
 *
 * @author skywang
 * @date 2013/11/07
 */
import java.lang.reflect.Array;

public class GeneralArrayStack<T> {

    private static final int DEFAULT_SIZE = 12;
    private T[] mArray;
    private int count;

    public GeneralArrayStack(Class<T> type) {
        this(type, DEFAULT_SIZE);
    }

    public GeneralArrayStack(Class<T> type, int size) {
        // �?能直接使用mArray = new T[DEFAULT_SIZE];
        mArray = (T[]) Array.newInstance(type, size);
        count = 0;
    }

    // 将val添加到栈中
    public void push(T val) {
        mArray[count++] = val;
        System.out.printf("count= %d\n",count);
    }

    // 返回“栈顶元素值�?
    public T peek() {
        return mArray[count-1];
    }

    // 返回“栈顶元素值�?，并删除“栈顶元素�?
    public T pop() {
        T ret = mArray[count-1];
        count--;
        return ret;
    }

    // 返回“栈�?的大�?
    public int size() {
        return count;
    }

    // 返回“栈�?是�?�为空
    public boolean isEmpty() {
        return size()==0;
    }

    // 打�?�“栈�?
    public void PrintArrayStack() {
        if (isEmpty()) {
            System.out.printf("stack is Empty\n");
        }

        System.out.printf("stack size()=%d\n", size());

        int i=size()-1;
        while (i>=0) {
            System.out.println(mArray[i]);
            i--;
        }
    }

    public static void main(String[] args) {
        String tmp;
        GeneralArrayStack<String> astack = new GeneralArrayStack<String>(String.class);

        // 将10, 20, 30 �?次推入栈中
        astack.push("10");
        astack.push("20");
        astack.push("30");

        // 将“栈顶元素�?赋值给tmp，并删除“栈顶元素�?
        tmp = astack.pop();
        System.out.println("tmp="+tmp);

        // �?�将“栈顶�?赋值给tmp，�?删除该元素.
        tmp = astack.peek();
        System.out.println("tmp="+tmp);

        astack.push("40");
        astack.PrintArrayStack();    // 打�?�栈
    }
}
