/**
 * Lớp HinhTron đại diện cho một hình tròn, được xác định bằng tâm và bán kính.
 * Kế thừa từ HinhHoc2D.
 */
public class HinhTron extends HinhHoc2D {

    private double tamX, tamY;
    private double banKinh;
    private double gocXoay; // Chỉ để ghi nhận, không ảnh hưởng hình dạng

    public HinhTron(double tamX, double tamY, double banKinh) {
        this.tamX = tamX;
        this.tamY = tamY;
        this.banKinh = banKinh;
        this.gocXoay = 0.0;
    }

    @Override
    public void dichChuyen(double dx, double dy) {
        this.tamX += dx;
        this.tamY += dy;
    }

    @Override
    public void quay(double goc) {
        // Phép quay không thay đổi tọa độ của hình tròn, chỉ ghi nhận góc xoay
        this.gocXoay = (this.gocXoay + goc) % 360;
    }

    @Override
    public double tinhDienTich() {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này để tính và trả về diện tích của hình tròn.
         *
         * Gợi ý:
         * - Công thức tính diện tích hình tròn là: PI * bán_kính^2.
         * - Sử dụng hằng số `Math.PI` trong Java cho số PI.
         * - Biến `banKinh` đã được khai báo trong lớp.
         */
        // Xóa dòng này và viết code của bạn
        return 0.0;
    }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public String toString() {
        return String.format("Hình tròn (Bán kính: %.1f) tại (%.1f, %.1f) với góc xoay %.1f°",
                banKinh, tamX, tamY, gocXoay);
    }
}