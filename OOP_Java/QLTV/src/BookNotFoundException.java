/**
 * Exception khi không tìm thấy sách
 */
public class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

