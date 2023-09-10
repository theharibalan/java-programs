import java.util.Arrays;
import java.util.Scanner;

public class deletion_of_array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = inp.nextInt();
        }
        int val = inp.nextInt();
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                index = i;
                break;
            }
        }
//        System.out.println(index);
        if(index!=0){
            for(int i=0; i<arr.length-1;i++){
                if(i >= index){
                    arr[i] = arr[i+1];
                }
                System.out.print(arr[i]+" ");
            }
        }
        else System.out.println("Deletion not possible.");
//        System.out.println(Arrays.toString(arr));
    }
}
