package projectfive;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor stripe = new StripeProcessor("sk_test_123");
        Order o1 = new Order("ORD-100", 49.99, stripe);
        o1.checkout();

        PaymentProcessor paypal = new PaypalProcessor("client_abc");
        Order o2 = new Order("ORD-101", 19.95, paypal);
        o2.checkout();
    }
}
