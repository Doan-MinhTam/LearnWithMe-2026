/**
 * Exception khi đặt vé không hợp lệ
 */
public class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}