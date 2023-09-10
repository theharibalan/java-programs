import java.util.Scanner;

public class Date_validation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int m = in.nextInt();
        int y = in.nextInt();
        System.out.println(check(d,m,y));
    }
    static String check(int d, int m, int y){
        if(y>1900 && y<2000){
            return "Valid";
        }
        return "Invalid";
    }
}