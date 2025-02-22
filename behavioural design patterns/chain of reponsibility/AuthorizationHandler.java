// AuthorizationHandler checks if the payment is authorized and simulates the authorization process.
public class AuthorizationHandler implements PaymentHandler {
    private PaymentHandler nextHandler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        if (!request.isAuthorized()) {
            System.out.println("Authorizing payment of $" + request.getAmount());
            // Simulate authorization logic (e.g., check credit card, balance)
            request.setAuthorized(true);
            System.out.println("Payment authorized.");
        }

        if (nextHandler != null) {
            nextHandler.processPayment(request);
        }
    }
}
