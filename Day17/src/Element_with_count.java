import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Element_with_count {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        ArrayList <Integer> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            al.add(inp.nextInt());
        }
        TreeSet<Integer> hs = new TreeSet<>();
        hs.addAll(al);

        // actual condition
//        for (int i = 0; i < al.size(); i++) {
//            for (int j = 0; j < al; j++) {
//
//            }
        for(int i:hs){
            int count = 0;
            for(int j:al){
                if(i==j){
                    count++;
                }
            }
            System.out.println(i+" : "+count);
        }
    }
}
