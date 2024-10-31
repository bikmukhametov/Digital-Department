import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Иван", "Иванов", 25, "Россия"));
        users.add(new User(2, "Петр", "Петров", 30, "Украина"));
        users.add(new User(3, "Сергей", "Сидоров", 28, "Россия"));
        users.add(new User(4, "Анна", "Александрова", 22, "Беларусь"));
        users.add(new User(5, "Елена", "Емельянова", 35, "Россия"));

        UserOperations.sortUsersByLastName(users);
        System.out.println("-------------------------");
        UserOperations.sortUsersByAge(users);
        System.out.println("-------------------------");
        System.out.println("Все пользователи старше 7 лет: " + UserOperations.checkAge(users));
        System.out.println("-------------------------");
        System.out.println("Средний возраст пользователей: " + UserOperations.calculateAverageAge(users));
        System.out.println("-------------------------");
        System.out.println("Количество разных стран: " + UserOperations.countDistinctCountries(users));
    }
}
