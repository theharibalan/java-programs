package accwWithdrawl;
import java.util.Scanner;
import static accOpen.openacc.amt;

public class withD {
    float Withdrawl;
    public void m2(){
        System.out.print("Enter your Withdrawl amount: ");
        Scanner inp = new Scanner(System.in);
        float wd = inp.nextFloat();
        if(wd > amt){
            System.out.println("Insufficient balance check your withdrawl amount and try again");
        }
        Withdrawl = amt - wd;
        System.out.println("After withdrawl the balance id: "+Withdrawl);
    }
}
