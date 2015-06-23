package com.hawk.c01.custom.liner.queue;

/**
 * Java : 数组实现“队列�?，�?�能存储int数�?�。
 *
 * @author skywang
 * @date 2013/11/07
 */
public class ArrayQueue {

    private int[] mArray;
    private int mCount;

    public ArrayQueue(int size) {
        mArray = new int[size];
        mCount = 0;
    }

    // 将val添加到队列的末尾
    public void add(int val) {
        mArray[mCount++] = val;
    }

    // 返回“队列开头元素�?
    public int peek() {
        return mArray[0];
    }

    // 返回“栈顶元素值�?，并删除“栈顶元素�?
    public int pop() {
        int ret = mArray[0];
        mCount--;
        for (int i=1; i<=mCount; i++)
            mArray[i-1] = mArray[i];
        return ret;
    }

    // 返回“栈�?的大�?
    public int size() {
        return mCount;
    }

    // 返回“栈�?是�?�为空
    public boolean isEmpty() {
        return size()==0;
    }

    public static void main(String[] args) {
        int tmp=0;
        ArrayQueue arrayQueue = new ArrayQueue(12);

        // 将10, 20, 30 �?次推入栈中
        arrayQueue.add(10);
        arrayQueue.add(20);
        arrayQueue.add(30);

        // 将“栈顶元素�?赋值给tmp，并删除“栈顶元素�?
        tmp = arrayQueue.pop();
        System.out.printf("pop tmp=%d\n", tmp);

        // �?�将“栈顶�?赋值给tmp，�?删除该元素.
        tmp = arrayQueue.peek();
        System.out.printf("peek tmp=%d\n", tmp);

        arrayQueue.add(40);

        System.out.printf("isEmpty()=%b\n", arrayQueue.isEmpty());
        System.out.printf("size()=%d\n", arrayQueue.size());
        while (!arrayQueue.isEmpty()) {
            System.out.printf("size()=%d\n", arrayQueue.pop());
        }
    }
}
