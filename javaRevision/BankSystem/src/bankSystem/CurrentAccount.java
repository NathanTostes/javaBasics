package bankSystem;

public class CurrentAccount implements Account {
	private static int savingAccounts;
	private String name;
	private String cpf;
	private int accountNumber;
	private double balance;

	CurrentAccount(String name, String cpf, int accountNumber) {
		CurrentAccount.savingAccounts++;
		this.accountNumber = accountNumber;
		this.name = name;
		this.cpf = cpf;
		this.balance = 0;
	}
	
	public double getBalance() {
		return this.balance;
	}

	public int getAccountCount() {
		return savingAccounts;
	}

	public void deposit(double value) {
		if (value < 0) {
			System.out.println("Error to deposit, invalid value");
		} else {
			this.balance += value;
			System.out.println("Sucefull Deposit");
		}
	}

	public void withdraw(double value) {
		if (value <= 0) {
			System.out.println("Error to withdraw, invalid value");
		} else if (this.balance < value) {
			System.out.println("Error to withdraw, insuficient balance");
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