import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Lớp ProductCatalog hoạt động như một cơ sở dữ liệu tĩnh cho các sản phẩm.
 * Nó đảm bảo chỉ có một định nghĩa duy nhất cho mỗi sản phẩm.
 */
public class ProductCatalog {

    private static final Map<String, Item> items = new HashMap<>();

    // Khối static để khởi tạo danh sách sản phẩm khi lớp được tải
    static {
        items.put("Coke", new Item("Coke", 10000));
        items.put("Pepsi", new Item("Pepsi", 10000));
        items.put("Snack", new Item("Snack", 5000));
    }

    /**
     * Lấy một đối tượng Item dựa trên tên nó.
     * @param name Tên sản phẩm.
     * @return Đối tượng Item tương ứng, hoặc null nếu không tìm thấy.
     */
    public static Item getItem(String name) {
        return items.get(name);
    }

    /**
     * Lấy danh sách tất cả các sản phẩm có trong danh mục.
     * @return Một Collection chứa tất cả các đối tượng Item.
     */
    public static Collection<Item> getAllItems() {
        return Collections.unmodifiableCollection(items.values());
    }
}