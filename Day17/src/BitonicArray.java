import java.util.Scanner;

public class BitonicArray {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = in.nextInt();
//        }

         int[] arr = {10,20,30,70,80};
        boolean Bitonic=true;

        if(Bitonic == isBitonic(arr)){
            System.out.println( "Bitonic");
        }
        else{
            System.out.println("Not Bitonic");

        }
    }

    public static boolean isBitonic(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;  // Bitonic array must have at least 3 elements
        }
        int i = 1;
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }

        return i == n;
    }
}
