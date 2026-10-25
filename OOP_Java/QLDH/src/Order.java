/**
 * CLASS 2: Order - Đại diện cho một đơn hàng
 * 
 * THUỘC TÍNH:
 * - orderId: String - Mã đơn hàng (duy nhất)
 * - customerId: String - Mã khách hàng
 * - items: java.util.List<OrderItem> - Danh sách sản phẩm trong đơn (sử dụng inner class OrderItem)
 * - totalAmount: double - Tổng tiền đơn hàng
 * - status: String - Trạng thái đơn hàng (PENDING, PAID, CANCELLED)
 * - discountPercent: double - Phần trăm giảm giá cho toàn đơn (0-100)
 * 
 * INNER CLASS: OrderItem
 * - product: Product - Sản phẩm
 * - quantity: int - Số lượng
 * 
 * YÊU CẦU:
 * 1. Implement các interface: Priceable, Displayable, Validatable, Payable
 * 2. Constructor nhận các tham số: orderId, customerId
 *    - Khởi tạo items là ArrayList rỗng
 *    - totalAmount = 0
 *    - status = "PENDING"
 *    - discountPercent = 0
 * 3. Phương thức addItem(Product product, int quantity):
 *    - Kiểm tra product.isInStock()
 *    - Kiểm tra quantity > 0 và quantity <= product.getStockQuantity()
 *    - Thêm OrderItem mới vào items
 *    - Gọi calculateTotal() để cập nhật totalAmount
 *    - Throw OutOfStockException nếu không đủ hàng
 * 4. Phương thức removeItem(String productId):
 *    - Xóa sản phẩm khỏi items dựa vào productId
 *    - Cập nhật lại totalAmount
 * 5. Implement calculateTotal():
 *    - Tính tổng: sum(product.getPrice() * quantity) cho mỗi item
 *    - Áp dụng giảm giá: total * (100 - discountPercent) / 100
 *    - Cập nhật totalAmount và trả về
 * 6. Implement applyDiscount(double discountPercent):
 *    - Set discountPercent cho đơn hàng (0-100)
 *    - Gọi calculateTotal() để cập nhật
 *    - Trả về totalAmount mới
 * 7. Implement getDisplayInfo():
 *    - Format: "Order ID: [orderId] | Customer: [customerId] | Items: [số lượng items] | Total: [totalAmount] VND | Status: [status] | Discount: [discountPercent]%"
 * 8. Implement isValid():
 *    - orderId không null và không rỗng
 *    - customerId không null và không rỗng
 *    - totalAmount >= 0
 *    - status là một trong: PENDING, PAID, CANCELLED
 * 9. Implement pay():
 *    - Kiểm tra status phải là PENDING
 *    - Kiểm tra items không rỗng
 *    - Giảm stock cho từng sản phẩm trong items
 *    - Set status = "PAID"
 *    - Throw PaymentFailedException nếu không thỏa điều kiện
 * 10. Implement isPaid(): trả về true nếu status == "PAID"
 * 11. Phương thức cancel():
 *     - Chỉ cancel được khi status == "PENDING"
 *     - Set status = "CANCELLED"
 *     - Throw InvalidOrderException nếu không thể cancel
 * 12. Override toString() trả về getDisplayInfo()
 * 13. Tạo các getter cho tất cả thuộc tính
 */
public class Order implements Priceable, Displayable, Validatable, Payable {
    public static class OrderItem {
        private Product product;
        private int quantity;

        public OrderItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public Product getProduct() {
            return product;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    private String orderId;
    private String customerId;
    private java.util.List<OrderItem> items;
    private double totalAmount;
    private String status;
    private double discountPercent;

    public Order(String orderId, String customerId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = new java.util.ArrayList<>();
        this.totalAmount = 0;
        this.status = "PENDING";
        this.discountPercent = 0;
    }

    public void addItem(Product product, int quantity) throws OutOfStockException {
        if (!product.isInStock() || quantity <= 0 || quantity > product.getStockQuantity()) {
            throw new OutOfStockException("Not enough stock for product '" + product.getProductName()
                    + "'. Available: " + product.getStockQuantity() + ", Requested: " + quantity);
        }
        items.add(new OrderItem(product, quantity));
        calculateTotal();
    }

    public void removeItem(String productId) {
        items.removeIf(item -> item.getProduct().getProductId().equals(productId));
        calculateTotal();
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        totalAmount = total * (100 - discountPercent) / 100;
        return totalAmount;
    }

    @Override
    public double applyDiscount(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }
        this.discountPercent = discountPercent;
        return calculateTotal();
    }

    @Override
    public String getDisplayInfo() {
        return "Order ID: " + orderId + " | Customer: " + customerId + " | Items: " + items.size()
                + " | Total: " + totalAmount + " VND | Status: " + status
                + " | Discount: " + discountPercent + "%";
    }

    @Override
    public boolean isValid() {
        if (orderId == null || orderId.isEmpty()) return false;
        if (customerId == null || customerId.isEmpty()) return false;
        if (totalAmount < 0) return false;
        return status.equals("PENDING") || status.equals("PAID") || status.equals("CANCELLED");
    }

    @Override
    public void pay() throws PaymentFailedException {
        if (!status.equals("PENDING")) {
            throw new PaymentFailedException("Cannot pay order with status: " + status);
        }
        if (items.isEmpty()) {
            throw new PaymentFailedException("Cannot pay order with no items");
        }
        int done = 0;
        try {
            for (OrderItem item : items) {
                item.getProduct().reduceStock(item.getQuantity());
                done++;
            }
        } catch (OutOfStockException e) {
            // Hoàn lại tồn kho của các sản phẩm đã trừ trước đó
            for (int i = 0; i < done; i++) {
                items.get(i).getProduct().increaseStock(items.get(i).getQuantity());
            }
            throw new PaymentFailedException(e.getMessage());
        }
        status = "PAID";
    }

    @Override
    public boolean isPaid() {
        return status.equals("PAID");
    }

    public void cancel() throws InvalidOrderException {
        if (!status.equals("PENDING")) {
            throw new InvalidOrderException("Cannot cancel order with status: " + status);
        }
        status = "CANCELLED";
    }

    @Override
    public String toString() {
        return getDisplayInfo();
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public java.util.List<OrderItem> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }
}
