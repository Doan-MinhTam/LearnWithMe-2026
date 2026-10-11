/**
 * Interface Student - Đại diện cho một sinh viên
 */
interface Student {
    /**
     * Lấy mã sinh viên
     * @return Mã sinh viên
     */
    String getStudentId();
    
    /**
     * Lấy tên sinh viên
     * @return Tên sinh viên
     */
    String getName();
    
    /**
     * Lấy điểm trung bình
     * @return Điểm trung bình (0-10)
     */
    double getGPA();
    
    /**
     * Lấy số tín chỉ đã hoàn thành
     * @return Số tín chỉ
     */
    int getCredits();
    
    /**
     * Tính học phí phải đóng
     * @return Học phí (VNĐ)
     */
    double calculateTuition();
    
    /**
     * Kiểm tra sinh viên có đủ điều kiện tốt nghiệp không
     * @return true nếu đủ điều kiện, false nếu không
     */
    boolean canGraduate();
    
    /**
     * Lấy xếp loại học lực
     * @return Xếp loại (Xuất sắc, Giỏi, Khá, Trung bình, Yếu)
     */
    String getAcademicRank();
}
