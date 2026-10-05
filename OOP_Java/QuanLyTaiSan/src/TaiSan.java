/**
 * Lớp trừu tượng TaiSan là lớp cơ sở cho mọi loại tài sản đầu tư.
 */
public abstract class TaiSan {
    protected String maTaiSan;
    protected double giaTriBanDau;
    protected double giaTriHienTai;

    /**
     * Phương thức khởi tạo cho một tài sản.
     *
     * @param maTaiSan      Mã định danh của tài sản.
     * @param giaTriBanDau  Giá trị đầu tư ban đầu.
     */
    public TaiSan(String maTaiSan, double giaTriBanDau) {
        this.maTaiSan = maTaiSan;
        this.giaTriBanDau = giaTriBanDau;
        this.giaTriHienTai = giaTriBanDau; // Ban đầu, giá trị hiện tại bằng giá trị ban đầu
    }

    /**
     * Phương thức trừu tượng để cập nhật giá trị của tài sản sau một kỳ (ví dụ: một năm).
     * Mỗi loại tài sản sẽ có công thức cập nhật riêng.
     */
    public abstract void capNhatGiaTri();

    /**
     * Tính toán lợi nhuận hoặc thua lỗ từ tài sản này.
     *
     * @return Lợi nhuận (giá trị hiện tại - giá trị ban đầu).
     */
    public double tinhLoiNhuan() {
        return this.giaTriHienTai - this.giaTriBanDau;
    }

    @Override
    public String toString() {
        return String.format("Mã: %-10s | Giá trị ban đầu: %,15.0f | Giá trị hiện tại: %,15.0f | Lợi nhuận: %,15.0f",
                maTaiSan, giaTriBanDau, giaTriHienTai, tinhLoiNhuan());
    }
}