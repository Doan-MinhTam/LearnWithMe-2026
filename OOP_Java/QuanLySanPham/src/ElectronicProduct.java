/**
 * Class ElectronicProduct - Đại diện cho sản phẩm điện tử
 * 
 * MÔ TẢ:
 * - ElectronicProduct là một loại Product
 * - Có 5 thuộc tính:
 *   + productId (String): Mã sản phẩm
 *   + name (String): Tên sản phẩm
 *   + basePrice (double): Giá gốc
 *   + stockQuantity (int): Số lượng tồn kho
 *   + warrantyMonths (int): Số tháng bảo hành
 * 
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 5 tham số
 * 3. Implement các phương thức:
 *    - getProductId(), getName(), getBasePrice(), getStockQuantity(): return thuộc tính tương ứng
 *    
 *    - calculateFinalPrice(discountPercent):
 *        + Sản phẩm điện tử có thuế VAT 8%
 *        + Công thức: basePrice * (1 + 0.08) * (1 - discountPercent/100)
 *        + Ví dụ: basePrice=25tr, discount=10% → 25tr * 1.08 * 0.9 = 24.3tr
 *    
 *    - calculateInventoryValue():
 *        + Tính tổng giá trị hàng tồn kho (không giảm giá)
 *        + Công thức: calculateFinalPrice(0) * stockQuantity
 *    
 *    - needsRestock():
 *        + Sản phẩm điện tử cần nhập hàng khi tồn kho < 10
 *        + Return: stockQuantity < 10
 *    
 *    - updateStock(quantity):
 *        + quantity > 0: nhập thêm hàng
 *        + quantity < 0: bán hàng
 *        + Kiểm tra: nếu bán mà không đủ hàng thì return false
 *        + Nếu hợp lệ: cập nhật stockQuantity và return true
 * 
 * 4. Override toString():
 *    Format (5 dòng):
 *    [ĐIỆN TỬ] Mã SP: [productId]
 *    Tên: [name]
 *    Giá gốc: [basePrice] VNĐ
 *    Tồn kho: [stockQuantity]
 *    Bảo hành: [warrantyMonths] tháng
 */
class ElectronicProduct implements Product {
    // TODO: Khai báo thuộc tính
    private String productId;
    private String name;
    private double basePrice;
    private int stockQuantity;
    private int warrantyMonths;
    // TODO: Constructor
    public ElectronicProduct(String productId, String name, double basePrice, int stockQuantity, int warrantyMonths) {
        this.productId = productId;
        this.name = name;
        this.basePrice = basePrice;
        this.stockQuantity = stockQuantity;
        this.warrantyMonths = warrantyMonths;
    }
    // TODO: Implement các phương thức từ interface
    @Override
    public String getProductId() { return productId; }

    @Override
    public String getName() { return name; }

    @Override
    public double getBasePrice() { return basePrice; }

    @Override
    public int getStockQuantity() { return stockQuantity; }

    @Override
    public double calculateFinalPrice(double discountPercent) {
        return basePrice * (1 + 0.08) * (1 - discountPercent / 100);
    }

    @Override
    public double calculateInventoryValue() {
        return calculateFinalPrice(0) * stockQuantity;
    }

    @Override
    public boolean needsRestock() {
        return stockQuantity < 10;
    }

    @Override
    public boolean updateStock(int quantity) {
        if (quantity < 0 && stockQuantity + quantity < 0) {
            return false;
        }
        stockQuantity += quantity;
        return true;
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "[ĐIỆN TỬ] Mã SP: " + productId + "\n"
                + "Tên: " + name + "\n"
                + "Giá gốc: " + basePrice + " VNĐ\n"
                + "Tồn kho: " + stockQuantity + "\n"
                + "Bảo hành: " + warrantyMonths + " tháng";
    }
}
