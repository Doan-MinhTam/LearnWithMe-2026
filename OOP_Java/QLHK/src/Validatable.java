/**
 * Interface cho đối tượng có thể validate
 */
public interface Validatable {
    /**
     * Kiểm tra tính hợp lệ của đối tượng
     * @return true nếu hợp lệ
     */
    boolean isValid();
}