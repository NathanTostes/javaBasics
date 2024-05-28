package bankSystem;

import java.util.*;

public class UsingProperties {
	public static void main(String[] args) {
		Properties configs = new Properties();
		configs.setProperty("account.email", "accountEmail@gmail.com");
		configs.setProperty("account.password", "accountPassword");
		String email = configs.getProperty("account.email");
		String password = configs.getProperty("account.password");
		System.out.println("Email: " + email + "\nPassword: " + password);
	}
}