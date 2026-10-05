public class SavingsAccount extends BankAccount {

    private double laiSuat;

    public SavingsAccount(String soTaiKhoan, String tenChuTaiKhoan, double soDuBanDau, double laiSuat) {
        super(soTaiKhoan, tenChuTaiKhoan, soDuBanDau);
        this.laiSuat = laiSuat;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Cài đặt logic rút tiền cho tài khoản tiết kiệm.
     * 1. Kiểm tra xem soTien có lớn hơn 0 VÀ soTien có nhỏ hơn hoặc bằng số dư (this.soDu) hay không.
     * 2. Nếu điều kiện đúng:
     * - Trừ soTien khỏi this.soDu.
     * - In ra thông báo thành công: "Rút tiền thành công từ TK {số tài khoản}. Số dư mới: {số dư mới}"
     * - Trả về true.
     * 3. Nếu điều kiện sai:
     * - In ra thông báo thất bại: "Rút tiền thất bại từ TK {số tài khoản}. Số dư không đủ hoặc số tiền không hợp lệ."
     * - Trả về false.
     *
     * @param soTien Số tiền cần rút.
     * @return true nếu thành công, false nếu thất bại.
     */
    @Override
    public boolean rutTien(double soTien) {
        // TODO: Học sinh cần hoàn thiện code ở đây
        return true;
    }

    /**
     * [YÊU CẦU DÀNH CHO HỌC SINH]
     * Cài đặt logic tính và cộng tiền lãi vào số dư cuối tháng.
     * 1. Tính tiền lãi dựa trên số dư hiện tại: tienLai = this.soDu * this.laiSuat.
     * 2. Cộng tiền lãi vừa tính vào số dư: this.soDu += tienLai.
     * 3. In ra thông báo: "Đã cộng lãi cho TK {số tài khoản}. Tiền lãi: {tiền lãi}. Số dư mới: {số dư mới}"
     */
    @Override
    public void tinhLaiHangThang() {
        // TODO: Học sinh cần hoàn thiện code ở đây
    }
}