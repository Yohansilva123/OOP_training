package encapsulation;

public class Bank {

    private String bankName;
    private String bankBranch;
    private String ownerName;
    private int accountNumber;
    private double balance;

    public Bank(String bankName, String bankBranch, String ownerName, int accountNumber, double balance){
        this.bankName = bankName;
        this.bankBranch = bankBranch;
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getBankName(){
        return this.bankName;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("Deposit successful with amount " + amount + " to account number " + this.accountNumber);
        System.out.println("your balance is " + this.balance);
        return this.balance;
    }

    public double withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient balance");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Withdrawal successful with amount " + amount + " from account number " + this.accountNumber);
            System.out.println("your balance is " + this.balance);
        }
        return this.balance;
    }
}
