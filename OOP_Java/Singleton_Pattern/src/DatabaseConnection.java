/**
 * Class DatabaseConnection (SINGLETON - THREAD SAFE)
 * Mô tả: Quản lý kết nối database duy nhất trong ứng dụng
 * 
 * Thuộc tính:
 * - instance: DatabaseConnection (static volatile) - Instance duy nhất
 * - host: String - Địa chỉ host của database
 * - port: int - Cổng kết nối
 * - databaseName: String - Tên database
 * - isConnected: boolean - Trạng thái kết nối
 * 
 * Yêu cầu:
 * 1. Áp dụng Singleton Pattern với Double-Checked Locking (thread-safe)
 * 2. Constructor private nhận vào host, port, databaseName
 *    - Khởi tạo isConnected = false
 *    - In "Đang thiết lập kết nối database..."
 * 3. Method getInstance(String host, int port, String databaseName):
 *    - Sử dụng Double-Checked Locking
 *    - Nếu tạo mới: in "Tạo kết nối mới đến database: [databaseName]"
 *    - Nếu đã tồn tại: in "Sử dụng kết nối hiện tại đến: [databaseName]"
 *    - Return instance
 * 4. Method connect():
 *    - Nếu chưa connected: set isConnected = true, in "Kết nối thành công đến [host]:[port]/[databaseName]"
 *    - Nếu đã connected: in "Database đã được kết nối rồi!"
 * 5. Method disconnect():
 *    - Nếu đang connected: set isConnected = false, in "Đã ngắt kết nối database"
 *    - Nếu chưa connected: in "Database chưa được kết nối!"
 * 6. Method getConnectionInfo(): return thông tin kết nối dạng String
 * 7. Override toString(): return "DatabaseConnection[host=XXX, port=XXX, database=XXX, connected=true/false]"
 */
public class DatabaseConnection {
    private static volatile DatabaseConnection instance = null;
    private String host;
    private int port;
    private String databaseName;
    private boolean isConnected;
    
    private DatabaseConnection(String host, int port, String databaseName) {
        this.host = host;
        this.port = port;
        this.databaseName = databaseName;
        this.isConnected = false;
        System.out.println("Đang thiết lập kết nối database...");
    }
    
    
    
    // Reset method for testing purposes
    public static void resetInstance() {
        instance = null;
    }
}