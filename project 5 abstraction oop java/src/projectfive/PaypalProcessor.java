package projectfive;

public class PaypalProcessor implements PaymentProcessor {
    private String clientId;

    public PaypalProcessor(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" + amount + " with PayPal (clientId=" + clientId + ")");
        return true;
    }
}
