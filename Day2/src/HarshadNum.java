import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int n = inp.nextInt();
        int r, t=0;
        int n;
        for (int i = 1; i <=100; i++) {
            n = i;
            int m = n;
            while (n>0){
                r = n%10;
                t +=r;
                n = n/10;
            }
            System.out.println(m%t==0?i+" harshad Number":i+" No its not a harshad Number");
            t=0;
        }
        }

}