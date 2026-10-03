import java.time.LocalDate;

/**
 * Đại diện cho một hợp đồng lao động.
 * Liên kết một nhân viên với vị trí công việc, ngày bắt đầu và mức lương.
 */
public class HopDongLaoDong {
    private final String soHopDong;
    private final NhanVien nhanVien;
    private final ViTriCongViec viTri;
    private final LocalDate ngayBatDau;
    private final double luongThoaThuan; // Lương cơ bản

    public HopDongLaoDong(String soHopDong, NhanVien nhanVien, ViTriCongViec viTri, LocalDate ngayBatDau, double luongThoaThuan) {
        this.soHopDong = soHopDong;
        this.nhanVien = nhanVien;
        this.viTri = viTri;
        this.ngayBatDau = ngayBatDau;
        this.luongThoaThuan = luongThoaThuan;
    }

    // Getters
    public ViTriCongViec getViTri() { return viTri; }
    public double getLuongThoaThuan() { return luongThoaThuan; }
}