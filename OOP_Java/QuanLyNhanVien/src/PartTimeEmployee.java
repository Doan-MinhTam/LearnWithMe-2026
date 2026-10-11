/**
 * Class PartTimeEmployee - Đại diện cho nhân viên bán thời gian
 * 
 * MÔ TẢ:
 * - PartTimeEmployee là một loại Employee (nhân viên)
 * - Có 4 thuộc tính:
 *   + employeeId (String): Mã nhân viên
 *   + name (String): Tên nhân viên
 *   + workDays (int): Số ngày làm việc trong tháng
 *   + dailyRate (double): Lương theo ngày
 * 
 * YÊU CẦU:
 * 1. Khai báo các thuộc tính với kiểu dữ liệu phù hợp
 * 2. Tạo constructor nhận 4 tham số để khởi tạo đối tượng
 * 3. Implement tất cả phương thức từ interface Employee:
 *    - getEmployeeId(): trả về mã nhân viên
 *    - getName(): trả về tên nhân viên
 *    - getWorkDays(): trả về số ngày làm việc
 *    - calculateSalary():
 *        + Nhân viên part-time được tính lương theo ngày
 *        + Công thức: workDays * dailyRate
 *    - calculateBonus(performanceScore):
 *        + Công thức: calculateSalary() * (performanceScore / 100) * 0.1
 *        + performanceScore: điểm hiệu suất (0-100)
 *        + 0.1: hệ số thưởng 10% cho nhân viên part-time
 * 4. Override phương thức toString():
 *    - Format (4 dòng):
 *      [PART-TIME] Mã NV: [employeeId]
 *      Tên: [name]
 *      Số ngày làm việc: [workDays]
 *      Lương theo ngày: [dailyRate] VNĐ
 */
class PartTimeEmployee implements Employee {
    // TODO: Khai báo thuộc tính với kiểu dữ liệu rõ ràng
    private String employeeId;
    private String name;
    private int workDays;
    private double dailyRate;

    // TODO: Tạo constructor
    public PartTimeEmployee(String employeeId, String name, int workDays, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.workDays = workDays;
        this.dailyRate = dailyRate;
    }

    // TODO: Implement các phương thức từ interface
    @Override
    public String getEmployeeId() { return employeeId; }

    @Override
    public String getName() { return name; }

    @Override
    public int getWorkDays() { return workDays; }

    @Override
    public double calculateSalary() {
        return workDays * dailyRate;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return calculateSalary() * (performanceScore / 100) * 0.1;
    }

    // TODO: Override phương thức toString()
    @Override
    public String toString() {
        return "[PART-TIME] Mã NV: " + employeeId + "\n"
                + "Tên: " + name + "\n"
                + "Số ngày làm việc: " + workDays + "\n"
                + "Lương theo ngày: " + dailyRate + " VNĐ";
    }


}