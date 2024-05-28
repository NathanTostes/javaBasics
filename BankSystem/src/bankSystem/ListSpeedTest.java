package bankSystem;

import java.util.*;

public class ListSpeedTest {
	public static void main (String[] args) {
		List<Integer> numberList = new ArrayList<>();
		long startInsert = System.currentTimeMillis();
		for(int i = 0; i < 10000000; i++) {
			numberList.add(i);
		}
		long endInsert = System.currentTimeMillis();
		System.out.println("Insert time: " + (endInsert - startInsert));
		// long startSearch = System.currentTimeMillis();
		// for(int i = 0; i < 100000; i++) {
		// 	numberList.contains(i);
		// }
		// long endSearch= System.currentTimeMillis();
		// System.out.println("Search time: " + (endSearch - startSearch));
		long startIteration = System.currentTimeMillis();
		for(int i : numberList) {
			numberList.get(i);
		}
		long endIteration = System.currentTimeMillis();
		System.out.println("Iteration time: " + (endIteration - startIteration));
	}
}