import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;

public class Sort_descending_array {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,7};
        System.out.println(Arrays.toString(descending(arr)));
    }
    static int[] descending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
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
