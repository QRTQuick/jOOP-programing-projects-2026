package projectfive;

public class Order {
    private String id;
    private double amount;
    private PaymentProcessor processor;

    public Order(String id, double amount, PaymentProcessor processor) {
        this.id = id;
        this.amount = amount;
        this.processor = processor;
    }

    public void checkout() {
        System.out.println("Order " + id + " checkout...");
        boolean ok = processor.processPayment(amount);
        System.out.println(ok ? "Payment successful" : "Payment failed");
    }
}
