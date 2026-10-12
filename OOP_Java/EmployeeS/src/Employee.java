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
     * Lấy hệ số / mức lương cơ bản theo ngày
     * @return salaryRate
     */
    double getSalaryRate();

    /**
     * Lấy số ngày công
     * @return workDays
     */
    int getWorkDays();

    /**
     * Tính lương phải trả
     * @return Lương (VNĐ)
     */
    double calculateSalary();

    /**
     * Kiểm tra nhân viên có đủ điều kiện nhận thưởng không
     * @return true nếu đủ điều kiện, false nếu không
     */
    boolean eligibleForBonus();

    /**
     * Lấy xếp loại hiệu suất
     * @return Xếp loại (Xuất sắc, Tốt, Khá, Trung bình, Kém)
     */
    String getPerformanceRank();
}