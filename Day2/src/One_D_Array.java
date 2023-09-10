import java.util.Scanner;
import java.util.Arrays;

public class One_D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // Print the inputted array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 8){
                continue;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
