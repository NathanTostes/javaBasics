package bankSystem;

import java.util.*;

public class Sets {
	public static void main(String[] args) {
		Set<String> langs = new TreeSet<>((o1, o2) -> o1.compareTo(o2) * -1);
		langs.add("Rust");
		langs.add("Elixir");
		langs.add("Java");
		langs.add("Phyton");
		langs.add("JavaScript");
		langs.add("C");
		Iterator<String> iterator = langs.iterator();
		while(iterator.hasNext()) {
			String langName = iterator.next();
			System.out.println(langName);
		}
	}
}