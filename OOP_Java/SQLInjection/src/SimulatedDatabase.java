
import java.util.ArrayList;
import java.util.List;

/**
 * Lớp này mô phỏng một cơ sở dữ liệu và "bộ máy truy vấn" của nó.
 * Nó chứa dữ liệu trong bộ nhớ và cung cấp hai cách để truy vấn dữ liệu:
 * 1. Một cách NGUY HIỂM, dễ bị tấn công SQL Injection.
 * 2. Một cách AN TOÀN, mô phỏng cơ chế của Prepared Statements.
 */
public class SimulatedDatabase {
    // Dữ liệu trong bộ nhớ, thay thế cho một bảng 'users' trong DB.
    private static final List<User> userTable = new ArrayList<>();

    /**
     * Khởi tạo dữ liệu mẫu cho "cơ sở dữ liệu".
     */
    public static void initialize() {
        userTable.add(new User(1, "admin", "admin_password_123", "ADMIN"));
        userTable.add(new User(2, "alice", "alice_password_456", "USER"));
        userTable.add(new User(3, "bob", "bob_password_789", "USER"));
    }

    /**
     * [NGUY HIỂM] Thực thi một truy vấn được tạo bằng cách ghép chuỗi.
     * Phương thức này mô phỏng cách một DB engine bị "lừa" bởi chuỗi truy vấn độc hại.
     * @param rawQuery Chuỗi truy vấn SQL thô, được tạo từ việc ghép nối input của người dùng.
     * @return Danh sách người dùng khớp với truy vấn.
     */
    public static List<User> executeVulnerableQuery(String rawQuery) {
        System.out.println("   [DB Engine - VULNERABLE] Executing: " + rawQuery);
        List<User> results = new ArrayList<>();

        // Kịch bản tấn công kinh điển: Bỏ qua kiểm tra mật khẩu
        if (rawQuery.contains("' OR '1'='1'")) {
            System.out.println("   [DB Engine - VULNERABLE] WARNING: Tautology detected! Bypassing password check.");
            // Trả về tất cả người dùng vì '1'='1' luôn đúng
            return new ArrayList<>(userTable);
        }

        // Xử lý truy vấn đăng nhập thông thường
        try {
            // Phân tích chuỗi để lấy username và password (đây là phần mô phỏng)
            String[] parts = rawQuery.split(" AND password = '");
            String password = parts[1].substring(0, parts[1].length() - 1);
            String username = parts[0].substring(parts[0].indexOf("'") + 1);

            for (User user : userTable) {
                if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    results.add(user);
                    break;
                }
            }
        } catch (Exception e) {
            // Bỏ qua lỗi phân tích chuỗi nếu truy vấn không đúng định dạng
        }
        return results;
    }

    /**
     * [AN TOÀN] Thực thi truy vấn bằng cách sử dụng tham số riêng biệt.
     * Phương thức này mô phỏng cách Prepared Statements hoạt động: câu lệnh và dữ liệu
     * được xử lý riêng biệt, ngăn chặn input của người dùng thay đổi logic của câu lệnh.
     *
     * YÊU CẦU DÀNH CHO HỌC SINH:
     * 1. KHÔNG được nối chuỗi `queryTemplate` với các tham số `params`.
     * Hãy coi các giá trị trong `params` là dữ liệu thuần túy để so sánh.
     * 2. Lấy ra tên người dùng và mật khẩu từ mảng `params`. Theo quy ước, `params[0]` là username, `params[1]` là password.
     * 3. Tạo một danh sách `results` để chứa kết quả trả về.
     * 4. Duyệt qua từng `User` có trong `userTable` (đây là bảng dữ liệu giả lập).
     * 5. Với mỗi `User`, hãy so sánh username và password của họ với các giá trị bạn đã lấy ra từ `params`.
     * Sử dụng phương thức `.equals()` để so sánh chuỗi.
     * 6. Nếu cả username và password đều khớp, hãy thêm đối tượng `User` đó vào danh sách `results`.
     * 7. Trả về danh sách `results`.
     *
     * @param queryTemplate Câu lệnh SQL với các placeholder '?'.
     * @param params Các giá trị tham số để điền vào placeholder.
     * @return Danh sách người dùng khớp với truy vấn.
     */
    public static List<User> executeSecureQuery(String queryTemplate, String... params) {
        System.out.println("   [DB Engine - SECURE] Executing template: " + queryTemplate);
        System.out.println("   [DB Engine - SECURE] With params: [" + params[0] + ", " + params[1] + "]");
        
        // TODO: Hoàn thiện code ở đây
        return new ArrayList<>(); // Xóa dòng này sau khi hoàn thiện
    }
}