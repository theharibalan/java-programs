import java.util.Arrays;
import java.util.Scanner;

public class Swap_the_two_pos_in_number {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int pos = inp.nextInt();
        int pos1 = inp.nextInt();
//        int num = 12345;
        int digits = (int) (Math.log10(num) + 1);
//        System.out.println(digits);
        int[] arr = new int[digits];

        int i=0;
        int rem= 0;
        while (num>0){
            rem = num%10;
            arr[i++] = rem;
            num/=10;
        }

//        System.out.println(Arrays.toString(arr));

//        int pos = 3;
//        int pos1 = 5;
        int temp = arr[pos-1];
        arr[pos-1] = arr[pos1-1];
        arr[pos1-1] = temp;

//        System.out.println(Arrays.toString(arr));

        for (int j = arr.length-1; j>=0 ; j--) {
            System.out.print(arr[j]);
        }

    }

}
