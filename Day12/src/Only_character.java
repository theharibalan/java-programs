import java.io.PrintStream;
import java.util.Scanner;

public class Only_character {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the string to convert only character: ");
        String s1 = inp.next();
        char result;
        for (int i = 0; i < s1.length(); i++) {
//            for (char j = 'a'; j <='z' ; j++) {
//                if(s1.charAt(i) == j){
//                    System.out.print(j);
//                }
//            }

            // Also we can solve this using ASCII character
            if(s1.charAt(i) >=65 && s1.charAt(i) <=122){
//                result = (char) i;
                System.out.print((char) i);
            }
        }
    }
}