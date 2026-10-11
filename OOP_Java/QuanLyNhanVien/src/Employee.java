/**
 * Interface Employee - Đại diện cho một nhân viên
 */
interface Employee {
    /**
     * Lấy mã nhân viên
     * @return Mã nhân viên
     */
    String getEmployeeId();
    
    /**
     * Lấy tên nhân viên
     * @return Tên nhân viên
     */
    String getName();
    
    /**
     * Lấy số ngày làm việc trong tháng
     * @return Số ngày làm việc
     */
    int getWorkDays();
    
    /**
     * Tính lương tháng của nhân viên
     * @return Lương tháng (VNĐ)
     */
    double calculateSalary();
    
    /**
     * Tính thưởng dựa trên hiệu suất
     * @param performanceScore Điểm hiệu suất (0-100)
     * @return Tiền thưởng (VNĐ)
     */
    double calculateBonus(double performanceScore);
}