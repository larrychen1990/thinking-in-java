package com.hawk.c01.custom.thread_concurrency.notifyall;

import java.util.LinkedList;
import java.util.Queue;

public class PCQueue {
	private volatile Queue<Product> productQueue = new LinkedList<Product>();

	public static void main(String[] args) {
		PCQueue pc = new PCQueue();

		Producer producer = new Producer(pc.productQueue);
		Consumer consumer = new Consumer(pc.productQueue);

		new Thread(producer, "Producer Thread 1").start();
		new Thread(consumer, "Consumer Thread 1").start();

		new Thread(producer, "Producer Thread 2").start();
		new Thread(consumer, "Consumer Thread 2").start();
	}

}

class Producer implements Runnable {

	private Queue<Product> queue = null;

	private static volatile int refSerialNumber = 0;

	public Producer(Queue<Product> queue) {
		this.queue = queue;
	}

	public void run() {

		while (true) {
			synchronized (queue) {
				while (queue.peek() != null) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				queue.add(new Product(++refSerialNumber));
				System.out.println("Produced by: " + Thread.currentThread().getName() + " Serial Number: "
								+ refSerialNumber);

				queue.notifyAll();
			}
		}

	}
}

class Consumer implements Runnable {

	private Queue<Product> queue = null;

	public Consumer(Queue<Product> queue) {
		this.queue = queue;
	}

	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.peek() == null) {
					try {
						queue.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				Product product = queue.remove();
				System.out.println("Consumed by: " + Thread.currentThread().getName() + " Serial Number: "
								+ product.getSerialNumber());

				queue.notifyAll();

			}
		}

	}

}

class Product {
	private int serialNumber;

	public Product(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}
}
