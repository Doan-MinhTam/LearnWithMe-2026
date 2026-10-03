/**
 * Lớp dữ liệu đơn giản (POJO) đại diện cho một người dùng trong hệ thống.
 * Tương đương với một hàng (row) trong bảng 'users' của cơ sở dữ liệu.
 */
public class User {
    private final int id;
    private final String username;
    private final String password;
    private final String role;

    public User(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "User[ID=" + id + ", Username='" + username + "', Role='" + role + "']";
    }
}