/**
 * Đại diện cho một bài hát trong thư viện nhạc.
 * Mỗi bài hát có thông tin về tên, nghệ sĩ trình bày và thời lượng.
 */
public class BaiHat {
    private final String id;
    private String tenBaiHat;
    private NgheSi ngheSi; // Một bài hát "có một" nghệ sĩ
    private int thoiLuongGiay; // Thời lượng tính bằng giây

    /**
     * Constructor để tạo một đối tượng BaiHat mới.
     * @param id ID duy nhất của bài hát.
     * @param tenBaiHat Tên bài hát.
     * @param ngheSi Đối tượng NgheSi trình bày bài hát.
     * @param thoiLuongGiay Thời lượng của bài hát (giây).
     */
    public BaiHat(String id, String tenBaiHat, NgheSi ngheSi, int thoiLuongGiay) {
        this.id = id;
        this.tenBaiHat = tenBaiHat;
        this.ngheSi = ngheSi;
        this.thoiLuongGiay = thoiLuongGiay;
    }

    // Getters
    public String getId() { return id; }
    public String getTenBaiHat() { return tenBaiHat; }
    public NgheSi getNgheSi() { return ngheSi; }
    public int getThoiLuongGiay() { return thoiLuongGiay; }

    @Override
    public String toString() {
        return "'" + tenBaiHat + "' - " + ngheSi.getTenNgheSi() + " (" + thoiLuongGiay + "s)";
    }
}