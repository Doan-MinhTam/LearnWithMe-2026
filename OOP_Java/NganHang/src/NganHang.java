import java.util.ArrayList;
import java.util.List;

/**
 * Lớp NganHang quản lý một danh sách các tài khoản ngân hàng.
 */
public class NganHang {

    /**
     * Danh sách các tài khoản được quản lý bởi ngân hàng.
     */
    private List<BankAccount> danhSachTaiKhoan;

    /**
     * Phương thức khởi tạo, tạo một danh sách tài khoản rỗng.
     */
    public NganHang() {
        this.danhSachTaiKhoan = new ArrayList<>();
    }

    /**
     * Thêm một tài khoản mới vào ngân hàng.
     *
     * @param taiKhoan Tài khoản cần thêm.
     */
    public void themTaiKhoan(BankAccount taiKhoan) {
        danhSachTaiKhoan.add(taiKhoan);
        System.out.println("Đã mở tài khoản mới: " + taiKhoan);
    }

    /**
     * Hiển thị thông tin tất cả các tài khoản.
     */
    public void hienThiTatCaTaiKhoan() {
        System.out.println("\n===== DANH SÁCH TÀI KHOẢN NGÂN HÀNG =====");
        for (BankAccount tk : danhSachTaiKhoan) {
            System.out.println(tk);
        }
        System.out.println("=========================================");
    }

    /**
     * Thực hiện nghiệp vụ cuối tháng: tính lãi cho tất cả các tài khoản.
     * Đây là nơi tính đa hình được thể hiện rõ: phương thức tinhLaiHangThang()
     * được gọi, và Java sẽ tự động chọn phiên bản phù hợp (của SavingsAccount
     * hay CheckingAccount) để thực thi.
     */
    public void thucHienNghiepVuCuoiThang() {
        System.out.println("\n===== THỰC HIỆN NGHIỆP VỤ CUỐI THÁNG =====");
        for (BankAccount tk : danhSachTaiKhoan) {
            tk.tinhLaiHangThang();
        }
        System.out.println("=========================================");
    }
}