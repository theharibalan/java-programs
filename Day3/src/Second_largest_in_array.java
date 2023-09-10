import java.util.Arrays;

public class Second_largest_in_array {
        public static void main(String[] args) {
            int[] arr = {22,98,45,67,87};
            System.out.println(Arrays.toString(ascending(arr)));
            System.out.println("The Second largest element in the array is: "+arr[arr.length-2]);
        }
        static int[] ascending(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]){
                        swap(arr, i, j);
                    }
                }
            }
            return arr;
        }
        static void swap(int[]arr, int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
}
