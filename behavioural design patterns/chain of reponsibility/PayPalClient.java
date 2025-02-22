public class PayPalClient {
    public static void main(String[] args) {
        PaymentHandler authorizationHandler = new AuthorizationHandler();
        PaymentHandler transactionHandler = new TransactionHandler();
        PaymentHandler notificationHandler = new NotificationHandler();

        authorizationHandler.setNextHandler(transactionHandler);
        transactionHandler.setNextHandler(notificationHandler);

        PaymentRequest paymentRequest = new PaymentRequest(100.0);

        // The PayPalClient creates a PaymentRequest and sends it to the first handler in the chain.
        authorizationHandler.processPayment(paymentRequest);
    }
}

// Output:

// Authorizing payment of $100.0
// Payment authorized.
// Processing transaction of $100.0
// Transaction completed.
// Sending payment confirmation notification.