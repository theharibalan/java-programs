import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashMap <String, Character> hm = new HashMap<>();
        System.out.print("Enter how many key value pairs you want to insert: ");
        int n = inp.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the key and value ");
            hm.put(inp.next(), inp.next().charAt(i));
        }
        System.out.println(hm);

//        for (String i:hm.keySet()) {
//            System.out.println(i + "--------"+hm.get(i));
//        }
    }
}