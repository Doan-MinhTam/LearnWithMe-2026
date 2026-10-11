/**
 * Class FoodProduct - Đại diện cho sản phẩm thực phẩm
 * 
 * MÔ TẢ:
 * - FoodProduct là một loại Product
 * - Có 5 thuộc tính:
 *   + productId (String): Mã sản phẩm
 *   + name (String): Tên sản phẩm
 *   + basePrice (double): Giá gốc
 *   + stockQuantity (int): Số lượng tồn kho
 *   + shelfLifeDays (int): Hạn sử dụng (ngày)
 * 
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 5 tham số
 * 3. Implement các phương thức:
 *    - getProductId(), getName(), getBasePrice(), getStockQuantity(): return thuộc tính tương ứng
 *    
 *    - calculateFinalPrice(discountPercent):
 *        + Thực phẩm có thuế VAT 5%
 *        + Công thức: basePrice * (1 + 0.05) * (1 - discountPercent/100)
 *        + Ví dụ: basePrice=25k, discount=15% → 25k * 1.05 * 0.85 = 22,312.5
 *    
 *    - calculateInventoryValue():
 *        + Tính tổng giá trị hàng tồn kho (không giảm giá)
 *        + Công thức: calculateFinalPrice(0) * stockQuantity
 *    
 *    - needsRestock():
 *        + Thực phẩm cần nhập hàng khi tồn kho < 50
 *        + Return: stockQuantity < 50
 *    
 *    - updateStock(quantity):
 *        + quantity > 0: nhập thêm hàng
 *        + quantity < 0: bán hàng
 *        + Kiểm tra: nếu bán mà không đủ hàng thì return false
 *        + Nếu hợp lệ: cập nhật stockQuantity và return true
 * 
 * 4. Override toString():
 *    Format (5 dòng):
 *    [THỰC PHẨM] Mã SP: [productId]
 *    Tên: [name]
 *    Giá gốc: [basePrice] VNĐ
 *    Tồn kho: [stockQuantity]
 *    Hạn sử dụng: [shelfLifeDays] ngày
 */
class FoodProduct implements Product {
    // TODO: Khai báo thuộc tính
    private String productId;
    private String name;
    private double basePrice;
    private int stockQuantity;
    private int shelfLifeDays;
    // TODO: Constructor
    public FoodProduct(String productId, String name, double basePrice, int stockQuantity, int shelfLifeDays) {
        this.productId = productId;
        this.name = name;
        this.basePrice = basePrice;
        this.stockQuantity = stockQuantity;
        this.shelfLifeDays = shelfLifeDays;
    }

    @Override
    public int getStockQuantity() {
        return stockQuantity;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getProductId() {
        return productId;
    }
    // TODO: Implement các phương thức từ interface
    @Override
    public double calculateFinalPrice(double discountPercent) {
        return basePrice * (1 + 0.05) * (1 - discountPercent / 100);
    }

    @Override
    public double calculateInventoryValue() {
        return calculateFinalPrice(0) * stockQuantity;
    }

    @Override
    public boolean needsRestock() {
        return stockQuantity < 50;
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
        return "[THỰC PHẨM] Mã SP: " + productId + "\n"
                + "Tên: " + name + "\n"
                + "Giá gốc: " + basePrice + " VNĐ\n"
                + "Tồn kho: " + stockQuantity + "\n"
                + "Hạn sử dụng: " + shelfLifeDays + " ngày";
    }
}

