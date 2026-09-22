import java.util.HashMap;
import java.util.Map;

/**
 * Lớp Inventory quản lý số lượng tồn kho của sản phẩm và tiền.
 * Lớp này tuân thủ nguyên tắc Single Responsibility, chỉ tập trung vào việc lưu trữ và quản lý dữ liệu.
 */
public class Inventory<T> {

    private final Map<T, Integer> inventory = new HashMap<>();

    public int getQuantity(T item) {
        return inventory.getOrDefault(item, 0);
    }

    public void add(T item) {
        inventory.put(item, getQuantity(item) + 1);
    }

    public void deduct(T item) {
        if (hasItem(item)) {
            inventory.put(item, getQuantity(item) - 1);
        }
    }

    public boolean hasItem(T item) {
        return getQuantity(item) > 0;
    }

    public void clear() {
        inventory.clear();
    }

    public void put(T item, int quantity) {
        inventory.put(item, quantity);
    }
}