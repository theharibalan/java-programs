import java.util.Scanner;

public class Add_the_only_number_in_String {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();

//        String s = "123";
//        System.out.println(Integer.parseInt(s));

        int sum = 0;
        int alpha = 0;
        int digit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // only alpha
            if (Character.isAlphabetic(c)) {
                alpha++;
            } else if (Character.isDigit(c)) {
                sum = sum + Integer.parseInt(c + ""); // you can also replace -> String.valueOf(c)
                digit++;
            }
            else{
                System.out.println("");
            }
        }

        if (s.length() == digit || s.length() == alpha) {
            System.out.println(s);
        }  else {
            System.out.println("The Alpha numeric value of the String is: " + sum);
        }
    }
}
