import java.util.Arrays;

public class Array_reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(reverse(arr)));
        System.out.println(Arrays.toString(arr));

    }

//            1. Using simple swapping methodologu

    static int[] reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = j;
        }
        return arr;
    }

    //       2. run for loop from array length to 1
//      static void reverse(int[] arr){
//          for(int i = arr.length - 1; i >= 0; i--) {
//              System.out.print(arr[i] + " ");
//          }
//      }



//       Note:  Your mistake in approach hari

//    static  int[] reverse(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length-1; j++) {
//                if(arr[i] < arr[j]) {
//                    swap(arr, arr[i], arr[j]);
//                }
//            }
//        }
//        return arr;
//    }


    static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
