import java.util.*;

/**
 * Class BasicMilkTea - Trà sữa thường
 *
 * MÔ TẢ:
 * - BasicMilkTea là một loại MilkTea
 * - Có 4 thuộc tính:
 *   + orderId (String): Mã đơn
 *   + customerName (String): Tên khách
 *   + tasteScore (double): Điểm ngon (0-10)
 *   + quantity (int): Số ly
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getOrderId(), getCustomerName(), getTasteScore(), getQuantity(): return thuộc tính
 *    - calculateTotal(): Tổng tiền = quantity * 45000
 *    - canGetGift(): Đủ điều kiện nếu quantity >= 5 VÀ tasteScore >= 8.0
 *    - getQualityRank():
 *        + tasteScore >= 9.0: "Xuất sắc"
 *        + tasteScore >= 8.0: "Giỏi"
 *        + tasteScore >= 6.5: "Khá"
 *        + tasteScore >= 5.0: "Trung bình"
 *        + tasteScore < 5.0: "Yếu"
 * 4. Override toString():
 *    [TRÀ SỮA THƯỜNG] Mã đơn: [orderId]
 *    Khách: [customerName]
 *    Điểm ngon: [tasteScore]
 *    Số ly: [quantity]
 */
class BasicMilkTea implements MilkTea {
    private String orderId;
    private String customerName;
    private double tasteScore;
    private int quantity;

    public BasicMilkTea(String orderId, String customerName, double tasteScore, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.tasteScore = tasteScore;
        this.quantity = quantity;
    }

    @Override
    public String getOrderId() { return orderId; }

    @Override
    public String getCustomerName() { return customerName; }

    @Override
    public double getTasteScore() { return tasteScore; }

    @Override
    public int getQuantity() { return quantity; }

    @Override
    public double calculateTotal() {
        return quantity * 45000.0;
    }

    @Override
    public boolean canGetGift() {
        return quantity >= 5 && tasteScore >= 8.0;
    }

    @Override
    public String getQualityRank() {
        if (tasteScore >= 9.0) return "Xuất sắc";
        if (tasteScore >= 8.0) return "Giỏi";
        if (tasteScore >= 6.5) return "Khá";
        if (tasteScore >= 5.0) return "Trung bình";
        return "Yếu";
    }

    @Override
    public String toString() {
        return "[TRÀ SỮA THƯỜNG] Mã đơn: " + orderId + "\n"
                + "Khách: " + customerName + "\n"
                + "Điểm ngon: " + tasteScore + "\n"
                + "Số ly: " + quantity;
    }
}