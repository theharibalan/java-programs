import java.util.Scanner;

public class Rollno_dept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        check(num);
    }
    static void check(int num){
        if(num>=1 && num <=100) {
            if (num >= 1 && num <= 25) {
                System.out.println(num + " is Girl and belongs to CSE dept");
            } else {
                System.out.println(num + " is Boy and belongs to CSE dept");
            }

            if(num>=65 && num <=100){
                if (num >= 65 && num <= 75) {

                    System.out.println(num + " is Girl and belongs to IT dept");
                } else {
                    System.out.println(num + " is Boy belongs to IT dept");
                }
            }
        }
        else {
            System.out.println(num+" not belongs to pkr college");
        }
    }
}
