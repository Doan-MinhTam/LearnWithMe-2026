/**
 * CLASS 2: LibraryMember - Đại diện cho thành viên thư viện
 * 
 * THUỘC TÍNH:
 * - memberId: String - ID thành viên (duy nhất)
 * - name: String - Tên thành viên
 * - email: String - Email thành viên
 * - phoneNumber: String - Số điện thoại
 * - borrowedBooks: int - Số sách đang mượn
 * - maxBorrowLimit: int - Số sách tối đa được mượn (mặc định 5)
 * 
 * YÊU CẦU:
 * 1. Implement các interface: Displayable, Validatable
 * 2. Constructor nhận các tham số: memberId, name, email, phoneNumber
 *    - borrowedBooks mặc định = 0
 *    - maxBorrowLimit mặc định = 5
 * 3. Implement phương thức getDisplayInfo():
 *    - Format: "Member ID: [id] | Name: [name] | Email: [email] | Phone: [phone] | Borrowed: [borrowedBooks]/[maxBorrowLimit]"
 * 4. Implement phương thức isValid():
 *    - Kiểm tra memberId không null và không rỗng
 *    - Kiểm tra name không null và không rỗng
 *    - Kiểm tra email chứa ký tự '@'
 *    - Kiểm tra phoneNumber không null và có độ dài >= 10
 * 5. Phương thức canBorrowMore(): trả về true nếu borrowedBooks < maxBorrowLimit
 * 6. Phương thức incrementBorrowCount(): tăng borrowedBooks lên 1
 * 7. Phương thức decrementBorrowCount(): giảm borrowedBooks xuống 1 (không được < 0)
 * 8. Override toString() trả về getDisplayInfo()
 * 9. Tạo các getter cho tất cả thuộc tính
 */
class LibraryMember implements Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này
        private String memberId;
        private String name;
        private String email;
        private String phoneNumber;
        private int borrowedBooks;
        private int maxBorrowLimit;

    public LibraryMember(String memberId, String name, String email, String phoneNumber) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.borrowedBooks = 0;
        this.maxBorrowLimit = 5;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getMaxBorrowLimit() {
        return maxBorrowLimit;
    }

    @Override
    public String getDisplayInfo() {
        return String.format("Member ID: "+memberId+" | Name: "+name+" | Email: "+email+" | Phone: "+phoneNumber+" | Borrowed: "+borrowedBooks+"/"+maxBorrowLimit);
    }

    @Override
    public boolean isValid() {
        if (memberId == null || memberId.isEmpty()) return false;
        if (name == null || name.isEmpty()) return false;
        if (email == null || !email.contains("@")) return false;
        return phoneNumber != null && phoneNumber.length() >= 10;
    }

    public boolean canBorrowMore(){
        return borrowedBooks < maxBorrowLimit;
    }

    public void incrementBorrowCount() {
        borrowedBooks ++;
    }

    public void decrementBorrowCount(){
        if (borrowedBooks > 0) {
            borrowedBooks--;
        }
    }

    @Override
    public String toString() {
        return getDisplayInfo();
    }
}
