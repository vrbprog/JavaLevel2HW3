import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] s = {"Home","Car","Man","Shop","Color",
                      "River", "Cloud","Garden","Car",
                      "Color","Home","Car","Shop","Man",
                      "Man", "Dog", "Cat", "Car", "River"};

        Map<String,Integer> dict = new HashMap<>();
        for (String word: s) {
            dict.put(word, dict.getOrDefault(word,0) + 1);
        }
        dict.forEach((w, n) ->{
            System.out.printf("%s - %d times\n\r",w,n);
        });

        System.out.println(" ");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.writeNumber("Sidorov","+380993451252");
        phoneBook.writeNumber("Ivanov", "+380671491552");
        phoneBook.writeNumber("Petrov", "+380665237559");
        phoneBook.writeNumber("Sidorov","+380637251284");

        phoneBook.getPhoneNumber("Sidorov");
    }
}
