package multithreading;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class Locks {
	public static int i = 0;
	public static ReadWriteLock lock = new ReentrantReadWriteLock();
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Runnable writeTask = () -> {
			String threadName = Thread.currentThread().getName();
			Lock writeLock = lock.writeLock();
			writeLock.lock();
			System.out.println("Writing...");
			i++;
			System.out.println("Writed by" + threadName + ":  " + i);
			writeLock.unlock();
		};
		Runnable readTask = () -> {
			String threadName = Thread.currentThread().getName();
			Lock readLock = lock.readLock();
			readLock.lock();
			System.out.println("Reading...");
			System.out.println("Read by:" + threadName + ":  " + i);
			readLock.unlock();
		};
		for(int i = 0; i < 6; i++) {
			executor.execute(writeTask);
			executor.execute(readTask);
		}
		executor.shutdown();
	}
}