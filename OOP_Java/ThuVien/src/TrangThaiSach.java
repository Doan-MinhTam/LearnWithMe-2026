/**
 * Đại diện cho các trạng thái của một cuốn sách trong thư viện.
 * Lớp này thay thế enum, sử dụng constructor private và các hằng số public static final.
 */
public class TrangThaiSach {
    public static final TrangThaiSach CO_SAN = new TrangThaiSach("Có sẵn");
    public static final TrangThaiSach DANG_DUOC_MUON = new TrangThaiSach("Đang được mượn");

    private final String moTa;

    /**
     * Constructor private để ngăn việc tạo trạng thái tùy ý.
     * @param moTa Mô tả của trạng thái.
     */
    private TrangThaiSach(String moTa) {
        this.moTa = moTa;
    }

    public String getMoTa() {
        return moTa;
    }

    @Override
    public String toString() {
        return this.moTa;
    }
}