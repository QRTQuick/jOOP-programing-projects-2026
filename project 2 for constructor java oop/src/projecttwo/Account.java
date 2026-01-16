package projecttwo;

public class Account {
    private String accountNumber;
    private String owner;
    private double balance;

    public Account(String accountNumber, String owner) {
        this(accountNumber, owner, 0.0);
    }

    public Account(String accountNumber, String owner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialDeposit;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to " + accountNumber);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdraw amount must be positive");
        }
        if (amount > balance) {
            System.out.println("Insufficient funds for " + accountNumber);
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + " from " + accountNumber);
        return true;
    }

    @Override
    public String toString() {
        return "Account{accountNumber='" + accountNumber + "', owner='" + owner + "', balance=" + balance + "}";
    }
}
