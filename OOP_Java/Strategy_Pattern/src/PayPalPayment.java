/**
 * Class PayPalPayment
 * Mô tả: Chiến lược thanh toán bằng PayPal
 * 
 * Thuộc tính:
 * - email: String - Email tài khoản PayPal
 * - password: String - Mật khẩu
 * 
 * Yêu cầu:
 * 1. Implement interface PaymentStrategy
 * 2. Constructor nhận vào email và password
 * 3. Hàm pay():
 *    - Kiểm tra email có chứa ký tự '@' không
 *    - Kiểm tra password có độ dài >= 6 không
 *    - Nếu hợp lệ: in "Thanh toán [amount] VND qua PayPal ([email]) thành công!" và return true
 *    - Nếu không hợp lệ: in "Thông tin PayPal không hợp lệ!" và return false
 * 4. Hàm getPaymentMethodName(): return "PayPal"
 * 5. Override toString(): return "PayPalPayment[email=XXXX, password=******]"
 *    (password luôn hiển thị là *****)
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    
}