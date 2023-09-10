import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = inp.nextInt();
        }
        int pos = inp.nextInt();
        int[] newarr = new int[n-1];

        int count = 0;
            for(int i=0; i<arr.length;i++){
                if(arr[i] == pos){
                    count = 1;
                    continue;
                }
                newarr[i] = arr[i];
//                System.out.print(arr[i]+" ");
            }
            if(count == 0){
                System.out.println("Deletion");
            }
            else{
                System.out.println(Arrays.toString(newarr));
            }
//            System.out.println(Arrays.toString(arr));
            // for(int i = pos; i<arr.length;i++){
            //     arr[i] = arr[i+1];
            //     System.out.print(arr[i]+" ");
            // }
        }
}