import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(5, "Five");
        m.put(8, "Eight");
        m.put(6, "Six");
        m.put(4, "Four");
        m.put(2, "Two");

// Retrieving
        System.out.println(m.get(6));

// Lambda forEach
        m.forEach((key, value) -> {
            String msg = key + ": " + value;
            System.out.println(msg);;
        });
        System.out.println(m.containsKey(5));
        System.out.println(m.containsValue("Ten"));

    }
}
