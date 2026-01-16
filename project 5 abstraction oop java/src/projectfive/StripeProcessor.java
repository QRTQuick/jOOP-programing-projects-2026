package projectfive;

public class StripeProcessor implements PaymentProcessor {
    private String apiKey;

    public StripeProcessor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing $" + amount + " with Stripe (apiKey=" + apiKey + ")");
        return true;
    }
}
