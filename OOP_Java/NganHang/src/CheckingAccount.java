public class CheckingAccount extends BankAccount {

    private double hanMucThauChi;

    public CheckingAccount(String soTaiKhoan, String tenChuTaiKhoan, double soDuBanDau, double hanMucThauChi) {
        super(soTaiKhoan, tenChuTaiKhoan, soDuBanDau);
        this.hanMucThauChi = hanMucThauChi;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Cài đặt logic rút tiền cho tài khoản vãng lai (có thấu chi).
     * 1. Kiểm tra xem soTien có lớn hơn 0 VÀ soTien có nhỏ hơn hoặc bằng (số dư + hạn mức thấu chi) hay không.
     * Công thức: soTien <= (this.soDu + this.hanMucThauChi)
     * 2. Nếu điều kiện đúng:
     * - Trừ soTien khỏi this.soDu (số dư có thể bị âm).
     * - In ra thông báo thành công: "Rút tiền thành công từ TK {số tài khoản}. Số dư mới: {số dư mới}"
     * - Trả về true.
     * 3. Nếu điều kiện sai:
     * - In ra thông báo thất bại: "Rút tiền thất bại từ TK {số tài khoản}. Vượt quá hạn mức thấu chi hoặc số tiền không hợp lệ."
     * - Trả về false.
     *
     * @param soTien Số tiền cần rút.
     * @return true nếu thành công, false nếu thất bại.
     */
    @Override
    public boolean rutTien(double soTien) {
        // TODO: Học sinh cần hoàn thiện code ở đây
        return false;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Tài khoản vãng lai không có lãi suất.
     * Phương thức này chỉ cần in ra một thông báo: "TK {số tài khoản} là tài khoản vãng lai, không có lãi suất."
     */
    @Override
    public void tinhLaiHangThang() {
        // TODO: Học sinh cần hoàn thiện code ở đây
    }
}