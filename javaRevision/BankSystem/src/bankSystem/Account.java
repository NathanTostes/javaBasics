package bankSystem;

public interface Account {
	void deposit(double value) throws InvalidValueException;
	void withdraw(double value) throws InvalidValueException;
}
