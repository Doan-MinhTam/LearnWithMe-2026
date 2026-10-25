/**
 * Exception khi thanh toán thất bại
 */
public class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}