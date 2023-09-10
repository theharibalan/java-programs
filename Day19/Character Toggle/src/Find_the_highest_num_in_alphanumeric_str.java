import java.util.ArrayList;
import java.util.Scanner;

public class Find_the_highest_num_in_alphanumeric_str {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        ArrayList<Integer> al = new ArrayList<>();
        s+="#";

        String str = "0";
        int[] arr = new int[s.length()];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                str += c;
            }
           else{

               int d=Integer.parseInt(str);
               if(max < d){
                   max = d;
               }
               str = "0";
                al.add(d);
            }
        }
//        System.out.println(max);
        int ans = 0;
        for(int i:al){
            ans+=i;
        }
        System.out.println(ans);
    }
}
