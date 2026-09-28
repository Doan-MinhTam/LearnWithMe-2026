import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một playlist (danh sách phát).
 * Mỗi playlist có tên, người tạo và một danh sách các bài hát.
 */
public class Playlist {
    private final String id;
    private String tenPlaylist;
    private final NguoiDung nguoiTao;
    private final List<BaiHat> danhSachBaiHat;

    /**
     * Constructor để tạo một Playlist mới.
     * @param id ID duy nhất của playlist.
     * @param tenPlaylist Tên của playlist.
     * @param nguoiTao Người dùng đã tạo ra playlist này.
     */
    public Playlist(String id, String tenPlaylist, NguoiDung nguoiTao) {
        this.id = id;
        this.tenPlaylist = tenPlaylist;
        this.nguoiTao = nguoiTao;
        this.danhSachBaiHat = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getTenPlaylist() { return tenPlaylist; }
    public NguoiDung getNguoiTao() { return nguoiTao; }
    public List<BaiHat> getDanhSachBaiHat() { return danhSachBaiHat; }

    /**
     * Thêm một bài hát vào playlist.
     * @param baiHat Đối tượng BaiHat cần thêm.
     */
    public void themBaiHat(BaiHat baiHat) {
        this.danhSachBaiHat.add(baiHat);
        System.out.println("[PLAYLIST] Đã thêm bài hát " + baiHat.getTenBaiHat() + " vào playlist '" + this.tenPlaylist + "'.");
    }



    /**
     * Tính tổng thời lượng của tất cả các bài hát trong playlist.
     * * Yêu cầu cho học sinh:
     * 1. Khởi tạo một biến để lưu tổng thời lượng, bắt đầu từ 0.
     * 2. Duyệt qua danh sách các bài hát (this.danhSachBaiHat).
     * 3. Với mỗi bài hát trong danh sách, lấy ra thời lượng (tính bằng giây) của nó.
     * 4. Cộng dồn thời lượng của mỗi bài hát vào biến tổng.
     * 5. Sau khi duyệt hết danh sách, trả về tổng thời lượng đã tính được.
     *
     * @return Tổng thời lượng của playlist (tính bằng giây).
     */
    public int tinhTongThoiLuong() {
        // PHẦN CODE HỌC SINH CẦN HOÀN THIỆN
        int tongThoiLuong = 0;
        for (BaiHat baiHat : danhSachBaiHat) {
            tongThoiLuong += baiHat.getThoiLuongGiay();
        }
        return tongThoiLuong; // Giá trị trả về tạm thời
    }

    @Override
    public String toString() {
        return "Playlist[ID=" + id + ", Ten='" + tenPlaylist + "', NguoiTao=" + nguoiTao.getTenNguoiDung() + ", SoBaiHat=" + danhSachBaiHat.size() + "]";
    }
}