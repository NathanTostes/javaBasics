package bankSystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Random numberGenerator = new Random();
		Bank.addAccount(new CurrentAccount("Nathan", "32923042893", numberGenerator.nextInt(10000)));
		Bank.addAccount(new CurrentAccount("Mary", "38290438281", numberGenerator.nextInt(10000)));
		Bank.addAccount(new CurrentAccount("Johan", "89290438281", numberGenerator.nextInt(10000)));
		Bank.addAccount(new CurrentAccount("Anna", "41290438281", numberGenerator.nextInt(10000)));
		Bank.addAccount(new CurrentAccount("Tarantino", "01290438281", numberGenerator.nextInt(10000)));
		Bank.sortAccounts();
		Bank.showAccounts();
	}
}