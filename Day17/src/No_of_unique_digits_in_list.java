import java.util.HashSet;

public class No_of_unique_digits_in_list {
    public static void main(String[] args) {
        HashSet <Integer> hs = new HashSet<>();
        System.out.println("It prints unique and in a sorted way");
        hs.add(3);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(5);
        hs.add(3);
        System.out.println(hs);
        System.out.println("Unique digits in the list is: "+hs.size());
//        for (int i = 0; i < hs.size(); i++) {
//            System.out.print(hs+" ");
//        }
    }
}
