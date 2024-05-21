package bankSystem;

public class Main {
	public static void main(String[] args) {
		EmployeeAuthenticable a1 = new Manager("Nathan", "32489408349", 10000, "8008");
		System.out.println(a1.toString());
		Account clientAccount = new CurrentAccount("Nathan", "32923042893", 3204);
		try {
			clientAccount.deposit(500);
		} catch (InvalidValueException exception) {
			System.out.println(exception.getMessage());
		}
		try {
			clientAccount.withdraw(600);	
		} catch (InvalidValueException exception) {
			System.out.println(exception.getMessage());
		}
	}
}
