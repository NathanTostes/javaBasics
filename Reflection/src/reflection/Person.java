package reflection;

public class Person {
	private final String name;
	private int age;
	private float weight;
	
	public Person(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void walk() {
		System.out.println(name + " is walking...");
	}
	
	public static String getAnimalGroup() {
		return "mammal";
	}
}