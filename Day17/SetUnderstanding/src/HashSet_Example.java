import java.util.HashSet;

public class HashSet_Example {
    public static void main(String[] args) {
        HashSet <String> hs =  new HashSet<>();

        //it won't allow duplicate
        hs.add("Apple");
        hs.add("Cat");
        hs.add("Banana");
        hs.add("Mango");
        System.out.println(hs);

        // It allow null values
        hs.add(null);
        System.out.println(hs);
     }
}
