package producerconsomer;

import java.util.concurrent.*;

public class QueueSolution {
	private static LinkedBlockingQueue<Long> queue = new LinkedBlockingQueue<>(5);

	public static void main(String[] args) {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

		Runnable producer = () -> {
			simulateProcess();
			try {
				queue.put(generateRandom());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Runnable consumer = () -> {
			simulateProcess();
			try {
				long takedValue = queue.take();
				String operationOutput = "[";
				for(long element : queue) {
					operationOutput += element + ", ";
				}
				operationOutput += takedValue + "] -> " + takedValue;
				System.out.println(operationOutput);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		executor.scheduleWithFixedDelay(producer, 0, 10, TimeUnit.MILLISECONDS);
		executor.scheduleWithFixedDelay(consumer, 0, 10, TimeUnit.MILLISECONDS);
	}

	private static long generateRandom() {
		return Math.round(Math.random() * 100) + 1;
	}

	private static void simulateProcess() {
		try {
			Thread.sleep(Math.round(Math.random() * 2000) + 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}