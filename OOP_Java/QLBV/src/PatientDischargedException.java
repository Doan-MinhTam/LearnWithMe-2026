/**
 * Exception khi bệnh nhân đã xuất viện
 */
public class PatientDischargedException extends Exception {
    public PatientDischargedException(String message) {
        super(message);
    }
}