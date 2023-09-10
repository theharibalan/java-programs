import java.util.Scanner;

public class even_ele_array {
        public static void main(String[] args){
            Scanner inp = new Scanner(System.in);
            System.out.print("Enter the size of the Array: ");
            int n = inp.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = inp.nextInt();
            }
            printEven(arr);
        }
    static void printEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                System.out.println("Even Element presented in the array is "+arr[i]);
            }
        }
    }
}
