/**
 * Lớp trừu tượng BankAccount là lớp cơ sở cho mọi loại tài khoản ngân hàng.
 * Chứa các thông tin và hành vi chung mà một tài khoản phải có.
 */
public abstract class BankAccount {

    /**
     * Số tài khoản duy nhất.
     */
    protected String soTaiKhoan;

    /**
     * Tên của chủ tài khoản.
     */
    protected String tenChuTaiKhoan;

    /**
     * Số dư hiện tại trong tài khoản.
     */
    protected double soDu;

    /**
     * Phương thức khởi tạo cho một tài khoản ngân hàng.
     *
     * @param soTaiKhoan     Số tài khoản.
     * @param tenChuTaiKhoan Tên chủ tài khoản.
     * @param soDuBanDau     Số dư ban đầu.
     */
    public BankAccount(String soTaiKhoan, String tenChuTaiKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soDu = soDuBanDau;
    }

    /**
     * Gửi một khoản tiền vào tài khoản.
     *
     * @param soTien Số tiền cần gửi.
     */
    public void guiTien(double soTien) {
        if (soTien > 0) {
            this.soDu += soTien;
            System.out.println("Gửi tiền thành công. Số dư mới: " + String.format("%,.0f", this.soDu));
        } else {
            System.out.println("Số tiền gửi vào phải là số dương.");
        }
    }

    /**
     * Phương thức trừu tượng để rút tiền từ tài khoản.
     * Mỗi loại tài khoản sẽ có logic xử lý riêng.
     *
     * @param soTien Số tiền cần rút.
     * @return true nếu rút tiền thành công, false nếu thất bại.
     */
    public abstract boolean rutTien(double soTien);

    /**
     * Phương thức trừu tượng để tính và cộng lãi hàng tháng.
     * Logic sẽ khác nhau tùy loại tài khoản.
     */
    public abstract void tinhLaiHangThang();

    /**
     * Hiển thị thông tin chi tiết của tài khoản.
     *
     * @return Chuỗi chứa thông tin tài khoản.
     */
    @Override
    public String toString() {
        return "Số TK: " + soTaiKhoan + ", Chủ TK: " + tenChuTaiKhoan + ", Số dư: " + String.format("%,.0f", soDu);
    }
}