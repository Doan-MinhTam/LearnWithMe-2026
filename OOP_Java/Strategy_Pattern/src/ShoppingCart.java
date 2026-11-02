/**
 * Class ShoppingCart
 * Mô tả: Giỏ hàng sử dụng Strategy Pattern để xử lý thanh toán
 * Sinh viên KHÔNG cần chỉnh sửa class này
 */
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    private double totalAmount;
    
    public ShoppingCart() {
        this.totalAmount = 0;
    }
    
    public void addItem(double price) {
        totalAmount += price;
        System.out.println("Đã thêm sản phẩm giá " + price + " VND vào giỏ hàng");
    }
    
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        System.out.println("Đã chọn phương thức thanh toán: " + paymentStrategy.getPaymentMethodName());
    }
    
    public boolean checkout() {
        if (paymentStrategy == null) {
            System.out.println("Vui lòng chọn phương thức thanh toán!");
            return false;
        }
        
        System.out.println("Tổng tiền cần thanh toán: " + totalAmount + " VND");
        boolean result = paymentStrategy.pay(totalAmount);
        
        if (result) {
            totalAmount = 0;
        }
        
        return result;
    }
    
    public double getTotalAmount() {
        return totalAmount;
    }
}