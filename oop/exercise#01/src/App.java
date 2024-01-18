public class App {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.openAccount("Nathan", "CP");
        myAccount.withdraw(150);
        // myAccount.monthlyPayment();
        myAccount.deposit(1833.11f);
        myAccount.closeAccount();
        myAccount.status();
    }
}
