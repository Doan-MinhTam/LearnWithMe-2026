import java.util.ArrayList;
import java.util.List;

/**
 * Đại diện cho một độc giả (thành viên) của thư viện.
 * Mỗi độc giả có thông tin cá nhân và một danh sách các phiếu mượn đang hoạt động.
 */
public class DocGia {
    private final String id;
    private String tenDocGia;
    private List<PhieuMuon> sachDangMuon;

    public DocGia(String id, String tenDocGia) {
        this.id = id;
        this.tenDocGia = tenDocGia;
        this.sachDangMuon = new ArrayList<>();
    }

    // Getters
    public String getId() { return id; }
    public String getTenDocGia() { return tenDocGia; }
    public List<PhieuMuon> getSachDangMuon() { return sachDangMuon; }

    /**
     * Thêm một phiếu mượn vào danh sách của độc giả.
     * @param phieu Phiếu mượn mới.
     */
    public void themPhieuMuon(PhieuMuon phieu) {
        this.sachDangMuon.add(phieu);
    }

    /**
     * Xóa một phiếu mượn khỏi danh sách sau khi đã trả sách.
     * @param phieu Phiếu mượn cần xóa.
     */
    public void xoaPhieuMuon(PhieuMuon phieu) {
        this.sachDangMuon.remove(phieu);
    }

    @Override
    public String toString() {
        return "DocGia[ID=" + id + ", Ten='" + tenDocGia + "', DangMuon=" + sachDangMuon.size() + " cuon]";
    }
}