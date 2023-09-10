import java.util.Scanner;

public class Armstrong_Num_btw_Range {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        Armstrong_Num_btw_Range ar = new Armstrong_Num_btw_Range();
        int ans = ar.checkArmstrong(num);
        System.out.println(ans==num?"Armstrong "+ans:"Not Armstrong"+ans);
    }
    int checkArmstrong(int num){
        int count = 0,r;
        int t=0,m=0;
        m = num;

        // count
        while(num>0){
            num=num/10;
            count++;
        }

        while(m>0){
            r = m%10;
            t = (int) (t + Math.pow(r,count));
            m = m/10;
        }
        return t;
    }
}
