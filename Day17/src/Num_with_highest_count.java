import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Num_with_highest_count {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            al.add(inp.nextInt());
        }
        HashSet<Integer> hs = new HashSet<>();
        hs.addAll(al);

        int max = 0;
        int val = 0;
        for(int i:hs){
            int count = 0;
            for(int j:al){
                if(i==j){
                    count++;
                }
                if(max < count){
                    max = count;
                    val = i;
                }
            }
//            System.out.println(i+" : "+count);
        }
        System.out.println("Highest count of the value is "+val);
    }
    }
