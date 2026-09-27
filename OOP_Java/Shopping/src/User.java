/**
 * Lớp User đại diện cho một người dùng của hệ thống.
 * Mỗi người dùng sở hữu một giỏ hàng (ShoppingCart).
 */
public class User {
    private final String userId;
    private final String name;
    private final ShoppingCart cart;

    /**
     * Hàm khởi tạo cho một User.
     * Tự động tạo một giỏ hàng mới cho người dùng này.
     * @param userId ID của người dùng.
     * @param name Tên người dùng.
     */
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.cart = new ShoppingCart();
    }

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}