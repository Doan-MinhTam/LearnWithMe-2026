import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {
    private final List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    /**
     * [BÀI TẬP] Thêm sản phẩm vào giỏ hàng.
     * Logic: 
     * 1. Nếu sản phẩm đã có (dựa trên equals của Product), tăng số lượng bằng increaseQuantity().
     * 2. Nếu chưa có, tạo CartItem mới và thêm vào danh sách.
     */
    public void addProduct(Product product, int quantity) {
        // TODO: Học viên hoàn thiện hàm này
    }

    /**
     * [BÀI TẬP] Tính tổng giá trị của cả giỏ hàng.
     * @return Tổng tiền của tất cả CartItem (gọi getSubtotal()).
     */
    public double calculateTotal() {
        // TODO: Học viên hoàn thiện hàm này
        return 0;
    }

    /**
     * [BÀI TẬP] Trả về chuỗi chi tiết giỏ hàng.
     * Yêu cầu: Nối thông tin các sản phẩm và tổng cộng.
     * Không sử dụng các dòng kẻ trang trí (====, ----).
     */
    public String getCartSummary() {
        if (items.isEmpty()) return "Giỏ hàng trống.";
        
        StringBuilder sb = new StringBuilder();
        sb.append("Chi tiết giỏ hàng:\n");
        for (CartItem item : items) {
            Product p = item.getProduct();
            sb.append(String.format("%s | SL: %d | Đơn giá: %,.0f | Thành tiền: %,.0f\n",
                    p.getName(), item.getQuantity(), p.getPrice(), item.getSubtotal()));
        }
        sb.append(String.format("TỔNG CỘNG: %,.0f VND", calculateTotal()));
        return sb.toString();
    }

    public void updateQuantity(Product product, int newQuantity) {
        findItemByProduct(product).ifPresent(item -> {
            if (newQuantity > 0) item.setQuantity(newQuantity);
            else removeProduct(product);
        });
    }

    public void removeProduct(Product product) {
        items.removeIf(item -> item.getProduct().equals(product));
    }

    public List<CartItem> getItems() { return new ArrayList<>(items); }

    private Optional<CartItem> findItemByProduct(Product product) {
        return items.stream().filter(item -> item.getProduct().equals(product)).findFirst();
    }
}