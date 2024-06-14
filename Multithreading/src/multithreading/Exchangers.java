package multithreading;

import java.util.concurrent.*;

public class Exchangers {
	private static Exchanger<String> exchanger = new Exchanger<>();

	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		
		Runnable r1 = () -> {
			String threadName = Thread.currentThread().getName();
			String messageSent = "Hello World!";
			System.out.println("Message sent " + threadName + ": " + messageSent);
			String messageReceived = exchange(messageSent);
			System.out.println("Message received by " + threadName + ": " + messageReceived);
		};
		Runnable r2 = () -> {
			String threadName = Thread.currentThread().getName();
			String messageSent = "I love Java!";
			System.out.println("Message sent " + threadName + ": " + messageSent);
			String messageReceived = exchange(messageSent);
			System.out.println("Message received by " + threadName + ": " + messageReceived);
		};
		
		executor.execute(r1);
		executor.execute(r2);
		
		executor.shutdown();
	}

	private static String exchange(String message) {
		try {
			return exchanger.exchange(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Exception";
		}
	}
}