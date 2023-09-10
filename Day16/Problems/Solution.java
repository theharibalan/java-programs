import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int i = 1;
        int sum = 0;
        boolean flag = true;
        while(flag){
            sum = i+sum;
            i++;
            if(sum == n){
                System.out.println("Triangular Number");
                System.out.println(sum);
                flag = false;
            }
            if(n>sum){
                System.out.println("Not a Triangular Number");
                System.out.println(sum);
                flag = false;
            }
        }
    }
}