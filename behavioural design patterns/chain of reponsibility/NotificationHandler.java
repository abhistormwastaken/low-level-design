// NotificationHandler checks if the payment is processed and sends a confirmation notification.
public class NotificationHandler implements PaymentHandler {
    private PaymentHandler nextHandler;

    @Override
    public void setNextHandler(PaymentHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processPayment(PaymentRequest request) {
        if (request.isProcessed()) {
            System.out.println("Sending payment confirmation notification.");
            // Simulate notification logic (e.g., send email, SMS)
        }

        if (nextHandler != null) {
            nextHandler.processPayment(request);
        }
    }
}