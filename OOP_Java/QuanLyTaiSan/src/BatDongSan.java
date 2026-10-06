/**
 * Lớp BatDongSan đại diện cho tài sản là bất động sản.
 * Giá trị tăng theo thị trường và có thu nhập từ cho thuê.
 */
public class BatDongSan extends TaiSan {
    private double thuNhapThueHangNam;
    private double tiLeTangGiaHangNam; // Ví dụ: 0.05 là 5%

    public BatDongSan(String maTaiSan, double giaTriBanDau, double thuNhapThueHangNam, double tiLeTangGiaHangNam) {
        super(maTaiSan, giaTriBanDau);
        this.thuNhapThueHangNam = thuNhapThueHangNam;
        this.tiLeTangGiaHangNam = tiLeTangGiaHangNam;
    }

    @Override
    public void capNhatGiaTri() {
        /**
         * YÊU CẦU: Hoàn thiện phương thức này.
         *
         * Mục tiêu: Cập nhật giá trị của bất động sản sau một năm, bao gồm cả tăng giá và thu nhập cho thuê.
         * Các bước thực hiện:
         * 1. Cập nhật giá trị tài sản dựa trên tỉ lệ tăng giá hàng năm.
         * Giá trị sau khi tăng giá = Giá trị hiện tại * (1 + tiLeTangGiaHangNam).
         * 2. Cộng thêm thu nhập từ cho thuê vào giá trị vừa tính ở bước 1.
         * Giá trị cuối cùng = (Giá trị sau khi tăng giá) + thuNhapThueHangNam.
         * 3. Gán kết quả cuối cùng cho 'this.giaTriHienTai'.
         */
        // VIẾT CODE CỦA BẠN VÀO ĐÂY
        giaTriHienTai = giaTriHienTai *  (1+tiLeTangGiaHangNam);
        giaTriHienTai = giaTriHienTai + thuNhapThueHangNam;
    }
}