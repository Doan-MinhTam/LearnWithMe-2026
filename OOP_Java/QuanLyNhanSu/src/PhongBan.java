import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một phòng ban trong công ty.
 * Mỗi phòng ban có tên, một trưởng phòng và danh sách các nhân viên.
 */
public class PhongBan {
    private final String maPhongBan;
    private String tenPhongBan;
    private NhanVien truongPhong; // Có thể là null nếu chưa được bổ nhiệm
    private final List<NhanVien> danhSachNhanVien;

    public PhongBan(String maPhongBan, String tenPhongBan) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.danhSachNhanVien = new ArrayList<>();
        this.truongPhong = null;
    }

    // Getters
    public String getMaPhongBan() { return maPhongBan; }
    public String getTenPhongBan() { return tenPhongBan; }
    public NhanVien getTruongPhong() { return truongPhong; }
    public List<NhanVien> getDanhSachNhanVien() { return danhSachNhanVien; }

    /**
     * Thêm một nhân viên mới vào phòng ban này.
     * @param nv Nhân viên cần thêm.
     */
    public void themNhanVien(NhanVien nv) {
        this.danhSachNhanVien.add(nv);
    }

    /**
     * Bổ nhiệm một nhân viên làm trưởng phòng.
     * @param nv Nhân viên được bổ nhiệm.
     */
    public void setTruongPhong(NhanVien nv) {
        this.truongPhong = nv;
    }
}