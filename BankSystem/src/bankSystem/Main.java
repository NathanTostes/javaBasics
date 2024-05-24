package bankSystem;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Bank.addAccount(new CurrentAccount("Nathan", "32923042893", 3204));
		Account clientAccount = new CurrentAccount("Mary", "38290438281", 8762);
		Bank.addAccount(clientAccount);
		Bank.showAccounts();
		Bank.removeAccount(clientAccount);
		Bank.showAccounts();
	}
}