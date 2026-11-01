/**
 * Exception khi bệnh nhân không hợp lệ
 */
public class InvalidPatientException extends Exception {
    public InvalidPatientException(String message) {
        super(message);
    }
}