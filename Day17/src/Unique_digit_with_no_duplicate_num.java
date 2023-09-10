import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Unique_digit_with_no_duplicate_num {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        //input through array list
        for (int i = 0; i < size; i++) {
            al.add(inp.nextInt());
        }

        //iteration through for each
        HashSet<Integer> hs = new HashSet<>();
        for (int i:al) {
            int rem = 0;
            int count = 0;
            int num = i;
            while(num>0){
                rem = num%10;
                hs.add(rem);
                count++;
                num/=10;
            }
            if(count == hs.size()){
                System.out.print(i+" ");
            }
            hs.clear();
        }

    }
}
