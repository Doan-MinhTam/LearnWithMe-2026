/**
 * Class CreditCardPayment
 * Mô tả: Chiến lược thanh toán bằng thẻ tín dụng
 * 
 * Thuộc tính:
 * - cardNumber: String - Số thẻ tín dụng (16 chữ số)
 * - cardHolderName: String - Tên chủ thẻ
 * - cvv: String - Mã CVV (3 chữ số)
 * - expiryDate: String - Ngày hết hạn (MM/YY)
 * 
 * Yêu cầu:
 * 1. Implement interface PaymentStrategy
 * 2. Constructor nhận vào tất cả các thuộc tính
 * 3. Hàm pay(): 
 *    - Kiểm tra số thẻ có đúng 16 chữ số không
 *    - Kiểm tra CVV có đúng 3 chữ số không
 *    - Nếu hợp lệ: in "Thanh toán [amount] VND bằng thẻ tín dụng [cardNumber] thành công!" và return true
 *    - Nếu không hợp lệ: in "Thông tin thẻ không hợp lệ!" và return false
 * 4. Hàm getPaymentMethodName(): return "Credit Card"
 * 5. Override toString(): return thông tin đầy đủ của thẻ theo format:
 *    "CreditCardPayment[cardNumber=XXXX, cardHolderName=XXXX, cvv=XXX, expiryDate=XX/XX]"
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String cvv;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean pay(double amount) {
        if (!cardNumber.matches("[0-9]{16}")) {
            System.out.println("Thông tin thẻ không hợp lệ!");
            return false;
        }
        if (!cvv.matches("[0-9]{3}")) {
            System.out.println("Thông tin thẻ không hợp lệ!");
            return false;
        }
        System.out.println("Thanh toán " + amount + " VND bằng thẻ tín dụng " + cardNumber + " thành công!");
        return true;
    }

    @Override
    public String getPaymentMethodName() {
        return "Credit Card";
    }

    @Override
    public String toString() {
        return "CreditCardPayment[cardNumber=" + cardNumber + ", cardHolderName=" + cardHolderName
                + ", cvv=" + cvv + ", expiryDate=" + expiryDate + "]";
    }
}