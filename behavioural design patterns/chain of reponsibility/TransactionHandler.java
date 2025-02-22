// TransactionHandler checks if the payment is authorized and not yet processed, then simulates the transaction.
public class TransactionHandler implements PaymentHandler {
    private PaymentHandler nextHandler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        if (request.isAuthorized() && !request.isProcessed()) {
            System.out.println("Processing transaction of $" + request.getAmount());
            // Simulate transaction logic (e.g., transfer funds)
            request.setProcessed(true);
            System.out.println("Transaction completed.");
        }

        if (nextHandler != null) {
            nextHandler.processPayment(request);
        }
    }
}