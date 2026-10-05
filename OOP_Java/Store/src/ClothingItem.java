/**
 * Lớp ClothingItem đại diện cho mặt hàng quần áo.
 * Kế thừa từ Product, chịu thuế và có thể có giảm giá.
 */
public class ClothingItem extends Product {

    private String size;
    private double tiLeGiamGia; // Ví dụ: 0.2 là giảm 20%
    private static final double VAT_RATE = 0.08; // 8% VAT

    public ClothingItem(String maSP, String tenSP, double giaGoc, String size, double tiLeGiamGia) {
        super(maSP, tenSP, giaGoc);
        this.size = size;
        this.tiLeGiamGia = tiLeGiamGia;
    }

    /**
     * YÊU CẦU: Hoàn thiện phương thức này.
     *
     * Tính giá bán cuối cùng cho mặt hàng quần áo.
     * Quá trình tính toán gồm 2 bước:
     * 1. Tính giá sau khi đã cộng thuế VAT 8% (sử dụng hằng số VAT_RATE).
     * 2. Áp dụng giảm giá dựa trên thuộc tính tiLeGiamGia.
     *
     * Công thức: Giá cuối cùng = (Giá gốc * (1 + VAT_RATE)) * (1 - tiLeGiamGia).
     *
     * @return Giá bán cuối cùng sau khi tính thuế và áp dụng giảm giá.
     */
    @Override
    public double getFinalPrice() {
        // TODO: Sinh viên viết code ở đây

        return (giaGoc * (1 + VAT_RATE)) * (1 - tiLeGiamGia);
    }

    @Override
    public String toString() {
        return super.toString() + ", Size: " + size + ", Giảm giá: " + (tiLeGiamGia * 100) + "%";
    }
}