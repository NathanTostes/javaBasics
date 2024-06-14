package multithreading;

import java.util.*;
import java.util.concurrent.*;

public class Queues {
	private static SynchronousQueue<String> queue = new SynchronousQueue<>();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Runnable r1 = () -> {
			put();
			System.out.println(Thread.currentThread().getName() + " has writed a message in the queue");
		};
		Runnable r2 = () -> {
			String message = take();
			System.out.println(Thread.currentThread().getName() + " has red a message in the queue\n"
					+ "Message: " + message);
		};
		executor.execute(r1);
		executor.execute(r2);
		executor.shutdown();
	}

	private static void put() {
		try {
			queue.put("I'm learning about concurrency in Java");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static String take() {
		try {
			return queue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Exception";
		}
	}
}