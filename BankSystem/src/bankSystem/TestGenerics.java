package bankSystem;

public class TestGenerics {
	public static void main(String[] args) {
		GenericClass<Double> genericClass = new GenericClass<>(15d);
		System.out.println(genericClass.getObject());
	}
}