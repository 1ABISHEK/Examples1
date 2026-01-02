package com.ths;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleMaths implements Callable<Integer> {

	private final int count;

	public SimpleMaths(int count) {
		this.count = count;
	}  

	@Override
	public Integer call() throws Exception {

		int add = 0;

		for (int i = 0; i <= count; i++) {

			add += i;

			Thread.sleep(500);
		}

		System.out.println("The count value is :" + add + " " + Thread.currentThread().getName());

		return add;
	}

	public static void main(String[] args) {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		SimpleMaths task = new SimpleMaths(10);

		Future<Integer> future = executor.submit(task);

		System.out.println("Task Submitted.");

		try {
			int rslt = future.get();

			System.out.println("The result from the callable task " + rslt);

		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}

		executor.shutdown();
	}
}
