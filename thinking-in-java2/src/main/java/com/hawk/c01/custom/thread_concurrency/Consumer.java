package com.hawk.c01.custom.thread_concurrency;

import java.util.Date;
import java.util.Vector;

class Producer extends Thread{

	static final int MAXQUEUE = 5;
	private Vector<String> messages = new Vector<String>();
	@Override
	public void run() {
		try {
			while (true) {
				putMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void putMessage() throws InterruptedException {
		while (messages.size() == MAXQUEUE) {
			wait();
		}
		messages.add(new Date().toString());
		System.out.println("put message.");
		notify();
	}
	
	public synchronized String getMessage() throws InterruptedException {
		notify();
		while (messages.size() == 0) {
			wait();
		}
		
		String message = (String) messages.firstElement();
		messages.removeElement(message);
		return message;
	}

}


public class Consumer extends Thread {

	Producer producer;
	
	Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String message = producer.getMessage();
				System.out.println("Got message: " + message);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Producer producer = new Producer();
        producer.start();
        new Consumer(producer).start();
	}
	
}




