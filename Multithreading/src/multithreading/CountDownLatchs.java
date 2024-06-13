package multithreading;

import java.util.concurrent.*;

public class CountDownLatchs {
	private static int modifier = 1;
	private static CountDownLatch latch = new CountDownLatch(2);
	
	public static void main (String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		Runnable runnable = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " has started");
			System.out.println(threadName + " result is " + (Math.round(Math.random() * 10 + 1) * modifier));
			latch.countDown();
		};
		executor.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
		executor.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
		while(true) {
			try {
				latch.await();
				modifier += 1;
				latch = new CountDownLatch(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}