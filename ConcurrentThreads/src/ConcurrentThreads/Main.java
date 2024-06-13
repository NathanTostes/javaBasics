package ConcurrentThreads;

import java.util.*;
import java.util.concurrent.*;

public class Main {
	public static void main(String[] args) {
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor();
			Future<Collection> future = executor.submit(new GenerateList(new ArrayList<String>()));
			System.out.println(future.get());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (executor != null) {
				executor.shutdownNow();
			}
		}
	}
}