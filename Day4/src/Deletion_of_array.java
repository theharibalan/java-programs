import java.util.*;


public class Deletion_of_array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int ar[]=new int[num+1];
        for(int i=0;i<num;i++){
            ar[i]=sc.nextInt();
        }
        int num1=sc.nextInt();
        int po=sc.nextInt();
        for(int i=num-1;i>=(po-1);i--){
            ar[i+1]=ar[i];
        }
        ar[po-1]=num1;
//        for(int i=0;i<ar.length;i++){
//            System.out.print(ar[i]+" ");
//        }
        System.out.print(Arrays.toString(ar));
    }

}