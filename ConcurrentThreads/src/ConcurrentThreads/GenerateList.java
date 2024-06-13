package ConcurrentThreads;

import java.time.Instant;
import java.util.Collection;
import java.util.concurrent.Callable;

public class GenerateList implements Callable<Collection> {
	private Collection<String> list;
	
	public GenerateList(Collection<String> list) {
		this.list = list;
	}
	
	@Override
	public Collection call() {
		String threadName = getThreadName();
		System.out.println("Starting generation of " + threadName + "...");
		long startTime = Instant.now().toEpochMilli();
		for(int i = 0; i < 50000; i++) {
			list.add("Element " + i);
		}
		for(String element : list) {
			list.contains(element);
		}
		long processTimeSeconds = (Instant.now().toEpochMilli() - startTime) / 1000;
		long processTimeMiliseconds = Instant.now().toEpochMilli() - startTime - (processTimeSeconds * 1000);
		System.out.println("Generation of " + threadName +" finished in " + processTimeSeconds + "." + processTimeMiliseconds);
		return list;
	}
	
	private String getThreadName() {
		return Thread.currentThread().getName();
	}
}
