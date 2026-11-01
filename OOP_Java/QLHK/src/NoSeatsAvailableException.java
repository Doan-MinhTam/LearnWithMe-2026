/**
 * Exception khi không còn ghế trống
 */
public class NoSeatsAvailableException extends Exception {
    public NoSeatsAvailableException(String message) {
        super(message);
    }
}