package Multithreading;

import java.time.Instant;
import java.util.*;

public class HelloWorldThread implements Runnable {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		Collection<Integer> collection = new ArrayList<>();
		System.out.println("Starting execution...");
		long startTime = Instant.now().toEpochMilli();
		for (int i = 0; i < 60000; i++) {
			collection.add(i);
		}
		for (Integer integer : collection) {
			collection.contains(integer);
		}
		synchronized (this) {
			long finishTime = Instant.now().toEpochMilli();
			String totalTime = (finishTime - startTime) / 1000 + "."
					+ ((finishTime - startTime) - (((finishTime - startTime) / 1000) * 1000));
			System.out.println("Thread " + threadName + " has finished in " + totalTime);
		}
	}
}