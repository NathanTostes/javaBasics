package bankSystem;

import java.util.*;

public class TestSortList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Pedro");
		names.add("Anna");
		names.add("Tesla");
		names.add("Johan");
		names.add("Nathan");
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);		
 	}
}
