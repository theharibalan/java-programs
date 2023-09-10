import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Shuffle_Example {
    public static void main(String[] args) {
        Set t = new HashSet();
        Set h = new TreeSet();
        t.add("oppo");
        t.add("3");
        t.add("apple");
        h.addAll(t);
        System.out.println("TreeSet");
        System.out.println(t);
        System.out.println("HasSet");
        System.out.println(h);
    }
}
