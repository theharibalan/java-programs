import java.util.Arrays;
import java.util.Scanner;

public class Copy_one_array_to_another {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = inp.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println("Orginal Array: "+ Arrays.toString(arr));

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println("Copied Array: "+Arrays.toString(arr1));

    }
}
