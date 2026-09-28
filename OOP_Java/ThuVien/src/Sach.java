/**
 * Đại diện cho một cuốn sách trong thư viện.
 * Mỗi cuốn sách có thông tin cơ bản và trạng thái (có sẵn hoặc đang được mượn).
 */
public class Sach {
    private final String id;
    private String tieuDe;
    private TacGia tacGia;
    private TrangThaiSach trangThai;

    public Sach(String id, String tieuDe, TacGia tacGia) {
        this.id = id;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.trangThai = TrangThaiSach.CO_SAN; // Mặc định sách mới là có sẵn
    }

    // Getters
    public String getId() { return id; }
    public String getTieuDe() { return tieuDe; }
    public TacGia getTacGia() { return tacGia; }
    public TrangThaiSach getTrangThai() { return trangThai; }

    /**
     * Cập nhật trạng thái của cuốn sách.
     * Đây là một phương thức quan trọng để quản lý việc mượn/trả.
     * @param trangThaiMoi Trạng thái mới của sách.
     */
    public void setTrangThai(TrangThaiSach trangThaiMoi) {
        this.trangThai = trangThaiMoi;
    }

    @Override
    public String toString() {
        return "Sach[ID=" + id + ", TieuDe='" + tieuDe + "', TacGia=" + tacGia.getTenTacGia() + ", TrangThai=" + trangThai.getMoTa() + "]";
    }
}