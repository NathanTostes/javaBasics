package producerconsomer;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Main {
	private static BlockingQueue<String> queue = new LinkedBlockingQueue<>();
	private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();

		Runnable producer = () -> {
			Lock writeLock = lock.writeLock();
			while (true) {
				writeLock.lock();
				int initialListSize = queue.size();
				for (int i = initialListSize; i < initialListSize + 10; i++) {
					queue.add("Element " + i);
				}
				writeLock.unlock();
				sleep(250);
			}
		};
		Runnable consumer = () -> {
			Lock readLock = lock.readLock();
			while (true) {
				readLock.lock();
				int initialListSize = queue.size();
				for(String element : queue) {
					System.out.println(element);
				}
				readLock.unlock();
				sleep(250);
			}
		};
		executor.execute(producer);
		executor.execute(consumer);
		executor.shutdown();
	}

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}