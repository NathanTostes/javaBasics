package bankSystem;

public interface Account extends Comparable<Account> {
	public String getOwnerName();
	public int getAccountNumber();
	public double getBalance();
	void deposit(double value) throws InvalidValueException;
	void withdraw(double value) throws InvalidValueException;
}
