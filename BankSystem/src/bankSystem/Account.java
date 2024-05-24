package bankSystem;

public interface Account {
	public String getOwnerName();
	public int getAccountNumber();
	public double getBalance();
	void deposit(double value) throws InvalidValueException;
	void withdraw(double value) throws InvalidValueException;
}
