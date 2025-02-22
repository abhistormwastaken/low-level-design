// interface to implement Handlers for different steps
public interface PaymentHandler {
    // The handlers are chained together using setNextHandler()
    void setNextHandler(PaymentHandler handler);
    void processPayment(PaymentRequest request);
}