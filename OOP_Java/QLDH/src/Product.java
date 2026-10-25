/**
 * CLASS 1: Product - Đại diện cho một sản phẩm
 * <p>
 * THUỘC TÍNH:
 * - productId: String - Mã sản phẩm (duy nhất)
 * - productName: String - Tên sản phẩm
 * - price: double - Giá sản phẩm (phải > 0)
 * - stockQuantity: int - Số lượng tồn kho
 * - category: String - Danh mục sản phẩm
 * <p>
 * YÊU CẦU:
 * 1. Implement các interface: Priceable, Displayable, Validatable
 * 2. Constructor nhận đầy đủ tham số (productId, productName, price, stockQuantity, category)
 * 3. Implement phương thức calculateTotal():
 * - Trả về giá của 1 sản phẩm (chỉ trả về price)
 * 4. Implement phương thức applyDiscount(double discountPercent):
 * - Kiểm tra discountPercent phải từ 0-100
 * - Tính giá sau giảm: price * (100 - discountPercent) / 100
 * - Trả về giá sau khi giảm
 * 5. Implement phương thức getDisplayInfo():
 * - Format: "ID: [productId] | Name: [productName] | Price: [price] VND | Stock: [stockQuantity] | Category: [category]"
 * 6. Implement phương thức isValid():
 * - productId không null và không rỗng
 * - productName không null và không rỗng
 * - price > 0
 * - stockQuantity >= 0
 * - category không null và không rỗng
 * 7. Phương thức reduceStock(int quantity):
 * - Giảm số lượng tồn kho
 * - Throw OutOfStockException nếu quantity > stockQuantity
 * 8. Phương thức increaseStock(int quantity):
 * - Tăng số lượng tồn kho (quantity phải > 0)
 * 9. Phương thức isInStock():
 * - Trả về true nếu stockQuantity > 0
 * 10. Override toString() trả về getDisplayInfo()
 * 11. Tạo các getter và setter cho tất cả thuộc tính
 */
public class Product implements Priceable, Displayable, Validatable {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;
    private String category;

    public Product(String productId, String productName, double price, int stockQuantity, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.category = category;
    }

    @Override
    public double calculateTotal() {
        return price;
    }

    @Override
    public double applyDiscount(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        return price * (100 - discountPercent) / 100;
    }

    @Override
    public String getDisplayInfo() {
        return "ID: " + productId + " | Name: " + productName + " | Price: " + price
                + " VND | Stock: " + stockQuantity + " | Category: " + category;
    }

    @Override
    public boolean isValid() {
        if (productId == null || productId.isEmpty()) return false;
        if (productName == null || productName.isEmpty()) return false;
        if (price <= 0) return false;
        if (stockQuantity < 0) return false;
        return category != null && !category.isEmpty();
    }

    public void reduceStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Not enough stock for product '" + productName
                    + "'. Available: " + stockQuantity + ", Requested: " + quantity);
        }
        stockQuantity -= quantity;
    }

    public void increaseStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        stockQuantity += quantity;
    }

    public boolean isInStock() {
        return stockQuantity > 0;
    }

    @Override
    public String toString() {
        return getDisplayInfo();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}