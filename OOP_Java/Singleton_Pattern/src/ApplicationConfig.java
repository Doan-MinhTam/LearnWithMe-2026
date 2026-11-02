import java.util.HashMap;
import java.util.Map;

/**
 * Class ApplicationConfig (SINGLETON)
 * Mô tả: Quản lý cấu hình toàn cục của ứng dụng (database, API, theme...)
 * 
 * Thuộc tính:
 * - instance: ApplicationConfig (static) - Instance duy nhất của class
 * - configs: Map<String, String> - Lưu trữ các cấu hình dạng key-value
 * - appName: String - Tên ứng dụng
 * 
 * Yêu cầu:
 * 1. Implement interface ConfigManager
 * 2. Áp dụng Singleton Pattern (chỉ có 1 instance duy nhất)
 * 3. Constructor private nhận vào appName, khởi tạo HashMap cho configs
 * 4. Method getInstance(String appName): 
 *    - Nếu instance == null: tạo mới và in "Khởi tạo ApplicationConfig cho ứng dụng: [appName]"
 *    - Nếu instance != null: in "ApplicationConfig đã tồn tại cho ứng dụng: [appName]"
 *    - Return instance
 * 5. Implement getConfig(String key): return giá trị từ Map, hoặc null nếu không có
 * 6. Implement setConfig(String key, String value): 
 *    - Lưu vào Map
 *    - In "Đã cập nhật cấu hình: [key] = [value]"
 * 7. Implement getAllConfigs(): return tất cả cấu hình theo format "key=value" mỗi dòng
 * 8. Override toString(): return "ApplicationConfig[appName=XXX, totalConfigs=X]"
 */
public class ApplicationConfig implements ConfigManager {
    private static ApplicationConfig instance = null;
    private Map<String, String> configs;
    private String appName;
    
    private ApplicationConfig(String appName) {
        this.appName = appName;
        this.configs = new HashMap<>();
    }
    
    
    
    // Reset method for testing purposes
    public static void resetInstance() {
        instance = null;
    }
}