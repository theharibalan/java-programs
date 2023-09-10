import java.util.Scanner;

class InsufficientFundException extends RuntimeException{
    InsufficientFundException(String message){
        System.out.println(message);
    }
}
public class Main {
    private static double balance = 1000.00;
    public static void withdrawAmount(double  amount){
        if(amount > balance){
            System.out.println("Sorry");
            throw new InsufficientFundException("You have entered amount greater than available balance");
        }
        else {
            System.out.println("Processing");
            System.out.println("Take your cash");
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome Please enter the amount to withdraw");
        double rupees = inp.nextDouble();
        Main.withdrawAmount(rupees);
    }
}