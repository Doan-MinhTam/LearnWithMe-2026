/**
 * Class ScholarshipStudent - Sinh viên học bổng
 * <p>
 * MÔ TẢ:
 * - ScholarshipStudent là một loại Student
 * - Có 5 thuộc tính:
 * + studentId (String): Mã sinh viên
 * + name (String): Tên sinh viên
 * + gpa (double): Điểm trung bình (0-10)
 * + credits (int): Số tín chỉ đã hoàn thành
 * + scholarshipAmount (double): Số tiền học bổng
 * <p>
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Implement các phương thức:
 * - getStudentId(), getName(), getGPA(), getCredits(): return thuộc tính
 * - calculateTuition():
 * + Học phí gốc = credits * 200000
 * + Học phí thực = học phí gốc - scholarshipAmount
 * + Nếu học phí thực < 0 thì return 0
 * - canGraduate(): Đủ điều kiện nếu credits >= 120 VÀ gpa >= 2.0
 * - getAcademicRank(): Giống RegularStudent
 * 4. Override toString():
 * [SINH VIÊN HỌC BỔNG] Mã SV: [studentId]
 * Tên: [name]
 * GPA: [gpa]
 * Tín chỉ: [credits]
 * Học bổng: [scholarshipAmount] VNĐ
 */

import java.util.*;

class ScholarshipStudent implements Student {
    // TODO: Khai báo thuộc tính

    // TODO: Constructor

    // TODO: Implement các phương thức

    // TODO: Override toString()
    private String studentId;
    private String name;
    private double gpa;
    private int credits;
    private double scholarshipAmount;

    public ScholarshipStudent(String studentId, String name, double gpa, int credits, double scholarshipAmount) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
        this.credits = credits;
        this.scholarshipAmount = scholarshipAmount;
    }

    @Override
    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getGPA() {
        return gpa;
    }

    @Override
    public int getCredits() {
        return credits;
    }

    @Override
    public double calculateTuition() {
        double tuition = credits * 200000.0 - scholarshipAmount;
        return tuition < 0 ? 0 : tuition;
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
        return "[SINH VIÊN HỌC BỔNG] Mã SV: " + studentId + "\n"
                + "Tên: " + name + "\n"
                + "GPA: " + gpa + "\n"
                + "Tín chỉ: " + credits + "\n"
                + "Học bổng: " + scholarshipAmount + " VNĐ";
    }
}