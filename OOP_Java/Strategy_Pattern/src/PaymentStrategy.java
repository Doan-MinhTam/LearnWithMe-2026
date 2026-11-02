/**
 * Interface PaymentStrategy
 * Mô tả: Định nghĩa chiến lược thanh toán
 * Sinh viên KHÔNG cần chỉnh sửa interface này
 */
public interface PaymentStrategy {
    /**
     * Thực hiện thanh toán
     * @param amount - số tiền cần thanh toán (double)
     * @return true nếu thanh toán thành công, false nếu thất bại
     */
    boolean pay(double amount);
    
    /**
     * Lấy tên phương thức thanh toán
     * @return tên phương thức (String)
     */
    String getPaymentMethodName();
}