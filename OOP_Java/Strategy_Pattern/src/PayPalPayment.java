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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        if (email.contains("@") && password.length() >= 6) {
            System.out.println("Thanh toán " + amount + " VND qua PayPal (" + email + ") thành công!");
            return true;
        }
        System.out.println("Thông tin PayPal không hợp lệ!");
        return false;
    }

    @Override
    public String getPaymentMethodName() {
        return "PayPal";
    }

    @Override
    public String toString() {
        return "PayPalPayment[email=" + email + ", password=******]";
    }
}