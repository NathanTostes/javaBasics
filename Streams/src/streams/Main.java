package streams;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 1, 10, 6, 7, 2, 1, 10, 9, 7, 3, 4, 8, 4);
		list.stream()
			.distinct()
			.filter(e -> e > 5)
			.map(e -> e * e)
			.forEach(e -> System.out.println(e));
	}
}