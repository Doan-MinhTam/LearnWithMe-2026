/**
 * Lớp CartItem đại diện cho một món hàng trong giỏ hàng.
 * Nó liên kết một Product với một số lượng cụ thể.
 * Đây là một ví dụ điển hình của Composition.
 */
public class CartItem {
    private final Product product;
    private int quantity;

    /**
     * Hàm khởi tạo cho một CartItem.
     * @param product Sản phẩm được thêm vào.
     * @param quantity Số lượng ban đầu.
     */
    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Tăng số lượng của món hàng này.
     * @param amount Số lượng cần tăng thêm.
     */
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }

    /**
     * Cập nhật số lượng của món hàng.
     * @param quantity Số lượng mới.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Tính tổng tiền cho món hàng này (giá sản phẩm * số lượng).
     * Ví dụ: Nếu sản phẩm có giá 10,000 và số lượng là 3, hàm này phải trả về 30,000.
     * @return Tổng tiền của món hàng (price * quantity).
     */
    public double getSubtotal() {
        // TODO: Học viên hoàn thiện hàm này
        return product.getPrice() * getQuantity(); // Xóa dòng này và viết code của bạn
    }
}