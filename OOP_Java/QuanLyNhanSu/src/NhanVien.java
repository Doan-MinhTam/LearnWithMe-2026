import java.time.LocalDate;

/**
 * Đại diện cho một nhân viên trong công ty.
 * Mỗi nhân viên có thông tin cá nhân và một hợp đồng lao động.
 */
public class NhanVien {
    private final String maNhanVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private PhongBan phongBan; // Nhân viên thuộc về một phòng ban
    private HopDongLaoDong hopDong;

    public NhanVien(String maNhanVien, String hoTen, LocalDate ngaySinh) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    // Getters
    public String getMaNhanVien() { return maNhanVien; }
    public String getHoTen() { return hoTen; }
    public HopDongLaoDong getHopDong() { return hopDong; }

    // Setters để thiết lập mối quan hệ sau khi đối tượng được tạo
    public void setHopDong(HopDongLaoDong hopDong) { this.hopDong = hopDong; }
    public void setPhongBan(PhongBan phongBan) { this.phongBan = phongBan; }

    @Override
    public String toString() {
        String tenTruongPhong = (phongBan != null && phongBan.getTruongPhong() == this) ? " (Trưởng phòng)" : "";
        return "NhanVien[Ma=" + maNhanVien + ", Ten='" + hoTen + "'" + tenTruongPhong + ", Phong=" + (phongBan != null ? phongBan.getTenPhongBan() : "Chưa phân công") + "]";
    }
}