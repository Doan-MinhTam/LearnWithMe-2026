/**
 * Lớp Product đại diện cho một sản phẩm có thể bán.
 * Đây là một lớp dữ liệu cơ bản, chứa các thông tin bất biến của sản phẩm.
 */
public class Product {
    private final String productId;
    private final String name;
    private final double price;

    /**
     * Hàm khởi tạo cho một Product.
     * @param productId ID duy nhất của sản phẩm.
     * @param name Tên sản phẩm.
     * @param price Giá bán của sản phẩm.
     */
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Ghi đè equals để so sánh các sản phẩm dựa trên ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return productId.equals(product.productId);
    }

    @Override
    public int hashCode() {
        return productId.hashCode();
    }
}