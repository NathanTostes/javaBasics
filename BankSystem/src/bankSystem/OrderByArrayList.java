package bankSystem;

import java.util.*;

public class OrderByArrayList {
	public static void main(String[] args) {
		List<String> decreasingList = new ArrayList<>();
		decreasingList.add("Nathan");
		decreasingList.add("Luis");
		decreasingList.add("Marcos");
		decreasingList.add("Vanessa");
		decreasingList.add("Joao");
		decreasingList.add("Bruno");
		decreasingList.add("Anna");
		decreasingList.add("Tarantino");
		decreasingList.sort(new Comparator<>() {
		public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length() > o2.length() ? 1 : -1;
			}
		});
		System.out.println(decreasingList);
		decreasingList.sort((o1, o2) -> o1.compareTo(o2) * -1);
		System.out.println(decreasingList);
	}
}