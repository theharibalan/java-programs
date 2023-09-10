import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Unique_value_in_array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = inp.nextInt();
            hs.add(arr[i]);
        }

        System.out.println("HashSet "+hs);
        System.out.println("Array is "+Arrays.toString(arr));

        // comdition to remove duplicates
        int dup = 0;
        int count = 0;
        for (int i:hs) {

            for (int j = 0; j < arr.length; j++) {
                if(i==arr[j]){
                    count++;
                }
            }


            if(count==1){
                System.out.print(i+" ");
                dup=1;
            }
            if(dup == 0){
                System.out.println("-1");
            }
        }

    }
}
