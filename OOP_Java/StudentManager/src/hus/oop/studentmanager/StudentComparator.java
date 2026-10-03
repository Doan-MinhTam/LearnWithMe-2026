package hus.oop.studentmanager;
@FunctionalInterface
public interface StudentComparator {
    int compare(Student left, Student right);
}
