package Threads;

import java.util.*;

public class ListAdder implements Runnable {
	@Override
	public void run() {
		List<Integer> numberList = new ArrayList<>();
		System.out.println("Starting adition...");
		long startTimer = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			numberList.add(i);
		}
		System.out.println("Total time of addition: " + (System.currentTimeMillis() - startTimer) + "ms");
	}
}