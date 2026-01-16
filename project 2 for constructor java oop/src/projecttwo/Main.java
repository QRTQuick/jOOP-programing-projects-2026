package projecttwo;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Acme Bank");

        Account a1 = bank.createAccount("A1001", "Amy", 500.0);
        Account a2 = bank.createAccount("A2001", "Bob", 300.0);

        Customer amy = new Customer("C001", "Amy", a1);
        Customer bob = new Customer("C002", "Bob", a2);

        System.out.println(amy);
        System.out.println(bob);

        a1.deposit(200);
        a2.withdraw(50);

        bank.transfer("A1001", "A2001", 150);

        System.out.println(a1);
        System.out.println(a2);
    }
}
