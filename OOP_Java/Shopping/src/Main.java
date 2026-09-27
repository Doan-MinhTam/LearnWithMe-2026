public class Main {
    public static void main(String[] args) {

        // =========================
        // 1. Tạo sản phẩm
        // =========================

        Product laptop = new Product(
                "P001",
                "Laptop Dell XPS 15",
                45000000
        );

        Product iphone = new Product(
                "P002",
                "iPhone 15 Pro Max",
                32000000
        );

        Product mouse = new Product(
                "P003",
                "Logitech MX Master 3",
                2500000
        );

        // =========================
        // 2. Tạo User
        // =========================

        User user = new User(
                "U123",
                "Nguyễn Văn A"
        );

        ShoppingCart cart = user.getCart();

        // =========================
        // 3. Thêm Laptop + iPhone
        // =========================

        cart.addProduct(laptop, 1);
        cart.addProduct(iphone, 1);

        // DISPLAY_CART lần 1
        System.out.println(cart.getCartSummary());

        // =========================
        // 4. Thêm iPhone lần nữa
        // =========================

        cart.addProduct(iphone, 1);

        // DISPLAY_CART lần 2
        System.out.println(cart.getCartSummary());

        // =========================
        // 5. Thêm Logitech
        // =========================

        cart.addProduct(mouse, 2);

        // DISPLAY_CART lần 3
        System.out.println(cart.getCartSummary());

        // =========================
        // 6. CHECKOUT
        // =========================

        Order order = new Order(user);

        System.out.println(order.getOrderSummary());
    }
}
