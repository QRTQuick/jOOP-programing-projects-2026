package projecttwo;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String name;
    private Map<String, Account> accounts = new HashMap<>();

    public Bank(String name) {
        this.name = name;
    }

    public Account createAccount(String accountNumber, String owner, double initialDeposit) {
        Account acc = new Account(accountNumber, owner, initialDeposit);
        accounts.put(accountNumber, acc);
        System.out.println("Created account " + accountNumber + " for " + owner);
        return acc;
    }

    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean transfer(String fromAcc, String toAcc, double amount) {
        Account a = accounts.get(fromAcc);
        Account b = accounts.get(toAcc);
        if (a == null || b == null) {
            System.out.println("One of the accounts not found");
            return false;
        }
        if (a.withdraw(amount)) {
            b.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAcc + " to " + toAcc);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank{name='" + name + "', accounts=" + accounts.keySet() + "}";
    }
}
