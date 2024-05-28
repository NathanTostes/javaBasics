package bankSystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Bank.addAccount(new CurrentAccount("Nathan", "32923042893"));
		Bank.addAccount(new CurrentAccount("Mary", "38290438281"));
		Bank.addAccount(new CurrentAccount("Johan", "89290438281"));
		Bank.addAccount(new CurrentAccount("Anna", "41290438281"));
		Bank.addAccount(new CurrentAccount("Tarantino", "01290438281", 8000, 30));
		Bank.addAccount(new CurrentAccount("Tarantino", "01290438281", 8000, 30));
		Bank.showAccounts();
		System.out.println(Bank.searchAccountByOwner("Nathan"));
	}
}