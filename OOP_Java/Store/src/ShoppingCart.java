import java.util.ArrayList;
import java.util.List;

/**
 * Lớp ShoppingCart mô phỏng một giỏ hàng của khách hàng.
 */
public class ShoppingCart {

    private List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
        System.out.println("Đã thêm '" + product.tenSP + "' vào giỏ hàng.");
    }

    /**
     * YÊU CẦU: Hoàn thiện phương thức này.
     *
     * Phương thức này phải thực hiện các công việc sau:
     * 1. In ra tiêu đề của hóa đơn.
     * 2. Khởi tạo một biến để lưu tổng số tiền (totalAmount).
     * 3. Duyệt qua từng sản phẩm (item) trong danh sách 'items'.
     * 4. Trong vòng lặp:
     * a. Gọi phương thức getFinalPrice() của item để lấy giá cuối cùng.
     * b. Cộng giá vừa lấy được vào biến totalAmount.
     * c. In thông tin chi tiết của sản phẩm (dùng item.toString()) và giá cuối cùng của nó.
     * Lưu ý: Định dạng giá tiền cho dễ đọc (ví dụ: 15,000,000).
     * 5. Sau khi duyệt xong, in ra tổng số tiền phải thanh toán (totalAmount).
     */
    public void checkout() {
        System.out.println("\n===== HÓA ĐƠN THANH TOÁN =====");
        if (items.isEmpty()) {
            System.out.println("Giỏ hàng của bạn đang trống!");
            return;
        }

        // TODO: Sinh viên viết code để tính toán và in hóa đơn từ đây
        double totalAmount =0.0;
        for (Product item : items) {
            totalAmount += item.getFinalPrice();
            System.out.printf(item.toString() +" | Giá cuối: %,.0f VND\n", item.getFinalPrice());

        }

        System.out.println("--------------------------------");
        System.out.printf(">> TỔNG CỘNG: %,.0f VND", totalAmount);
        System.out.println("================================");
    }
}