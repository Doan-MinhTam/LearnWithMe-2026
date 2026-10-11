/**
 * Interface Course - Đại diện cho một môn học
 *
 * Các phương thức cần có:
 * - getCourseId(): trả về mã môn học
 * - getCourseName(): trả về tên môn học
 * - getCredits(): trả về số tín chỉ
 * - getStudentCount(): trả về số sinh viên
 * - calculateTeachingCost(): trả về chi phí giảng dạy
 * - canOpenClass(): kiểm tra môn có đủ điều kiện mở lớp không
 * - getClassification(): trả về xếp loại môn học
 */
interface Course {
    String getCourseId();
    String getCourseName();
    int getCredits();
    int getStudentCount();
    double calculateTeachingCost();
    boolean canOpenClass();
    String getClassification();
    double calculateTuitionFee();
}