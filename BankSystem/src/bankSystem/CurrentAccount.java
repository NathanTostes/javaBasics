package bankSystem;

public class CurrentAccount implements Account {
	private static int currentAccounts;
	private String name;
	private String cpf;
	private int accountNumber;
	private double balance;

	CurrentAccount(String name, String cpf, int accountNumber) {
		CurrentAccount.currentAccounts++;
		this.accountNumber = accountNumber;
		this.name = name;
		this.cpf = cpf;
		this.balance = 0;
	}
	
	CurrentAccount() {
		CurrentAccount.currentAccounts++;
		this.balance = 0;
	}
	
	public String getOwnerName() {
		return this.name;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public static int numberOfAccounts() {
		return currentAccounts;
	}

	public void deposit(double value) throws InvalidValueException {
		if (value <= 0) {
			throw new InvalidValueException("Negative or null deposit");
		} else {
			this.balance += value;
			System.out.println("Sucefull Deposit");
		}
	}

	public void withdraw(double value) throws InvalidValueException {
		if (value <= 0) {
			throw new InvalidValueException("Negative or null withdraw");
		} else if (this.balance < value) {
			throw new InvalidValueException("Insufficient balance");
		} else {
			this.balance -= value;
			System.out.println("Sucefull withdraw");
		}
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", cpf=" + cpf + ", balance=" + balance + "]";
	}
}