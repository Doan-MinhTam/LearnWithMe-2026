import java.util.*;

/**
 * Class RegularCourse - Môn học thường
 *
 * MÔ TẢ:
 * - Có 4 thuộc tính:
 *   + courseId (String): Mã môn học
 *   + courseName (String): Tên môn học
 *   + credits (int): Số tín chỉ
 *   + studentCount (int): Số sinh viên đăng ký
 *
 * YÊU CẦU:
 * 1. Khai báo thuộc tính
 * 2. Tạo constructor
 * 3. Cài đặt các phương thức:
 *    - getCourseId(), getCourseName(), getCredits(), getStudentCount()
 *    - calculateTuitionFee(): credits * studentCount * 450000
 *    - canOpenClass(): true nếu studentCount >= 10
 *    - getClassification():
 *        + credits >= 5: "Chuyên sâu"
 *        + credits >= 4: "Quan trọng"
 *        + credits >= 3: "Cơ bản"
 *        + còn lại: "Đại cương"
 * 4. Override toString():
 *    [MÔN HỌC THƯỜNG] Mã môn: [courseId]
 *    Tên môn: [courseName]
 *    Số tín chỉ: [credits]
 *    Số sinh viên: [studentCount]
 */
class RegularCourse implements Course {
    // TODO
    private String courseId;
    private String courseName;
    private int credits;
    private int studentCount;

    public RegularCourse(String courseId, String courseName, int credits, int studentCount) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.studentCount = studentCount;
    }

    @Override
    public String getCourseId() { return courseId; }

    @Override
    public String getCourseName() { return courseName; }

    @Override
    public int getCredits() { return credits; }

    @Override
    public int getStudentCount() { return studentCount; }

    public double calculateTuitionFee() {
        return credits * studentCount * 450000.0;
    }

    @Override
    public double calculateTeachingCost() {
        return calculateTuitionFee();
    }

    @Override
    public boolean canOpenClass() {
        return studentCount >= 10;
    }

    @Override
    public String getClassification() {
        if (credits >= 5) return "Chuyên sâu";
        if (credits >= 4) return "Quan trọng";
        if (credits >= 3) return "Cơ bản";
        return "Đại cương";
    }

    @Override
    public String toString() {
        return "[MÔN HỌC THƯỜNG] Mã môn: " + courseId + "\n"
                + "Tên môn: " + courseName + "\n"
                + "Số tín chỉ: " + credits + "\n"
                + "Số sinh viên: " + studentCount;
    }
}