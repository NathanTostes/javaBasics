package bankSystem;

public class Manager implements EmployeeAuthenticable {
	private String name;
	private String cpf;
	private double salary;
	private String password;

	public Manager(String name, String cpf, double salary, String password) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.password = password;
	}

	@Override
	public boolean autentification(String password) {
		if (this.password == password) {
			return true;
		} else {
			return false;
		}
	}

	public double getSalaryBonus() {
		return (this.salary * 0.1) + 1000;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", cpf=" + cpf + ", salary=" + salary + ", password=" + password + "]";
	}
}
