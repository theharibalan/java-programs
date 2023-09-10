import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate_second_half_of_array {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        int n = inp.nextInt();
        int[] arr = new int[n];


//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = inp.nextInt();
//        }
//
//        int rot = inp.nextInt();
//        ArrayList<Integer> al1 = new ArrayList<>();
//
//        int mid = arr.length/2;
//        int[] newarr = new int[mid+1];
//        for(int r = mid, k=0; r< arr.length; r++){
//            newarr[k] = arr[r];
//            al1.add(newarr[k]);
//            k++;
//        }
//
//        //now rotate the array with the list
//        int times = rot%al1.size();
//        for(int i=0; i<rot ; i++){
//            int last = al1.get(al1.size()-1);
//            al1.add(0,last);
//            al1.remove(al1.size()-1);
//        }
//        for (int i = 0; i < mid; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        for (int i:al1) {
//            System.out.print(i+" ");
//        }


        // Feasible Solution
            for(int i=0; i<n; i++){
            al.add(inp.nextInt());
        }
            int val = inp.nextInt();
           int rot = 1;
        int mid = al.size() / 2;
        for (int i = 0; i < rot; i++) {
            int last = al.get(al.size()-1);
            al.add(mid,last);
            al.remove(al.size()-1);
        }
        System.out.println(al);

    }
}
