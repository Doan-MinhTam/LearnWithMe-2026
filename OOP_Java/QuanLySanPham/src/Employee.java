/**
 * Interface Product - Đại diện cho một sản phẩm
 */
interface Product {
    /**
     * Lấy mã sản phẩm
     * @return Mã sản phẩm
     */
    String getProductId();
    
    /**
     * Lấy tên sản phẩm
     * @return Tên sản phẩm
     */
    String getName();
    
    /**
     * Lấy giá gốc của sản phẩm
     * @return Giá gốc (VNĐ)
     */
    double getBasePrice();
    
    /**
     * Lấy số lượng tồn kho
     * @return Số lượng trong kho
     */
    int getStockQuantity();
    
    /**
     * Tính giá bán cuối cùng sau khi áp dụng thuế và giảm giá
     * @param discountPercent Phần trăm giảm giá (0-100)
     * @return Giá bán cuối cùng (VNĐ)
     */
    double calculateFinalPrice(double discountPercent);
    
    /**
     * Tính tổng giá trị hàng tồn kho
     * @return Tổng giá trị (VNĐ)
     */
    double calculateInventoryValue();
    
    /**
     * Kiểm tra sản phẩm có cần nhập thêm hàng không
     * @return true nếu cần nhập hàng, false nếu không
     */
    boolean needsRestock();
    
    /**
     * Cập nhật số lượng tồn kho
     * @param quantity Số lượng thay đổi (dương: nhập thêm, âm: bán ra)
     * @return true nếu cập nhật thành công, false nếu không đủ hàng
     */
    boolean updateStock(int quantity);
}