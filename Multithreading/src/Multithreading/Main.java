package Multithreading;

import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
			executor = Executors.newCachedThreadPool();
			Future<?> f1 = executor.submit(new GenerateList());
			Future<?> f2 = executor.submit(new GenerateList());
			System.out.println(f1.get());
			System.out.println(f2.get());
			Collection<GenerateList> taskList = new ArrayList<>();
			for(int i = 0; i < 5; i++) {
				taskList.add(new GenerateList());
			}
			Collection<Future<String>> messageList = executor.invokeAll(taskList);
			for (Future<String> endMessage : messageList) {
				System.out.println(endMessage.get());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executor != null) {
				executor.shutdown();
			}
		}
	}
}