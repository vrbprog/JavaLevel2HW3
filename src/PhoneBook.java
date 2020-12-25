import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> book = new HashMap<>();

    public void writeNumber(String name, String phone){
        List<String> list = book.getOrDefault(name, new ArrayList<>());
        list.add(phone);
        book.put(name, list);
    }

    public void getPhoneNumber(String name){
        System.out.println(name + ":" + book.get(name));
    }
}
