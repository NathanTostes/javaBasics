package bankSystem;

import java.util.*;
import java.io.*;

public abstract class Bank {
	private static Set<Account> accountList = new HashSet<>();
	public static Map<String, Account> ownerNameList = new HashMap<>();

	public static void addAccount(Account account) {
		accountList.add(account);
		ownerNameList.put(account.getOwnerName(), account);
	}
	
	public static void removeAccount(Account account) {
		accountList.remove(account);
	}
	
	public static boolean containsAccount(String ownerName) {
		return accountList.contains(ownerNameList.get(ownerName));
	}

	public static void showAccounts() {
		Bank.getAllData();
		accountList.forEach((account) -> System.out.println(account));
		System.out.println("The bank has " + accountList.size() + " accounts");
	}
	
	public static void saveAllData() {
		getAllData();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("bankAccountsData.txt"))) {
			for(Account account : accountList) {
				writer.write(account.getOwnerName() + "," + account.getOwnerCpf() + "," + account.getAccountNumber() + "," + account.getAgencyNumber() + "," + account.getBalance());
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Account getAccountByOwner(String ownerName) throws NullPointerException {
		return ownerNameList.get(ownerName);
	}
	
	public static void getAllData() {
		String accountData;
		String accountOwnerName;
		String[] separatedData;
		try(BufferedReader reader = new BufferedReader(new FileReader("bankAccountsData.txt"))) {
			accountData = reader.readLine();
			while(accountData != null) {
				separatedData = accountData.split(",");
				accountOwnerName = separatedData[0];
				if(!containsAccount(accountOwnerName)) {
					Bank.addAccount(new CurrentAccount(separatedData[0],separatedData[1],Integer.parseInt(separatedData[2]),Integer.parseInt(separatedData[3]),Double.parseDouble(separatedData[4])));
				}
				accountData = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}