/**
 * Đại diện cho các vị trí công việc trong công ty.
 * Lớp này thay thế enum, sử dụng constructor private và các hằng số public static final.
 * Mỗi vị trí có một hệ số lương cơ bản để tính toán thu nhập.
 */
public class ViTriCongViec {
    public static final ViTriCongViec NHAN_VIEN = new ViTriCongViec("Nhân viên", 1.0);
    public static final ViTriCongViec TRUONG_PHONG = new ViTriCongViec("Trưởng phòng", 1.5);
    public static final ViTriCongViec GIAM_DOC = new ViTriCongViec("Giám đốc", 3.0);

    private final String tenViTri;
    private final double heSoLuong;

    private ViTriCongViec(String tenViTri, double heSoLuong) {
        this.tenViTri = tenViTri;
        this.heSoLuong = heSoLuong;
    }

    public String getTenViTri() { return tenViTri; }
    public double getHeSoLuong() { return heSoLuong; }

    @Override
    public String toString() {
        return this.tenViTri;
    }
}