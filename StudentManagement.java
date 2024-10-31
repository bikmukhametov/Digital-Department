import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    // Метод для удаления студентов со средним баллом < 3 и перевода остальных на следующий курс
    public static List<Student> manageStudents(List<Student> students) {
        List<Student> updatedStudents = new ArrayList<>();
        for (Student student : students) {
            double averageGrade = calculateAverageGrade(student.getGrades());
            if (averageGrade < 3) {
                System.out.println("Студент " + student.getName() + " отчислен.");
            } else {
                student.setCourse(student.getCourse() + 1);
                updatedStudents.add(student);
                System.out.println("Студент " + student.getName() + " переведен на " + student.getCourse() + " курс.");
            }
        }
        return updatedStudents;
    }

    // Метод для вывода списка студентов
    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Метод для вывода списка студентов на заданном курсе
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    // Метод для расчета среднего балла
    public static double calculateAverageGrade(Map<String, Integer> grades) {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Integer grade : grades.values()) {
            sum += grade;
        }
        return sum / grades.size();
    }
}