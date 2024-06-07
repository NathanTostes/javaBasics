package SynchronizedThreads;

import java.util.*;

public class Main {
	private static int notFoundMessages = 0;
	
	public static void main(String[] args) {
		Collection<String> messageList = new Vector<>();
		Thread t1 = new Thread(new MessageGenerator(0, 10000, messageList));
		Thread t2 = new Thread(new MessageGenerator(10000, 20000, messageList));
		Thread t3 = new Thread(new MessageGenerator(20000, 30000, messageList));
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < 30000; i++) {
			if(!messageList.contains("Message " + i)) {
				System.out.println("Message not found");
				notFoundMessages++;
			}
		}
		for(String message : messageList) {
			if(message == null) {
				System.out.println("Message is null");
			}
		}
		System.out.println(notFoundMessages + " messages not found");
	}
}