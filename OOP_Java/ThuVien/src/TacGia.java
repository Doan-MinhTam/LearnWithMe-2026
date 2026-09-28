/**
 * Đại diện cho một tác giả của sách.
 */
public class TacGia {
    private final String id;
    private String tenTacGia;

    public TacGia(String id, String tenTacGia) {
        this.id = id;
        this.tenTacGia = tenTacGia;
    }

    // Getters
    public String getId() { return id; }
    public String getTenTacGia() { return tenTacGia; }

    @Override
    public String toString() {
        return this.tenTacGia;
    }
}