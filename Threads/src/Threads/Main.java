package Threads;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Thread deamonThread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; true; i++) {
					System.out.println(i + " seconds");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		deamonThread.setDaemon(true);
		deamonThread.start();
		List<Integer> numberList = new ArrayList<>();
		for (int i = 0; i < 100000; i++) {
			numberList.add(i);
		}
		Thread listIterator = new Thread(new ListIterator(numberList));
		listIterator.start();
		Thread listAdder = new Thread(new ListAdder());
		listAdder.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread t1 = new Thread(new PrintNumbers(1));;
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		Thread t2 = new Thread(new PrintNumbers(2));
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
	}
}