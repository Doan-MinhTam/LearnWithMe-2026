import java.util.*;

/**
 * Class FullTimeEmployee - Nhân viên chính thức
 *
 * MÔ TẢ:
 * - FullTimeEmployee là một loại Employee
 * - Có 4 thuộc tính:
 *   + employeeId (String): Mã nhân viên
 *   + name (String): Tên nhân viên
 *   + salaryRate (double): Lương theo ngày
 *   + workDays (int): Số ngày công
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getEmployeeId(), getName(), getSalaryRate(), getWorkDays(): return thuộc tính
 *    - calculateSalary(): Lương = workDays * salaryRate
 *    - eligibleForBonus(): Đủ điều kiện nếu workDays >= 22 VÀ salaryRate >= 300000
 *    - getPerformanceRank():
 *        + workDays >= 26: "Xuất sắc"
 *        + workDays >= 24: "Tốt"
 *        + workDays >= 22: "Khá"
 *        + workDays >= 20: "Trung bình"
 *        + workDays < 20: "Kém"
 * 4. Override toString():
 *    [NHÂN VIÊN CHÍNH THỨC] Mã NV: [employeeId]
 *    Tên: [name]
 *    Lương/ngày: [salaryRate]
 *    Ngày công: [workDays]
 */
class FullTimeEmployee implements Employee {
    private String employeeId;
    private String name;
    private double salaryRate;
    private int workDays;

    public FullTimeEmployee(String employeeId, String name, double salaryRate, int workDays) {
        this.employeeId = employeeId;
        this.name = name;
        this.salaryRate = salaryRate;
        this.workDays = workDays;
    }

    @Override
    public String getEmployeeId() { return employeeId; }

    @Override
    public String getName() { return name; }

    @Override
    public double getSalaryRate() { return salaryRate; }

    @Override
    public int getWorkDays() { return workDays; }

    @Override
    public double calculateSalary() {
        return workDays * salaryRate;
    }

    @Override
    public boolean eligibleForBonus() {
        return workDays >= 22 && salaryRate >= 300000;
    }

    @Override
    public String getPerformanceRank() {
        if (workDays >= 26) return "Xuất sắc";
        if (workDays >= 24) return "Tốt";
        if (workDays >= 22) return "Khá";
        if (workDays >= 20) return "Trung bình";
        return "Kém";
    }

    @Override
    public String toString() {
        return "[NHÂN VIÊN CHÍNH THỨC] Mã NV: " + employeeId + "\n"
                + "Tên: " + name + "\n"
                + "Lương/ngày: " + salaryRate + "\n"
                + "Ngày công: " + workDays;
    }
}