package Threads;

import java.util.*;

public class ListIterator implements Runnable {
	List<Integer> numberList;

	public ListIterator(List<Integer> numberList) {
		this.numberList = numberList;
	}

	@Override
	public void run() {
		System.out.println("Starting iteration...");
		long startTimer = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			numberList.contains(i);
		}
		System.out.println("Total time of iteration: " + (System.currentTimeMillis() - startTimer) + "ms");
	}
}