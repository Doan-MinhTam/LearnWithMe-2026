/**
 * Interface cho các đối tượng có thể mượn
 */
interface Borrowable {
    /**
     * Mượn tài liệu
     * @param memberId ID của thành viên mượn
     * @throws BookAlreadyBorrowedException nếu tài liệu đã được mượn
     */
    void borrow(String memberId) throws BookAlreadyBorrowedException;
    
    /**
     * Trả tài liệu
     */
    void returnItem();
    
    /**
     * Kiểm tra tài liệu có đang được mượn không
     * @return true nếu đang được mượn
     */
    boolean isBorrowed();
}

