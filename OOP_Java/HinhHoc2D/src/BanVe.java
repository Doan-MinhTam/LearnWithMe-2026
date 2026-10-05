import java.util.ArrayList;
import java.util.List;

/**
 * Lớp BanVe quản lý một tập hợp các đối tượng hình học.
 */
public class BanVe {

    private List<HinhHoc2D> danhSachHinh;

    public BanVe() {
        this.danhSachHinh = new ArrayList<>();
    }

    public void themHinh(HinhHoc2D hinh) {
        danhSachHinh.add(hinh);
    }

    public void hienThiTatCa() {
        System.out.println("--- Trạng thái hiện tại của bản vẽ ---");
        if (danhSachHinh.isEmpty()) {
            System.out.println("Bản vẽ trống.");
            return;
        }
        for (HinhHoc2D hinh : danhSachHinh) {
            System.out.println(hinh);
        }
        System.out.println("------------------------------------");
    }

    public void dichChuyenTatCa(double dx, double dy) {
        for (HinhHoc2D hinh : danhSachHinh) {
            hinh.dichChuyen(dx, dy);
        }
    }

    public void quayTatCa(double goc) {
        for (HinhHoc2D hinh : danhSachHinh) {
            hinh.quay(goc);
        }
    }

    public void tinhTongDienTich() {
    /**
     * YÊU CẦU: Hoàn thiện phương thức này để tính tổng diện tích của TẤT CẢ
     * các hình có trong `danhSachHinh`.
     *
     * Gợi ý:
     * - Khởi tạo một biến `tongDienTich` bằng 0.
     * - Sử dụng vòng lặp (ví dụ: for-each) để duyệt qua từng đối tượng `HinhHoc2D`
     * trong `danhSachHinh`.
     * - Trong vòng lặp, gọi phương thức `tinhDienTich()` của mỗi hình và
     * cộng dồn kết quả vào biến `tongDienTich`.
     * - Cuối cùng, in kết quả ra màn hình theo định dạng đã cho.
     */
    double tongDienTich = 0;
    // Viết code của bạn ở đây

    System.out.printf("Tổng diện tích của tất cả các hình: %.2f\n", tongDienTich);
}
}