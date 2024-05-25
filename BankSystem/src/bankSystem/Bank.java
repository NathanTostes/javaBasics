package bankSystem;

import java.util.*;

public class Bank {
	public static ArrayList<Account> accountList = new ArrayList<>();

	public static void addAccount(Account account) {
		accountList.add(account);
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
	
	public static void sortAccounts() {
		Collections.sort(accountList);
	}
	
	public static void shuffleAccounts() {
		Collections.shuffle(accountList);
	}
}
