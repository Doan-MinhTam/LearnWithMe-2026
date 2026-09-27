import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Order {
    private final String orderId;
    private final User user;
    private static int c = 1;
    private final List<CartItem> orderedItems;
    private final double totalAmount;
    private final LocalDateTime orderDate;

    public Order(User user) {
        this.orderId = "" + c++;
        this.user = user;
        this.orderedItems = user.getCart().getItems();
        this.totalAmount = user.getCart().calculateTotal();
        this.orderDate = LocalDateTime.of(2025, 9, 15, 22, 30, 59);
    }

    /**
     * Trả về chuỗi tóm tắt đơn hàng (không sử dụng trang trí).
     */
    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã đơn hàng: ").append(orderId).append("\n");
        sb.append("Khách hàng: ").append(user.getName()).append("\n");
        sb.append("Ngày đặt: ").append(orderDate.format(DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy"))).append("\n");
        for (CartItem item : orderedItems) {
            sb.append(String.format("- %s (SL: %d) - %,.0f VND\n",
                    item.getProduct().getName(), item.getQuantity(), item.getSubtotal()));
        }
        sb.append(String.format("TỔNG THANH TOÁN: %,.0f VND", totalAmount));
        return sb.toString();
    }
}