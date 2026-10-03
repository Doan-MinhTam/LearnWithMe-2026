package hus.oop.studentmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager{
    // Singleton pattern
    private static StudentManager instance;

    private List<Student> studentList;

    private StudentManager() {
        /* TODO */
        studentList = new ArrayList<>();
    }

    public static StudentManager getInstance() {
        /* TODO */
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
    }

    public List<Student> getStudentList() {
        /* TODO */
        return studentList;
    }

    /**
     * Thêm sinh viên vào cuối danh sách.
     *
     * @param student
     */
    public void append(Student student) {
        /* TODO */
        studentList.add(student);
    }

    /**
     * Thêm sinh viên vào danh sách ở vị trí index.
     *
     * @param student
     * @param index
     */
    public void add(Student student, int index) {
        /* TODO */
        studentList.add(index, student);
    }

    /**
     * Bỏ sinh viên ở vị trí index.
     *
     * @param index
     */
    public void remove(int index) {
        /* TODO */
        studentList.remove(index);
    }

    /**
     * Bỏ sinh viên như tham số truyền vào.
     * @param student
     */
    public void remove(Student student) {
        /* TODO */
        studentList.remove(student);
    }

    /**
     * Lấy ra sinh viên ở vị trí index
     * @param index
     * @return
     */
    public Student studentAt(int index) {
        /* TODO */
        return studentList.get(index);
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự tăng dần theo tên,
     * nếu tên như nhau thì sắp xếp theo họ.
     * Sử dụng giao diện StudentComparable để sắp xếp.
     * @return
     */
    public List<Student> sortStudentByName() {
        /* TODO */
        List<Student> result = new ArrayList<>(studentList);
        return result;


    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeIncreasing() {
        /* TODO */
        StudentComparator comparator = (left, right) -> Double.compare(left.getMathsGrade(), right.getMathsGrade());
        List<Student> result = new ArrayList<>(studentList);
        result.sort(comparator::compare);
        return result;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm toán giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortMathsGradeDecreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeIncreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm lý giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortPhysicsGradeDecreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeIncreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm hóa giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortChemistryGradeDecreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình tăng dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeIncreasing() {
        /* TODO */
        return null;
    }

    /**
     * Sắp xếp danh sách sinh viên theo thứ tự điểm trung bình giảm dần.
     * Sử dụng giao diện StudentComparator để sắp xếp.
     * @return
     */
    public List<Student> sortAverageGradeDecreasing() {
        /* TODO */
        return null;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình cao nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsHighestAverageGrade(int howMany) {
        /* TODO */
        return null;
    }

    /**
     * Lọc ra howMany sinh viên có điểm trung bình thấp nhất.
     * @param howMany
     * @return
     */
    public List<Student> filterStudentsLowestAverageGrade(int howMany) {
        /* TODO */
        return null;
    }

    public static String idOfStudentsToString(List<Student> countryList) {
        StringBuilder idOfStudents = new StringBuilder();
        idOfStudents.append("[");
        for (Student country : countryList) {
            idOfStudents.append(country.getId()).append(" ");
        }
        return idOfStudents.toString().trim() + "]";
    }

    public static void print(List<Student> studentList) {
        StringBuilder studentsString = new StringBuilder();
        studentsString.append("[\n");
        for (Student student : studentList) {
            studentsString.append(student.toString()).append("\n");
        }
        System.out.print(studentsString.toString().trim() + "\n]");
    }

}
