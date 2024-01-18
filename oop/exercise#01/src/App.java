public class App {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.openAccount("Nathan", "CP");
        myAccount.monthlyPayment();
        myAccount.deposit(1800.5f);
        // myAccount.withdraw(1930.5f);
        myAccount.closeAccount();
        myAccount.status();
    }
}
