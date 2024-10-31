import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иван Иванов", "ИВТ-21", 1, new HashMap<>() {{
            put("Математика", 4);
            put("Физика", 3);
            put("Программирование", 5);
        }}));
        students.add(new Student("Петр Петров", "ИВТ-21", 2, new HashMap<>() {{
            put("Алгебра", 2);
            put("Геометрия", 3);
            put("История", 4);
        }}));
        students.add(new Student("Мария Сидорова", "ИВТ-22", 1, new HashMap<>() {{
            put("Математика", 5);
            put("Физика", 5);
            put("Программирование", 4);
        }}));


        System.out.println("Список студентов:");
        StudentManagement.printStudents(students);

        // Удаляем студентов со средним баллом < 3 и переводим остальных на следующий курс
        students = StudentManagement.manageStudents(students);

        System.out.println("\nОбновленный список студентов:");
        StudentManagement.printStudents(students);

        // Выводим студентов, обучающихся на 2 курсе
        System.out.println("\nСтуденты на 2 курсе:");
        StudentManagement.printStudents(students, 2);
    }
}