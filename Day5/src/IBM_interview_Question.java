import java.util.Scanner;

public class IBM_interview_Question {
    public static void main(String[] args) {
        // reverse a number if 0 in the last of the reversed of a number then we must remove them
        Scanner inp = new Scanner(System.in);
        int num  = inp.nextInt();

        // 16bit signer integer
        if(num>=-32768 && num<=32767){
            int rem, sum=0;
            for (int i = num; i > 0; i=i/10) {
                rem = i%10;
                sum = sum*10 + rem;
            }
            System.out.println(sum);
        }


    }
}
