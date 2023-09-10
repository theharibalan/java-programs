import java.util.Scanner;

public class Palindrome_Using_model4 {
    public static void main(String args[]){
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        Palindrome_Using_model4 p1 = new Palindrome_Using_model4();
        int ans = p1.isPalindrome(num);
        System.out.println(ans==num?"Palindrome":"Not a Palindrome");
    }

     int isPalindrome(int n){
        int r, t=0, m;
        m = n;
        while(n>0){
            r = n%10;
            t = (t*10)+r;
            n = n/10;
        }
        return t;
    }
}
