import java.util.List;

/**
 * Lớp Client mô phỏng một ứng dụng web có chức năng đăng nhập.
 * Lớp này sẽ thực hiện các kịch bản:
 * 1. Đăng nhập hợp lệ.
 * 2. Tấn công SQL Injection vào hệ thống VULNERABLE.
 * 3. Tấn công SQL Injection vào hệ thống SECURE để thấy sự khác biệt.
 */
public class Main {

    /**
     * [NGUY HIỂM] Hàm này mô phỏng cách một lập trình viên thiếu kinh nghiệm
     * xây dựng câu truy vấn bằng cách ghép chuỗi trực tiếp.
     *
     * YÊU CẦU DÀNH CHO HỌC SINH:
     * 1. Hãy tạo ra một chuỗi truy vấn SQL (biến `query`) để chọn người dùng từ bảng `users`.
     * 2. Câu truy vấn phải có dạng: "SELECT * FROM users WHERE username = '[username]' AND password = '[password]'"
     * 3. Trong đó, [username] và [password] phải được thay thế bằng các giá trị từ tham số `username` và `password` của hàm.
     * LƯU Ý: Hãy sử dụng phương pháp nối chuỗi trực tiếp.
     * 4. Cuối cùng, gọi và trả về kết quả từ hàm `SimulatedDatabase.executeVulnerableQuery(query)`.
     */
    public static List<User> vulnerableLogin(String username, String password) {
        // TODO: Hoàn thiện code ở đây
        return null; // Xóa dòng này sau khi hoàn thiện
}

    /**
     * [AN TOÀN] Hàm này mô phỏng cách sử dụng Prepared Statements.
     * Câu lệnh và dữ liệu được gửi riêng biệt đến "cơ sở dữ liệu".
     */
    public static List<User> secureLogin(String username, String password) {
        String queryTemplate = "SELECT * FROM users WHERE username = ? AND password = ?";
        return SimulatedDatabase.executeSecureQuery(queryTemplate, username, password);
    }

    public static void main(String[] args) {
        SimulatedDatabase.initialize();

        System.out.println("========== KỊCH BẢN 1: ĐĂNG NHẬP HỢP LỆ ==========");
        System.out.println("--- Dùng phương thức VULNERABLE ---");
        List<User> validResult1 = vulnerableLogin("alice", "alice_password_456");
        System.out.println("Kết quả: " + (validResult1.isEmpty() ? "Đăng nhập thất bại." : "Đăng nhập thành công! User: " + validResult1.get(0)));

        System.out.println("\n--- Dùng phương thức SECURE ---");
        List<User> validResult2 = secureLogin("alice", "alice_password_456");
        System.out.println("Kết quả: " + (validResult2.isEmpty() ? "Đăng nhập thất bại." : "Đăng nhập thành công! User: " + validResult2.get(0)));

        System.out.println("\n\n========== KỊCH BẢN 2: TẤN CÔNG SQL INJECTION ==========");
        String usernameInput = "admin";
        // Kẻ tấn công không biết mật khẩu, nên nhập một chuỗi độc hại vào trường password.
        // Chuỗi ' OR '1'='1' sẽ làm cho mệnh đề WHERE luôn đúng, bỏ qua việc kiểm tra mật khẩu.
        String passwordInput_Attack = "' OR '1'='1'";

        System.out.println("--- Tấn công vào phương thức VULNERABLE ---");
        System.out.println("Kẻ tấn công nhập username: " + usernameInput);
        System.out.println("Kẻ tấn công nhập password: " + passwordInput_Attack);
        List<User> attackResult1 = vulnerableLogin(usernameInput, passwordInput_Attack);

        if (attackResult1.isEmpty()) {
            System.out.println("Kết quả: Tấn công thất bại.");
        } else {
            System.out.println("Kết quả: TẤN CÔNG THÀNH CÔNG! Đã bypass đăng nhập và lấy được danh sách người dùng:");
            for (User u : attackResult1) {
                System.out.println("   - " + u);
            }
        }

        System.out.println("\n--- Tấn công vào phương thức SECURE (THE FIX) ---");
        System.out.println("Kẻ tấn công nhập username: " + usernameInput);
        System.out.println("Kẻ tấn công nhập password: " + passwordInput_Attack);
        List<User> attackResult2 = secureLogin(usernameInput, passwordInput_Attack);

        if (attackResult2.isEmpty()) {
            System.out.println("Kết quả: TẤN CÔNG THẤT BẠI. Hệ thống an toàn vì nó tìm kiếm một người dùng có mật khẩu chính xác là \"' OR '1'='1'\", và không có ai cả.");
        } else {
            System.out.println("Kết quả: Tấn công thành công (đây là điều không mong muốn).");
        }
    }
}