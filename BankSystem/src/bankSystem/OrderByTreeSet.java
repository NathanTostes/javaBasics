package bankSystem;

import java.util.*;

public class OrderByTreeSet {
	public static void main(String[] args) {
		Set<String> decreasingTree = new TreeSet<>((o1, o2) -> o1.compareTo(o2) * -1);
		decreasingTree.add("Nathan");
		decreasingTree.add("Luis");
		decreasingTree.add("Marcos");
		decreasingTree.add("Vanessa");
		decreasingTree.add("Joao");
		decreasingTree.add("Bruno");
		decreasingTree.add("Anna");
		decreasingTree.add("Tarantino");
		System.out.println(decreasingTree);
	}
}