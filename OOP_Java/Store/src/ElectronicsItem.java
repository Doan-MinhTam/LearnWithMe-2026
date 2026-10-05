/**
 * Lớp ElectronicsItem đại diện cho mặt hàng điện tử.
 * Kế thừa từ Product và chịu thuế VAT 10%.
 */
public class ElectronicsItem extends Product {

    private int thoiGianBaoHanh;
    private static final double VAT_RATE = 0.10; // 10% VAT

    public ElectronicsItem(String maSP, String tenSP, double giaGoc, int thoiGianBaoHanh) {
        super(maSP, tenSP, giaGoc);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    /**
     * YÊU CẦU: Hoàn thiện phương thức này.
     *
     * Tính giá bán cuối cùng cho mặt hàng điện tử.
     * Công thức: Giá cuối cùng = Giá gốc + (Giá gốc * VAT).
     * VAT cho mặt hàng này là 10% (sử dụng hằng số VAT_RATE đã cho).
     *
     * @return Giá bán cuối cùng sau khi đã tính VAT.
     */
    @Override
    public double getFinalPrice() {
        // TODO: Sinh viên viết code ở đây

        return giaGoc + (giaGoc * VAT_RATE);
    }

    @Override
    public String toString() {
        return super.toString() + ", Bảo hành: " + thoiGianBaoHanh + " tháng";
    }
}