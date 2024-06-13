package Multithreading;

import java.time.Instant;
import java.util.*;
import java.util.concurrent.Callable;

public class GenerateList implements Callable<String> {
	@Override
	public String call() throws Exception {
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
		long finishTime = Instant.now().toEpochMilli() - startTime;
		long finishTimeSeconds = finishTime / 1000;
		long finishTimeMilli = finishTime - finishTimeSeconds * 1000;
		String endMessage = "Thread " + threadName + " has finished in " + finishTimeSeconds + "." + finishTimeMilli;
		return endMessage;
	}
}