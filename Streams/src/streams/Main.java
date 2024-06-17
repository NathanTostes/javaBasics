package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 3, 1, 0, 6, 7, 2, 1, 0, 9, 7, 3, 4, 8, 4);
		System.out.println("Initial List: " + list);
		
		list.stream()
			.distinct()
			.filter(e -> e > 5)
			.map(e -> e * e)
			.forEach(e -> System.out.print(e + " "));
		System.out.println("\nList after forEach: " + list);
		
		Optional<Integer> min = list.stream()
			.min(Comparator.naturalOrder()); 
		System.out.println("Minimal value: " + min.get());
		
		Map<Boolean, List<Integer>> collect = list.stream()
			.distinct()
			.collect(Collectors.groupingBy(e -> e % 2 == 0));
		System.out.println(collect);
		
		list = list.stream()
			.filter(e -> e > 5)
			.collect(Collectors.toList());
		System.out.println("List after collect: " + list);
	}
}