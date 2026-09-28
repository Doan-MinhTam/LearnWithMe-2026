import java.time.LocalDate;

/**
 * Đại diện cho một phiếu mượn sách.
 * Liên kết một cuốn sách với một độc giả và ghi lại thông tin về ngày mượn, ngày trả.
 */
public class PhieuMuon {
    private final String id;
    private final Sach sach;
    private final DocGia docGia;
    private final LocalDate ngayMuon;
    private final LocalDate ngayTraDuKien;

    public PhieuMuon(String id, Sach sach, DocGia docGia, LocalDate ngayMuon, int soNgayMuon) {
        this.id = id;
        this.sach = sach;
        this.docGia = docGia;
        this.ngayMuon = ngayMuon;
        this.ngayTraDuKien = ngayMuon.plusDays(soNgayMuon);
    }

    // Getters
    public String getId() { return id; }
    public Sach getSach() { return sach; }
    public DocGia getDocGia() { return docGia; }
    public LocalDate getNgayTraDuKien() { return ngayTraDuKien; }

    /**
     * Kiểm tra xem phiếu mượn này đã quá hạn trả hay chưa.
     * @return true nếu đã quá hạn, ngược lại false.
     */
    public boolean isQuaHan() {
        return LocalDate.now().isAfter(this.ngayTraDuKien);
    }

    @Override
    public String toString() {
        return "PhieuMuon[ID=" + id + ", Sach='" + sach.getTieuDe() + "', DocGia=" + docGia.getTenDocGia() + ", HanTra=" + ngayTraDuKien + "]";
    }
}