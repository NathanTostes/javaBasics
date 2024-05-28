package bankSystem;

import java.util.*;

public class Bank {
	private static Set<Account> accountList = new HashSet<>();
	public static Map<String, Account> ownerList = new HashMap<>();

	public static void addAccount(Account account) {
		accountList.add(account);
		ownerList.put(account.getOwnerName(), account);
	}
	
	public static void removeAccount(Account account) {
		accountList.remove(account);
	}
	
	public static boolean containsAccount(Account account) {
		return accountList.contains(account);
	}

	public static void showAccounts() {
		accountList.forEach((account) -> System.out.println(account));
		System.out.println("The bank has " + accountList.size() + " accounts");
	}

	public static Account searchAccountByOwner(String ownerName) {
		return ownerList.get(ownerName);
	}
}
