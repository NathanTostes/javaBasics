package multithreading;

import java.util.concurrent.*;

public class Semaphores {
	private static Semaphore semaphore = new Semaphore(2);
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Runnable runnable = () -> {
			try {
				semaphore.acquire();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String threadName = Thread.currentThread().getName();
			long randomNumber = Math.round(Math.random()) + 1; 
			System.out.println(threadName + randomNumber);
			semaphore.release();
		};
		for(int i = 0; i < 10; i++) {
			executor.execute(runnable);
		}
		executor.shutdown();
	}
}