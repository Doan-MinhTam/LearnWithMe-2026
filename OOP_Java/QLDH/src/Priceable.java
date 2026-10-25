/**
 * Interface cho các đối tượng có thể tính giá
 */
interface Priceable {
    /**
     * Tính tổng giá
     * @return Tổng giá tiền
     */
    double calculateTotal();
    
    /**
     * Áp dụng giảm giá
     * @param discountPercent Phần trăm giảm giá (0-100)
     * @return Giá sau khi giảm
     */
    double applyDiscount(double discountPercent);
}

