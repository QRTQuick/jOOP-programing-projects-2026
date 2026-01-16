package projecttwo;

public class Customer {
    private String id;
    private String name;
    private Account account;

    public Customer(String id, String name, Account account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', account=" + (account != null ? account.getAccountNumber() : "none") + "}";
    }
}
