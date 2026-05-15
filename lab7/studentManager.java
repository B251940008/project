package lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studentManager {
	private List<Student> students; 
	public studentManager() { 
	    students = new ArrayList<>();
	}
	    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Оюутан амжилттай нэмэгдлээ.");
    }

    public void removeStudent(String studentId) {
        Student s = findStudent(studentId);
        if (s != null) {
            students.remove(s);
            System.out.println("Оюутан устгагдлаа.");
        } else {
            System.out.println("Ийм ID-тай оюутан олдсонгүй.");
        }
    }

    public Student findStudent(String studentId) {
        for (Student s : students) {
            if (s.getstudentId().equals(studentId)) {
                return s;
            }
        }
        return null;
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Жагсаалт хоосон байна.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Нэрээр амжилттай эрэмбэлэгдлээ.");
    }
}