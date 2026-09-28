/**
 * Đại diện cho một nghệ sĩ hoặc ca sĩ.
 * Đây là một lớp dữ liệu đơn giản chứa thông tin cơ bản về nghệ sĩ.
 */
public class NgheSi {
    private final String id;
    private String tenNgheSi;

    /**
     * Constructor để tạo một đối tượng NgheSi mới.
     * @param id ID duy nhất của nghệ sĩ.
     * @param tenNgheSi Tên của nghệ sĩ.
     */
    public NgheSi(String id, String tenNgheSi) {
        this.id = id;
        this.tenNgheSi = tenNgheSi;
    }

    // Getters
    public String getId() { return id; }
    public String getTenNgheSi() { return tenNgheSi; }

    @Override
    public String toString() {
        return this.tenNgheSi; // Trả về tên cho dễ đọc
    }
}