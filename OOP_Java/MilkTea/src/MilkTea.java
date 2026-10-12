/**
 * Interface MilkTea - Đại diện cho một đơn trà sữa
 */
interface MilkTea {
    String getOrderId();
    String getCustomerName();
    double getTasteScore();   // 0-10
    int getQuantity();        // số ly

    double calculateTotal();  // tổng tiền (VNĐ)
    boolean canGetGift();     // đủ điều kiện nhận quà
    String getQualityRank();  // xếp loại theo tasteScore
}