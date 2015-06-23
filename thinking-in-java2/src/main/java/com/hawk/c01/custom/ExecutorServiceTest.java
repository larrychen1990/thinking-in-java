package com.hawk.c01.custom;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

public class ExecutorServiceTest {

	public static void main(String[] args) {
		ExecutorServiceTest t = new ExecutorServiceTest();
		t.process("go");

	}

	private void process(final String messageId) {

		final ThreadFactory threadFactory = new ThreadFactoryBuilder()
				.setNameFormat("Orders-%d").setDaemon(true).build();
		final ExecutorService executorService = Executors.newFixedThreadPool(
				10, threadFactory);

		executorService.submit(new Runnable() {
			public void run() {
				final Thread currentThread = Thread.currentThread();
				final String oldName = currentThread.getName();
				currentThread.setName("Processing-" + messageId);
				System.out.println(messageId);
				try {
					System.out.println("Logic ");
//					System.out.println("Logic "+currentThread.getName());
				} finally {
					currentThread.setName(oldName);
					System.out.println(oldName);
				}
				
			}
		});
	}
	
}
