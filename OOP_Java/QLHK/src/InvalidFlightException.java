/**
 * Exception khi chuyến bay không hợp lệ
 */
public class InvalidFlightException extends Exception {
    public InvalidFlightException(String message) {
        super(message);
    }
}