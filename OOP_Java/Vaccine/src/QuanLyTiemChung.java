import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QuanLyTiemChung {
    private static List<NguoiDan> danhSachNguoiDan = new ArrayList<>();
    private static List<TrungTamTiemChung> danhSachTrungTam = new ArrayList<>();

    public static void dangKyNguoiDan(NguoiDan nguoiDan) {
        danhSachNguoiDan.add(nguoiDan);
    }

    public static void themTrungTam(TrungTamTiemChung trungTam) {
        danhSachTrungTam.add(trungTam);
    }

    /**
     * [YÊU CẦU SINH VIÊN HOÀN THIỆN HÀM NÀY]
     *
     * Xử lý logic nghiệp vụ để đặt một lịch hẹn tiêm chủng.
     * Hàm cần thực hiện các bước sau:
     * 1. Tìm đối tượng NguoiDan trong `danhSachNguoiDan` dựa vào `cccd`. Nếu không tìm thấy, in ra lỗi và trả về `null`.
     * 2. Tìm đối tượng TrungTamTiemChung trong `danhSachTrungTam` dựa vào `idTrungTam`. Nếu không tìm thấy, in ra lỗi và trả về `null`.
     * 3. Kiểm tra điều kiện tiêm:
     * a. Tính toán mũi tiêm cần tiêm tiếp theo (bằng số mũi đã tiêm + 1).
     * b. So sánh với tổng số liều cần thiết của `loaiVaccine`. Nếu người dân đã tiêm đủ số liều, in thông báo và trả về `null`.
     * 4. Kiểm tra kho vaccine của trung tâm:
     * a. Gọi phương thức `coSanVaccine()` của trung tâm để xem có còn `loaiVaccine` được yêu cầu không.
     * b. Nếu không còn, in ra lỗi trung tâm đã hết vaccine và trả về `null`.
     * 5. Nếu tất cả các điều kiện trên đều thỏa mãn, tạo một đối tượng `LichHenTiem` mới với các thông tin đã tìm được,
     * in ra thông báo đặt lịch thành công và trả về đối tượng lịch hẹn vừa tạo.
     *
     * @param cccd        Số CCCD của người dân muốn đặt lịch.
     * @param idTrungTam  ID của trung tâm tiêm chủng.
     * @param loaiVaccine Loại vaccine người dân muốn tiêm.
     * @return Đối tượng `LichHenTiem` nếu đặt lịch thành công, ngược lại trả về `null`.
     */
    public static LichHenTiem datLichHen(String cccd, String idTrungTam, Vaccine loaiVaccine) {
        // TODO: Sinh viên viết code ở đây
        return null; // Xóa dòng này khi hoàn thiện
    }

    /**
     * [YÊU CẦU SINH VIÊN HOÀN THIỆN HÀM NÀY]
     *
     * Ghi nhận một mũi tiêm đã được thực hiện dựa trên lịch hẹn.
     * Hàm cần thực hiện các bước sau:
     * 1. Kiểm tra đầu vào: Nếu `lichHen` là `null` thì không làm gì cả và kết thúc hàm.
     * 2. Lấy ra các đối tượng `nguoiDan`, `trungTam`, `vaccine` từ `lichHen`.
     * 3. Cập nhật lịch sử tiêm cho người dân:
     * a. Tạo một chuỗi mô tả thông tin mũi tiêm (ví dụ: "Mũi 1 - Pfizer-BioNTech tại Trung tâm Y tế Quận 1").
     * b. Gọi phương thức `themMuiTiem()` của đối tượng `nguoiDan` để lưu lại thông tin.
     * 4. Cập nhật kho vaccine của trung tâm:
     * a. Gọi phương thức `suDungVaccine()` của đối tượng `trungTam` để giảm số lượng vaccine tương ứng đi 1.
     * 5. In ra thông báo xác nhận đã ghi nhận tiêm thành công.
     *
     * @param lichHen Đối tượng lịch hẹn đã được xác nhận là hoàn thành.
     */
    public static void ghiNhanTiem(LichHenTiem lichHen) {
        // TODO: Sinh viên viết code ở đây
    }

    public static void inThongTinHeThong() {
        System.out.println("\n========== BÁO CÁO HỆ THỐNG ==========");
        System.out.println("--- Danh sách người dân ---");
        for (NguoiDan nd : danhSachNguoiDan) {
            System.out.println(nd);
        }
        System.out.println("\n--- Tình hình trung tâm tiêm chủng ---");
        for (TrungTamTiemChung tt : danhSachTrungTam) {
            System.out.println(tt);
        }
        System.out.println("=======================================");
    }
    
    // Thêm hàm này vào lớp QuanLyTiemChung.java
    public static TrungTamTiemChung timTrungTamTheoId(String id) {
        for (TrungTamTiemChung tt : danhSachTrungTam) {
            if (tt.getId().equals(id)) {
                return tt;
            }
        }
        return null;
    }
}