/**
 * Interface ConfigManager
 * Mô tả: Định nghĩa các phương thức quản lý cấu hình ứng dụng
 * Sinh viên KHÔNG cần chỉnh sửa interface này
 */
public interface ConfigManager {
    /**
     * Lấy giá trị cấu hình theo key
     * @param key - String - Tên của cấu hình
     * @return String - Giá trị cấu hình, hoặc null nếu không tồn tại
     */
    String getConfig(String key);
    
    /**
     * Thiết lập giá trị cấu hình
     * @param key - String - Tên của cấu hình
     * @param value - String - Giá trị cấu hình
     */
    void setConfig(String key, String value);
    
    /**
     * Lấy tất cả các cấu hình
     * @return String - Danh sách tất cả cấu hình
     */
    String getAllConfigs();
}