import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Unique_digit_of_ele_in_List {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        ArrayList <Integer> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            al.add(inp.nextInt());
        }
        System.out.println(al);

        int rem = 0;
        int num = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i:al) {
            num = i;
            while (num > 0){
                rem = num%10;
                hs.add(rem);
                num/=10;
            }
            System.out.println("al "+al.size());
            System.out.println("hs "+hs.size());
            hs.clear();
        }
//        System.out.println(hs);


    }
}
