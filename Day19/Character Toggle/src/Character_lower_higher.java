import java.util.Scanner;

public class Character_lower_higher {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();


        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                System.out.print(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                System.out.print(Character.toUpperCase(c));
            }
            else{
                System.out.print("");
            }
        }

    }
}