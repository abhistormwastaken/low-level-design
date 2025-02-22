// a class to represent the request
// PaymentRequest holds the payment amount and flags to track authorization and processing status
public class PaymentRequest {
    private final double amount;
    private boolean isAuthorized;
    private boolean isProcessed;

    public PaymentRequest(double amount) {
        this.amount = amount;
        this.isAuthorized = false;
        this.isProcessed = false;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }
}