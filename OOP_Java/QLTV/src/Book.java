/**
 * CLASS 1: Book - Đại diện cho một cuốn sách
 * 
 * THUỘC TÍNH:
 * - isbn: String - Mã ISBN của sách (duy nhất)
 * - title: String - Tên sách
 * - author: String - Tác giả
 * - publicationYear: int - Năm xuất bản
 * - isBorrowed: boolean - Trạng thái đã mượn hay chưa
 * - borrowedBy: String - ID của thành viên đang mượn (null nếu chưa mượn)
 * 
 * YÊU CẦU:
 * 1. Implement các interface: Borrowable, Displayable, Validatable
 * 2. Constructor nhận đầy đủ tham số (trừ isBorrowed và borrowedBy - mặc định false và null)
 * 3. Implement phương thức borrow():
 *    - Kiểm tra nếu đã mượn thì throw BookAlreadyBorrowedException
 *    - Nếu chưa mượn thì đánh dấu isBorrowed = true và lưu borrowedBy
 * 4. Implement phương thức returnItem():
 *    - Đặt isBorrowed = false và borrowedBy = null
 * 5. Implement phương thức isBorrowed(): trả về trạng thái mượn
 * 6. Implement phương thức getDisplayInfo():
 *    - Trả về chuỗi với format: "ISBN: [isbn] | Title: [title] | Author: [author] | Year: [year] | Status: [Available/Borrowed by memberID]"
 * 7. Implement phương thức isValid():
 *    - Kiểm tra isbn không null và không rỗng
 *    - Kiểm tra title không null và không rỗng
 *    - Kiểm tra author không null và không rỗng
 *    - Kiểm tra publicationYear > 0 và <= năm hiện tại
 * 8. Override toString() trả về getDisplayInfo()
 * 9. Tạo các getter cho tất cả thuộc tính
 */
class Book implements Borrowable, Displayable, Validatable {
    // TODO: Sinh viên hoàn thiện class này
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;
    private String borrowedBy;

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    @Override
    public void borrow(String memberId) throws BookAlreadyBorrowedException {
        if (isBorrowed) {
            throw new BookAlreadyBorrowedException(
                    "Book '" + title + "' is already borrowed by " + borrowedBy);
        }
        isBorrowed = true;
        borrowedBy = memberId;
    }

    @Override
    public void returnItem() {
        isBorrowed = false ;
        borrowedBy = null;
    }

    @Override
    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public String getDisplayInfo() {
        return "ISBN: " + isbn + " | Title: " + title + " | Author: " + author
                + " | Year: " + publicationYear + " | Status: "
                + (isBorrowed ? "Borrowed by " + borrowedBy : "Available");    }

    @Override
    public boolean isValid() {
        if (isbn == null || isbn.isEmpty()) return false;
        if (title == null || title.isEmpty()) return false;
        if (author == null || author.isEmpty()) return false;
        return publicationYear > 0 && publicationYear <= 2026;
    }

    @Override
    public String toString() {
        return getDisplayInfo();
    }
}