import java.lang.reflect.Array;
import java.util.*;
import java.util.zip.CheckedOutputStream;

class CourseManager {
    private List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    /**
     * Tìm môn học theo mã.
     * Đầu vào: courseId
     * Đầu ra:
     * - trả về Course nếu tìm thấy
     * - trả về null nếu không tìm thấy
     */
    public Course findCourseById(String courseId) {
        // TODO

        Course course = null;
        for (Course cs : courses) {
            if (cs.getCourseId().equalsIgnoreCase(courseId)) {
                course = cs;
                return course;
            }
        }
        return null;
    }

    /**
     * Tìm các môn học có tên chứa từ khóa.
     * Đầu vào: keyword
     * Đầu ra: danh sách môn học phù hợp, nếu không có thì trả về danh sách rỗng
     */
    public List<Course> searchCoursesByName(String keyword) {
        // TODO
        ArrayList<Course> results = new ArrayList<>();
        for (Course cs : courses) {
            if (cs.getCourseName().contains(keyword)) {
                results.add(cs);
            }
        }
        return results;
    }

    /**
     * Lấy danh sách môn học đủ điều kiện mở lớp.
     * Đầu ra: danh sách môn học thỏa điều kiện, nếu không có thì trả về danh sách rỗng
     */
    public List<Course> getCoursesCanOpen() {
        // TODO
        ArrayList<Course> results = new ArrayList<>();
        for (Course cs : courses) {
            if (cs.getStudentCount() >= 10) {
                results.add(cs);
            }
        }
        return results;
    }

    /**
     * Lấy top n môn học có số tín chỉ cao nhất.
     * Đầu vào: n
     * Đầu ra: danh sách tối đa n môn học
     */
    public List<Course> getTopCourses(int n) {
        // TODO
        ArrayList<Course> results = new ArrayList<>(courses);
        results.sort(Comparator.comparing(Course::getCredits).reversed());
        return results.subList(0,n);
    }

    /**
     * Sắp xếp môn học theo số tín chỉ.
     * Đầu vào:
     * - ascending = true: tăng dần
     * - ascending = false: giảm dần
     * Đầu ra: danh sách mới đã sắp xếp
     */
    public List<Course> sortByCredits(boolean ascending) {
        // TODO
        ArrayList<Course> results = new ArrayList<>(courses);
        if (ascending) {
            results.sort(Comparator.comparing(Course::getCredits));
            return results;
        }
        results.sort(Comparator.comparing(Course::getCredits).reversed());
        return results;
    }

    /**
     * Sắp xếp môn học theo tên A-Z.
     * Đầu ra: danh sách mới đã sắp xếp
     */
    public List<Course> sortByName() {
        // TODO
        ArrayList<Course> results = new ArrayList<>(courses);
        results.sort(Comparator.comparing(Course::getCourseName));
        return results;
    }

    /**
     * Tính số tín chỉ trung bình.
     * Đầu ra:
     * - trả về số tín chỉ trung bình
     * - nếu danh sách rỗng thì trả về 0
     */
    public double calculateAverageCredits() {
        // TODO
        if (courses.isEmpty()) {
            return 0;
        }
        double totalCredit = 0.0;
        for (Course course : courses) {
            totalCredit += course.getCredits();
        }
        return totalCredit / courses.size();
    }

    /**
     * Tính tổng học phí của tất cả môn học.
     * Đầu ra: tổng học phí
     */
    public double calculateTotalTuitionFee() {
        // TODO
        double totalTuitionFee = 0.0;
        for (Course course : courses) {
            totalTuitionFee += course.calculateTeachingCost();
        }
        return totalTuitionFee;
    }
}