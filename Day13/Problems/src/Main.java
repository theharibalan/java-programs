import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = inp.nextInt();
        int square = 0;
        int result = 0;
        // It will conc
//        for(int i=n;i>=1;i--){
//            square = i*i;
//            result = Integer.parseInt(result+""+square);
//        }
//        System.out.println(result);

        int rem = 0;
        while(n>0){
            rem = n%10;
            System.out.print(rem*rem);
            n = n/10;
        }
    }
}