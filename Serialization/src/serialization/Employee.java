package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 999999999999999999L;
	
	private String name;
	transient private float salary;
	
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void setSalary(float newSalary) {
		this.salary = newSalary;
	}
	public float getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}