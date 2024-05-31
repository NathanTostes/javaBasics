package Threads;

import java.util.*;

public class Main {
	public static void main(String[] args) {
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
		new Thread(new PrintNumbers(1)).start();
		new Thread(new PrintNumbers(2)).start();
	}
}