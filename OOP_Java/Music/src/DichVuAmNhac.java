import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Lớp dịch vụ trung tâm, quản lý toàn bộ hệ thống nghe nhạc.
 * Hoạt động như một Singleton (thông qua các thành viên static), chứa thư viện nhạc,
 * danh sách người dùng và cung cấp các chức năng chính.
 */
public class DichVuAmNhac {
    private static List<BaiHat> thuVienBaiHat = new ArrayList<>();
    private static List<NgheSi> danhSachNgheSi = new ArrayList<>();
    private static List<NguoiDung> danhSachNguoiDung = new ArrayList<>();
    private static int nextPlaylistId = 1;

    // Các phương thức để khởi tạo dữ liệu cho dịch vụ
    public static void themNgheSi(NgheSi ngheSi) {
        danhSachNgheSi.add(ngheSi);
    }

    public static void themBaiHat(BaiHat baiHat) {
        thuVienBaiHat.add(baiHat);
    }

    public static void themNguoiDung(NguoiDung nguoiDung) {
        danhSachNguoiDung.add(nguoiDung);
    }

    /**
     * Cho phép một người dùng tạo một playlist mới.
     *
     * @param tenPlaylist Tên của playlist muốn tạo.
     * @param nguoiDung   Người dùng thực hiện hành động.
     * @return Đối tượng Playlist vừa được tạo.
     */
    public static Playlist taoPlaylist(String tenPlaylist, NguoiDung nguoiDung) {
        String id = "PL" + String.format("%03d", nextPlaylistId++);
        Playlist playlistMoi = new Playlist(id, tenPlaylist, nguoiDung);
        nguoiDung.themPlaylistSohuu(playlistMoi);
        System.out.println("[DỊCH VỤ] " + nguoiDung.getTenNguoiDung() + " đã tạo playlist mới: '" + tenPlaylist + "'.");
        return playlistMoi;
    }

    /**
     * Thêm một bài hát từ thư viện vào một playlist cụ thể.
     *
     * @param baiHat   Bài hát cần thêm.
     * @param playlist Playlist đích.
     */
    public static void themBaiHatVaoPlaylist(BaiHat baiHat, Playlist playlist) {
        if (baiHat != null && playlist != null) {
            playlist.themBaiHat(baiHat);
        }
    }

    /**
     * Mô phỏng việc phát một playlist.
     * In ra danh sách các bài hát và tổng thời lượng.
     *
     * @param playlist Playlist cần phát.
     */
    public static void phatPlaylist(Playlist playlist) {
        System.out.println("\n▶️  Đang phát playlist: '" + playlist.getTenPlaylist() + "' của " + playlist.getNguoiTao().getTenNguoiDung());
        System.out.println("--------------------------------------------------");
        List<BaiHat> dsBaiHat = playlist.getDanhSachBaiHat();
        if (dsBaiHat.isEmpty()) {
            System.out.println("   Playlist này trống!");
        } else {
            for (int i = 0; i < dsBaiHat.size(); i++) {
                System.out.println("   " + (i + 1) + ". " + dsBaiHat.get(i));
            }
        }
        int tongThoiLuong = playlist.tinhTongThoiLuong();
        System.out.println("--------------------------------------------------");
        System.out.println("   Tổng số bài hát: " + dsBaiHat.size() + " | Tổng thời lượng: " + (tongThoiLuong / 60) + "m " + (tongThoiLuong % 60) + "s");
    }


    /**
     * Tìm kiếm bài hát trong thư viện theo từ khóa.
     * <p>
     * Yêu cầu cho học sinh:
     * 1. Tạo một danh sách (List<BaiHat>) rỗng để chứa kết quả tìm kiếm.
     * 2. Chuyển đổi từ khóa tìm kiếm (`tuKhoa`) sang chữ thường để việc so sánh không phân biệt chữ hoa/thường.
     * 3. Duyệt qua toàn bộ thư viện bài hát (thuVienBaiHat).
     * 4. Với mỗi bài hát, lấy ra tên bài hát và tên nghệ sĩ. Chuyển cả hai sang chữ thường.
     * 5. Kiểm tra xem tên bài hát (đã chuyển sang chữ thường) HOẶC tên nghệ sĩ (đã chuyển sang chữ thường)
     * có chứa chuỗi từ khóa (đã chuyển sang chữ thường) hay không.
     * 6. Nếu điều kiện trên là đúng, thêm bài hát hiện tại vào danh sách kết quả.
     * 7. Sau khi duyệt xong, trả về danh sách kết quả đã tìm được.
     *
     * @param tuKhoa Từ khóa tìm kiếm.
     * @return Một danh sách các bài hát khớp với từ khóa. Nếu không tìm thấy, trả về một danh sách rỗng.
     */
    public static List<BaiHat> timKiemBaiHat(String tuKhoa) {
        // PHẦN CODE HỌC SINH CẦN HOÀN THIỆN
        List<BaiHat> baiHats = new ArrayList<>();
        String tuKhoaTimKiem = tuKhoa.toLowerCase();
        String tenBaiHat = "";
        String tenNgheSi = "";
        for (BaiHat baiHat : thuVienBaiHat) {
            tenBaiHat = baiHat.getNgheSi().getTenNgheSi().toLowerCase();
            tenNgheSi = baiHat.getTenBaiHat().toLowerCase();
            if (tenBaiHat.contains(tuKhoaTimKiem) || tenNgheSi.contains(tuKhoaTimKiem)) {
                baiHats.add(baiHat);
            }
        }

        return baiHats; // Giá trị trả về tạm thời
    }
}