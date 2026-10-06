/**
 * Lớp TraiPhieu đại diện cho tài sản là trái phiếu.
 * Giá trị tăng trưởng ổn định theo lãi suất cố định.
 */
public class TraiPhieu extends TaiSan {
    private double laiSuatHangNam; // Ví dụ: 0.08 là 8%

    public TraiPhieu(String maTaiSan, double giaTriBanDau, double laiSuatHangNam) {
        super(maTaiSan, giaTriBanDau);
        this.laiSuatHangNam = laiSuatHangNam;
    }

    @Override
    public void capNhatGiaTri() {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này.
         *
         * Mục tiêu: Cập nhật giá trị hiện tại của trái phiếu sau một năm.
         * Công thức: Giá trị hiện tại mới = Giá trị hiện tại cũ * (1 + lãi suất hàng năm).
         *
         * Gợi ý:
         * - Sử dụng thuộc tính 'this.giaTriHienTai' để lấy giá trị hiện tại.
         * - Sử dụng thuộc tính 'this.laiSuatHangNam' để lấy lãi suất.
         * - Cập nhật lại giá trị cho 'this.giaTriHienTai'.
         */
        // VIẾT CODE CỦA BẠN VÀO ĐÂY
        giaTriHienTai = giaTriHienTai * (1 + laiSuatHangNam);
    }
}