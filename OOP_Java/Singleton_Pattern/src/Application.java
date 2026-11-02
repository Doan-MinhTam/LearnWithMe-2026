/**
 * Class Application
 * Mô tả: Ứng dụng sử dụng các Singleton để quản lý cấu hình và database
 * Sinh viên KHÔNG cần chỉnh sửa class này
 */
public class Application {
    private String name;
    private ApplicationConfig config;
    private DatabaseConnection dbConnection;
    
    public Application(String name) {
        this.name = name;
        System.out.println("Khởi động ứng dụng: " + name);
    }
    
    public void initialize() {
        System.out.println("\n--- Khởi tạo cấu hình ứng dụng ---");
        config = ApplicationConfig.getInstance(name);
        
        // Thiết lập các cấu hình mặc định
        config.setConfig("theme", "dark");
        config.setConfig("language", "vi");
        config.setConfig("api_url", "https://api.example.com");
    }
    
    public void connectDatabase() {
        System.out.println("\n--- Kết nối database ---");
        String dbHost = config.getConfig("db_host");
        if (dbHost == null) {
            dbHost = "localhost";
            config.setConfig("db_host", dbHost);
        }
        
        dbConnection = DatabaseConnection.getInstance(dbHost, 3306, name + "_db");
        dbConnection.connect();
    }
    
    public void showStatus() {
        System.out.println("\n--- Trạng thái ứng dụng ---");
        System.out.println("Ứng dụng: " + name);
        System.out.println(config.toString());
        System.out.println("\nCác cấu hình:");
        System.out.println(config.getAllConfigs());
        System.out.println("\n" + dbConnection.toString());
        System.out.println(dbConnection.getConnectionInfo());
    }
    
    public void shutdown() {
        System.out.println("\n--- Tắt ứng dụng ---");
        if (dbConnection != null) {
            dbConnection.disconnect();
        }
        System.out.println("Đã tắt ứng dụng: " + name);
    }
}