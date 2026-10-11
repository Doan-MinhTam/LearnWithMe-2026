/**
 * Class RegularStudent - Sinh viên thường
 * 
 * MÔ TẢ:
 * - RegularStudent là một loại Student
 * - Có 4 thuộc tính:
 *   + studentId (String): Mã sinh viên
 *   + name (String): Tên sinh viên
 *   + gpa (double): Điểm trung bình (0-10)
 *   + credits (int): Số tín chỉ đã hoàn thành
 * 
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 *    - getStudentId(), getName(), getGPA(), getCredits(): return thuộc tính
 *    - calculateTuition(): Học phí = credits * 200000
 *    - canGraduate(): Đủ điều kiện nếu credits >= 120 VÀ gpa >= 2.0
 *    - getAcademicRank(): 
 *        + GPA >= 9.0: "Xuất sắc"
 *        + GPA >= 8.0: "Giỏi"
 *        + GPA >= 6.5: "Khá"
 *        + GPA >= 5.0: "Trung bình"
 *        + GPA < 5.0: "Yếu"
 * 4. Override toString():
 *    [SINH VIÊN THƯỜNG] Mã SV: [studentId]
 *    Tên: [name]
 *    GPA: [gpa]
 *    Tín chỉ: [credits]
 */
import java.util.*;
class RegularStudent implements Student {
    // TODO: Khai báo thuộc tính
    
    // TODO: Constructor
    
    // TODO: Implement các phương thức
    
    // TODO: Override toString()
    private String studentId;
    private String name;
    private double gpa;
    private int credits;

    public RegularStudent(String studentId, String name, double gpa, int credits) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.credits = credits;
    }

    @Override
    public String getStudentId() { return studentId; }

    @Override
    public String getName() { return name; }

    @Override
    public double getGPA() { return gpa; }

    @Override
    public int getCredits() { return credits; }

    @Override
    public double calculateTuition() {
        return credits * 200000.0;
    }

    @Override
    public boolean canGraduate() {
        return credits >= 120 && gpa >= 2.0;
    }

    @Override
    public String getAcademicRank() {
        if (gpa >= 9.0) return "Xuất sắc";
        if (gpa >= 8.0) return "Giỏi";
        if (gpa >= 6.5) return "Khá";
        if (gpa >= 5.0) return "Trung bình";
        return "Yếu";
    }

    @Override
    public String toString() {
        return "[SINH VIÊN THƯỜNG] Mã SV: " + studentId + "\n"
                + "Tên: " + name + "\n"
                + "GPA: " + gpa + "\n"
                + "Tín chỉ: " + credits;
    }
}