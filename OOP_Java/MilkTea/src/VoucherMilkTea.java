import java.util.*;

/**
 * Class VoucherMilkTea - Trà sữa có voucher
 *
 * MÔ TẢ:
 * - VoucherMilkTea là một loại MilkTea
 * - Có 5 thuộc tính:
 *   + orderId (String): Mã đơn
 *   + customerName (String): Tên khách
 *   + tasteScore (double): Điểm ngon (0-10)
 *   + quantity (int): Số ly
 *   + voucherAmount (double): Tiền giảm (VNĐ)
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getOrderId(), getCustomerName(), getTasteScore(), getQuantity(): return thuộc tính
 *    - calculateTotal():
 *        + Tổng gốc = quantity * 45000
 *        + Tổng thực = tổng gốc - voucherAmount
 *        + Nếu tổng thực < 0 thì return 0
 *    - canGetGift(): Đủ điều kiện nếu quantity >= 5 VÀ tasteScore >= 8.0
 *    - getQualityRank(): Giống BasicMilkTea
 * 4. Override toString():
 *    [TRÀ SỮA VOUCHER] Mã đơn: [orderId]
 *    Khách: [customerName]
 *    Điểm ngon: [tasteScore]
 *    Số ly: [quantity]
 *    Voucher: [voucherAmount] VNĐ
 */
class VoucherMilkTea implements MilkTea {
    private String orderId;
    private String customerName;
    private double tasteScore;
    private int quantity;
    private double voucherAmount;

    public VoucherMilkTea(String orderId, String customerName, double tasteScore, int quantity, double voucherAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.tasteScore = tasteScore;
        this.quantity = quantity;
        this.voucherAmount = voucherAmount;
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
        double total = quantity * 45000.0 - voucherAmount;
        return total < 0 ? 0 : total;
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
        return "[TRÀ SỮA VOUCHER] Mã đơn: " + orderId + "\n"
                + "Khách: " + customerName + "\n"
                + "Điểm ngon: " + tasteScore + "\n"
                + "Số ly: " + quantity + "\n"
                + "Voucher: " + voucherAmount + " VNĐ";
    }
}