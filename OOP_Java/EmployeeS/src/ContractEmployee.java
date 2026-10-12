import java.util.*;

/**
 * Class ContractEmployee - Nhân viên hợp đồng
 *
 * MÔ TẢ:
 * - ContractEmployee là một loại Employee
 * - Có 5 thuộc tính:
 *   + employeeId (String): Mã nhân viên
 *   + name (String): Tên nhân viên
 *   + salaryRate (double): Lương theo ngày
 *   + workDays (int): Số ngày công
 *   + allowance (double): Phụ cấp (VNĐ)
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getEmployeeId(), getName(), getSalaryRate(), getWorkDays(): return thuộc tính
 *    - calculateSalary():
 *        + Lương gốc = workDays * salaryRate
 *        + Lương thực = lương gốc + allowance
 *    - eligibleForBonus(): Đủ điều kiện nếu workDays >= 24 (đi làm nhiều)
 *    - getPerformanceRank(): giống FullTimeEmployee (dựa workDays)
 * 4. Override toString():
 *    [NHÂN VIÊN HỢP ĐỒNG] Mã NV: [employeeId]
 *    Tên: [name]
 *    Lương/ngày: [salaryRate]
 *    Ngày công: [workDays]
 *    Phụ cấp: [allowance] VNĐ
 */
class ContractEmployee implements Employee {
    private String employeeId;
    private String name;
    private double salaryRate;
    private int workDays;
    private double allowance;

    public ContractEmployee(String employeeId, String name, double salaryRate, int workDays, double allowance) {
        this.employeeId = employeeId;
        this.name = name;
        this.salaryRate = salaryRate;
        this.workDays = workDays;
        this.allowance = allowance;
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
        return workDays * salaryRate + allowance;
    }

    @Override
    public boolean eligibleForBonus() {
        return workDays >= 24;
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
        return "[NHÂN VIÊN HỢP ĐỒNG] Mã NV: " + employeeId + "\n"
                + "Tên: " + name + "\n"
                + "Lương/ngày: " + salaryRate + "\n"
                + "Ngày công: " + workDays + "\n"
                + "Phụ cấp: " + allowance + " VNĐ";
    }
}