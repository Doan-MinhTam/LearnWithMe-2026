import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Lớp dịch vụ trung tâm, quản lý toàn bộ nghiệp vụ nhân sự của công ty.
 */
public class HeThongQuanLyNhanSu {
    private static List<NhanVien> danhSachToanBoNhanVien = new ArrayList<>();
    private static List<PhongBan> danhSachPhongBan = new ArrayList<>();
    private static int nextEmployeeId = 1;
    private static int nextContractId = 1;

    public static void themPhongBan(PhongBan pb) {
        danhSachPhongBan.add(pb);
    }

    /**
     * YÊU CẦU 1: Hoàn thiện hàm này.
     * Tìm kiếm một phòng ban trong danh sách `danhSachPhongBan` dựa vào mã phòng ban được cung cấp.
     *
     * @param maPhongBan Mã của phòng ban cần tìm (ví dụ: "KD", "KT").
     * @return Đối tượng PhongBan nếu tìm thấy. Nếu không tìm thấy, trả về `null`.
     * Gợi ý:
     * - Dùng vòng lặp `for` để duyệt qua `danhSachPhongBan`.
     * - Trong mỗi lần lặp, lấy ra đối tượng phòng ban và so sánh mã của nó với `maPhongBan`.
     * - Sử dụng `equalsIgnoreCase()` để so sánh chuỗi không phân biệt chữ hoa, chữ thường.
     * - Nếu tìm thấy, ngay lập tức trả về đối tượng phòng ban đó.
     * - Nếu vòng lặp kết thúc mà không tìm thấy, trả về `null`.
     */
    public static PhongBan timPhongBanTheoMa(String maPhongBan) {
        // TODO: Học sinh cần hoàn thiện hàm này
        PhongBan phongBan = null;
        for (PhongBan pb : danhSachPhongBan) {
            if (pb.getMaPhongBan().equalsIgnoreCase(maPhongBan)) {
                phongBan = pb;
                return phongBan;
            }
        }
        return null;
    }

    /**
     * Nghiệp vụ tuyển dụng một nhân viên mới.
     * Đây là một ví dụ về Abstraction, che giấu các bước phức tạp.
     *
     * @return Đối tượng NhanVien mới nếu tuyển dụng thành công.
     */
    public static NhanVien tuyenDungNhanVien(String hoTen, LocalDate ngaySinh, String maPhongBan, ViTriCongViec viTri, double luong) {
        System.out.println("\n[TUYỂN DỤNG] Bắt đầu quy trình tuyển dụng cho: " + hoTen);
        PhongBan pb = timPhongBanTheoMa(maPhongBan);
        if (pb == null) {
            System.out.println("[LỖI] Không tìm thấy phòng ban với mã: " + maPhongBan + ". Tuyển dụng thất bại.");
            return null;
        }

        // Tạo các đối tượng liên quan
        String maNV = "NV" + String.format("%03d", nextEmployeeId++);
        NhanVien nvMoi = new NhanVien(maNV, hoTen, ngaySinh);

        String soHD = "HD" + String.format("%04d", nextContractId++);
        HopDongLaoDong hdMoi = new HopDongLaoDong(soHD, nvMoi, viTri, LocalDate.now(), luong);

        // Thiết lập mối quan hệ hai chiều
        nvMoi.setHopDong(hdMoi);
        nvMoi.setPhongBan(pb);
        pb.themNhanVien(nvMoi);
        danhSachToanBoNhanVien.add(nvMoi);

        System.out.println("[THÀNH CÔNG] Đã tuyển dụng thành công: " + nvMoi);
        return nvMoi;
    }

    /**
     * YÊU CẦU 2: Hoàn thiện hàm này.
     * Bổ nhiệm một nhân viên làm trưởng phòng cho một phòng ban cụ thể.
     *
     * @param nhanVien Nhân viên được bổ nhiệm.
     * @param phongBan Phòng ban mà nhân viên sẽ quản lý.
     *                 Gợi ý:
     *                 - **Kiểm tra điều kiện hợp lệ**:
     *                 1. Cả `nhanVien` và `phongBan` đều không được `null`.
     *                 2. Nhân viên phải là một thành viên của phòng ban đó. Dùng `phongBan.getDanhSachNhanVien().contains(nhanVien)` để kiểm tra.
     *                 - **Thực hiện bổ nhiệm**:
     *                 Nếu tất cả điều kiện đều đúng, gọi phương thức `phongBan.setTruongPhong(nhanVien)`.
     *                 Sau đó in ra thông báo bổ nhiệm thành công.
     *                 - **Xử lý lỗi**:
     *                 Nếu có bất kỳ điều kiện nào không đúng, in ra thông báo lỗi.
     */
    public static void boNhiemTruongPhong(NhanVien nhanVien, PhongBan phongBan) {
        // TODO: Học sinh cần hoàn thiện hàm này
        // (Xóa 2 dòng dưới đây khi làm bài)
        if (nhanVien == null && phongBan == null) {
            System.out.println("[LỖI BỔ NHIỆM] Không thể bổ nhiệm " + nhanVien.getHoTen() + ". Nhân viên không thuộc " + phongBan.getTenPhongBan() + ".");
            return;
        }
        if (!phongBan.getDanhSachNhanVien().contains(nhanVien)) {
            System.out.println("[LỖI BỔ NHIỆM] Chức năng chưa được hoàn thiện.");
            return;
        }
        phongBan.setTruongPhong(nhanVien);
        System.out.println("[THÀNH CÔNG] Đã bổ nhiệm " + nhanVien.getHoTen() + " làm trưởng phòng Phòng Kinh doanh.");


    }


    /**
     * YÊU CẦU 3: Hoàn thiện hàm này.
     * Tính lương tháng thực nhận của một nhân viên.
     *
     * @param nv Nhân viên cần tính lương.
     * @return Lương tháng của nhân viên, được tính bằng công thức: Lương thỏa thuận * Hệ số lương.
     * Gợi ý:
     * - **Kiểm tra null**: Trước tiên, hãy kiểm tra xem `nv` hoặc hợp đồng của nhân viên (`nv.getHopDong()`) có bị `null` không. Nếu có, trả về 0.
     * - **Lấy thông tin**:
     * 1. Lấy hợp đồng lao động từ nhân viên: `HopDongLaoDong hd = nv.getHopDong();`
     * 2. Từ hợp đồng, lấy lương thỏa thuận: `hd.getLuongThoaThuan()`
     * 3. Từ hợp đồng, lấy vị trí công việc, sau đó từ vị trí lấy hệ số lương: `hd.getViTri().getHeSoLuong()`
     * - **Tính toán**: Nhân hai giá trị trên để ra lương cuối cùng và trả về kết quả.
     */
    public static double tinhLuongThang(NhanVien nv) {
        // TODO: Học sinh cần hoàn thiện hàm này
        if (nv == null || nv.getHopDong() == null) {
            return 0;
        }
        HopDongLaoDong hd = nv.getHopDong();
        double luongThoaThuan = hd.getLuongThoaThuan();
        double heSoLuong = hd.getViTri().getHeSoLuong();
        return luongThoaThuan * heSoLuong;
    }


    /**
     * In thông tin chi tiết của một phòng ban.
     *
     * @param maPhongBan Mã phòng ban cần in.
     */
    public static void hienThiThongTinPhongBan(String maPhongBan) {
        PhongBan pb = timPhongBanTheoMa(maPhongBan);
        if (pb == null) return;

        System.out.println("\n--- THÔNG TIN PHÒNG BAN: " + pb.getTenPhongBan().toUpperCase() + " ---");
        NhanVien truongPhong = pb.getTruongPhong();
        System.out.println("Trưởng phòng: " + (truongPhong != null ? truongPhong.getHoTen() : "Chưa có"));
        System.out.println("Danh sách nhân viên:");
        if (pb.getDanhSachNhanVien().isEmpty()) {
            System.out.println("   (Chưa có nhân viên)");
        } else {
            for (NhanVien nv : pb.getDanhSachNhanVien()) {
                System.out.println("   - " + nv);
            }
        }
        System.out.println("--------------------------------------");
    }
}