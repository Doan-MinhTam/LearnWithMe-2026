/**
 * Lớp trừu tượng HinhHoc2D là lớp cơ sở cho tất cả các hình học 2D.
 * Lớp này định nghĩa các hành vi chung mà mọi hình phải có.
 */
public abstract class HinhHoc2D {

    /**
     * Dịch chuyển hình đi một khoảng (dx, dy).
     * Đây là phương thức trừu tượng vì cách lưu trữ vị trí khác nhau giữa các hình.
     *
     * @param dx Độ dịch chuyển theo trục x.
     * @param dy Độ dịch chuyển theo trục y.
     */
    public abstract void dichChuyen(double dx, double dy);

    /**
     * Quay hình một góc quanh tâm của nó.
     * Đây là phương thức trừu tượng vì logic quay phụ thuộc vào cách biểu diễn hình.
     *
     * @param goc Góc cần quay (độ).
     */
    public abstract void quay(double goc);

    /**
     * Phương thức trừu tượng để tính diện tích.
     *
     * @return Diện tích của hình.
     */
    public abstract double tinhDienTich();

    /**
     * Phương thức trừu tượng để tính chu vi.
     *
     * @return Chu vi của hình.
     */
    public abstract double tinhChuVi();

    /**
     * Hiển thị thông tin chi tiết của hình.
     *
     * @return Chuỗi thông tin.
     */
    @Override
    public abstract String toString();
}