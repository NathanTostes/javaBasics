package bankSystem;

import java.util.*;

public class CurrentAccount implements Account {
	private static int currentAccounts;
	private String name;
	private String cpf;
	private int accountNumber;
	private int agencyNumber;
	private double balance;

	CurrentAccount(String name, String cpf, int accountNumber, int agencyNumber, double balance) {
		CurrentAccount.currentAccounts++;
		this.name = name;
		this.cpf = cpf;
		this.accountNumber = accountNumber;
		this.agencyNumber = agencyNumber;
		this.balance = balance;
	}
	
	CurrentAccount(String name, String cpf, int accountNumber, int agencyNumber) {
		CurrentAccount.currentAccounts++;
		this.name = name;
		this.cpf = cpf;
		this.accountNumber = accountNumber;
		this.agencyNumber = agencyNumber;
		this.balance = 0;
	}

	CurrentAccount() {
		CurrentAccount.currentAccounts++;
		this.balance = 0;
	}

	public String getOwnerName() {
		return this.name;
	}
	
	public String getOwnerCpf() {
		return this.cpf;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public int getAgencyNumber() {
		return this.agencyNumber;
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
		return "Account [name=" + name + ", cpf=" + cpf + ", accountNumber=" + accountNumber + ", agencyNumber=" + agencyNumber + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(Account anotherAccount) {
		return this.getOwnerName().compareTo(anotherAccount.getOwnerName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, agencyNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CurrentAccount other = (CurrentAccount) obj;
		return accountNumber == other.accountNumber && agencyNumber == other.agencyNumber;
	}
}