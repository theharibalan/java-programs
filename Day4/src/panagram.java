import java.io.*;
import java.util.*;


public class panagram {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
//        String word = "aribalan";
        int count = 0;
        int result = 0;
        String z = word.toUpperCase();
            for (char i = 65; i <= 90; i++) {
                for (int k = 0; k < z.length(); k++) {
                    if (z.charAt(k) == i) {
                        count++;
                        if(count==1){
                            result++;
                        }
                    }
            }
        }
//        System.out.println(word.length());
        System.out.println(count);
        if (count == 26) {
            System.out.println("Pangrams");
        } else {
            System.out.println("Not Pangrams");
        }
    }
}