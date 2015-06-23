package com.hawk.c01.custom.liner.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用“栈�?实现队列
 *
 * @author skywang
 */
public class QueueTest<T> {

    // �?�队列添加数�?�时：(01) 将“已有的全部数�?��?都移到mIn中。 (02) 将“新添加的数�?��?添加到mIn中。
    private Queue<T> mIn  = null;
    // 从队列获�?�元素时：(01) 将“已有的全部数�?��?都移到mOut中。(02) 返回并删除mOut栈顶元素。
//    private Queue<T> mOut = null;
    // 统计计数
    private int mCount = 0;

    public QueueTest() {
        mIn = new LinkedList<T>();
        mCount = 0;
    }

    private void add(T t) {
    	mIn.offer(t);
    	mCount++;
    }

    private T get() {
    	T poll = mIn.poll();
    	mCount--;
    	return poll;
    }

    private int size() {
        return mCount;
    }
    private boolean isEmpty() {
        return mCount==0;
    }

    public static void main(String[] args) {
    	QueueTest queue = new QueueTest();

        // 将10, 20, 30 �?次推入栈中
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Object tmp = queue.get();
        System.out.printf("pop tmp=%d\n",tmp);
        
        queue.add(40);
        System.out.printf("add tmp=%d\n",40);
        
        System.out.printf("isEmpty()=%b\n", queue.isEmpty());
        System.out.printf("size()=%d\n", queue.size());
        while(!queue.isEmpty()) {
            System.out.printf("%d\n", queue.get());
        }
    }
}
