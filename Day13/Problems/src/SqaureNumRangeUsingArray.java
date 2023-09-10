import java.util.Scanner;

public class SqaureNumRangeUsingArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        if(n>=1000000){
            System.out.println("Wrong Input");
        }
        for(int i=n; i>=1; i--){
            System.out.print(i*i);
        }

//        int[] arr1 = {1,2,3,4,5};
//        for (int i = arr1.length; i >=1 ; i--) {
//            System.out.print(i);
//
//        }

    }
}
