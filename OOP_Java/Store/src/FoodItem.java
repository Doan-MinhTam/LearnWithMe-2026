/**
 * Lớp FoodItem đại diện cho mặt hàng thực phẩm.
 * Kế thừa từ Product và được miễn thuế.
 */
public class FoodItem extends Product {

    private String ngayHetHan;

    public FoodItem(String maSP, String tenSP, double giaGoc, String ngayHetHan) {
        super(maSP, tenSP, giaGoc);
        this.ngayHetHan = ngayHetHan;
    }

    /**
     * YÊU CẦU: Hoàn thiện phương thức này.
     *
     * Tính giá bán cuối cùng cho thực phẩm.
     * Vì được miễn thuế nên giá cuối cùng bằng giá gốc.
     *
     * @return Giá bán cuối cùng (chính là giá gốc).
     */
    @Override
    public double getFinalPrice() {
        // TODO: Sinh viên viết code ở đây

        return giaGoc;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hạn sử dụng: " + ngayHetHan;
    }
}