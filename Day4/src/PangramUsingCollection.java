import java.util.*;

public class PangramUsingCollection {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine().toLowerCase().trim();
        String str = s.replaceAll("\\s", "");
        Set<Character> st = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }
        System.out.println(st);
    }
}
