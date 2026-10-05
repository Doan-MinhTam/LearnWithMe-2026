/**
 * Lớp HinhVuong đại diện cho một hình vuông.
 * Kế thừa từ HinhChuNhat.
 */
public class HinhVuong extends HinhChuNhat {

    /**
     * Phương thức khởi tạo cho hình vuông.
     *
     * @param x1 Tọa độ x đỉnh 1.
     * @param y1 Tọa độ y đỉnh 1.
     * @param x2 Tọa độ x đỉnh 2 (đối diện).
     * @param y2 Tọa độ y đỉnh 2 (đối diện).
     */
    public HinhVuong(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        // Có thể thêm kiểm tra để đảm bảo |x2-x1| == |y2-y1| nếu cần
    }

    // Kế thừa hoàn toàn các phương thức tinhDienTich, tinhChuVi, dichChuyen, và quay
    // từ HinhChuNhat mà không cần viết lại.

    @Override
    public String toString() {
        return String.format("Hình vuông xác định bởi đỉnh (%.1f, %.1f) và (%.1f, %.1f)",
                x1, y1, x2, y2);
    }
}