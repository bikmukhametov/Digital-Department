import java.util.List;
import java.util.Comparator;

public class UserOperations {

    public static void sortUsersByLastName(List<User> users) {
        users.sort(Comparator.comparing(User::getLastName));
        System.out.println("Отсортированный список по фамилии:");
        users.forEach(System.out::println);
    }

    public static void sortUsersByAge(List<User> users) {
        users.sort(Comparator.comparing(User::getAge));
        System.out.println("Отсортированный список по возрасту:");
        users.forEach(System.out::println);
    }

    public static boolean checkAge(List<User> users) {
        for(User user : users){
            if (user.getAge() <= 7){
                return false;
            }
        }
        return true;
    }

    public static double calculateAverageAge(List<User> users) {
        int sum = 0;
        int count = 0;
        int avg = 0;
        for(User user : users){
            sum += user.getAge();
            count += 1;
        }
        if(count != 0){
            avg = sum / count;
        }
        return avg;
    }

    public static long countDistinctCountries(List<User> users) {
        return users.stream().map(User::getCountry).distinct().count();
    }
}