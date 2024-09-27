package lfe.sample.refactoring;

public class PaymentProcessor {
    public static PaymentProcessor getInstance(PaymentMethod paymentMethod) {
        return new PaymentProcessor(paymentMethod);
    }

    public enum PaymentMethod {
        CREDIT_CARD, PAYPAL, STRIPE
    }

    private PaymentMethod paymentMethod;

    private PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        switch (paymentMethod) {
            case CREDIT_CARD:
                System.out.println("Processing Credit Card payment of $" + amount);
                break;
            case PAYPAL:
                System.out.println("Processing PayPal payment of $" + amount);
                break;
            case STRIPE:
                System.out.println("Processing Stripe payment of $" + amount);
                break;
            default:
                throw new UnsupportedOperationException("Unknown payment method");
        }
    }

    public static void main(String[] args) {
        PaymentProcessor processor = getInstance(PaymentMethod.CREDIT_CARD);
        processor.processPayment(100.00);
    }
}

