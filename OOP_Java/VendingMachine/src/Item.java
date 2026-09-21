/**
 * Lớp Item đại diện cho một loại sản phẩm trong máy bán hàng.
 * Đây là một lớp thông thường thay thế cho enum.
 */
public class Item {

    private final String name;
    private final long price;

    public Item(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    // Ghi đè equals và hashCode là rất quan trọng để Map có thể hoạt động chính xác
    // khi sử dụng đối tượng Item làm key.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return name.equals(item.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}