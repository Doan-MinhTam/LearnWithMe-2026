import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một người dùng của dịch vụ nghe nhạc.
 * Mỗi người dùng có thể tạo và quản lý các playlist của riêng mình.
 */
public class NguoiDung {
    private final String id;
    private String tenNguoiDung;
    private List<Playlist> danhSachPlaylistSohuu;

    /**
     * Constructor để tạo một NguoiDung mới.
     * @param id ID duy nhất của người dùng.
     * @param tenNguoiDung Tên người dùng.
     */
    public NguoiDung(String id, String tenNguoiDung) {
        this.id = id;
        this.tenNguoiDung = tenNguoiDung;
        this.danhSachPlaylistSohuu = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getTenNguoiDung() { return tenNguoiDung; }
    public List<Playlist> getDanhSachPlaylistSohuu() { return danhSachPlaylistSohuu; }

    /**
     * Thêm một playlist mới vào danh sách sở hữu của người dùng.
     * @param playlist Playlist vừa được tạo.
     */
    public void themPlaylistSohuu(Playlist playlist) {
        this.danhSachPlaylistSohuu.add(playlist);
    }

    @Override
    public String toString() {
        return "NguoiDung[ID=" + id + ", Ten='" + tenNguoiDung + "']";
    }
}