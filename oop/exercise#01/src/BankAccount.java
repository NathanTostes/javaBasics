public class BankAccount {
    public int accountNum;
    private String owner;
    protected String type; // CC(Conta Corrente) or CP (Conta Poupança)
    private float balance;
    private boolean status; // False (Close Account) or True (Open Account)

    public BankAccount() {
        this.setBalance(0);
        this.setStatus(false);
    }

    public int getAccountNum() {
        return this.accountNum;
    }
    public void setAccountNum(int newNum) {
        this.accountNum = newNum;
    }

    public String getOwner() {
        return this.owner;
    }
    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public String getType() {
        return this.type;
    }
    public void setType(String newType){
        this.type = newType;
    }

    public float getBalance() {
        return this.balance;
    }
    public void setBalance(float newBalance) {
        this.balance = newBalance;
    }

    public boolean isStatus() {
        return this.status;
    }
    public void setStatus(boolean newStatus){
        this.status = newStatus;
    }

    public void status() {
        System.out.println("Number: " + this.accountNum);
        System.out.println("Owner: " + this.owner);
        System.out.println("Type: " + this.type);
        System.out.println("Balance: " + this.balance);
        System.out.println("Status: " + this.status);
    }

    public void openAccount(String newOwner, String newType) {
        int newNum = (int) Math.ceil(Math.random() * 10000);
        this.setAccountNum(newNum);
        this.setOwner(newOwner);
        this.setStatus(true);
        if (newType.equals("CC")) {
            this.setType("CC");
            balance = 50;
        } else if (newType.equals("CP")) {
            this.setType("CP");
            balance = 150;
        }
    }
    
    public void closeAccount() {
        if (balance == 0) this.setStatus(false);
        else System.out.println("Error in close the account");
    }

    public void withdraw(float monetaryValue) {
        if (this.isStatus() && this.balance >= monetaryValue) this.setBalance(this.balance - monetaryValue);
        else System.out.println("Error in withdraw value, you don't have an account or no have enough money in account");
    }

    public void deposit(float monetaryValue) {
        if (this.isStatus()) this.setBalance(this.balance + monetaryValue);
        else System.out.println("Error in deposit value, you don't have an account");
    }

    public void monthlyPayment() {
        if (this.isStatus()) {
            if (this.type.equals("CC")) this.setBalance(this.balance - 12);
            if (this.type.equals("CP")) this.setBalance(this.balance - 20);
        }
    }
}