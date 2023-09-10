import java.util.Scanner;

public class Hotel_Using_bool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("You want chicken Briyani(True/False):  ");
        boolean s1 = in.nextBoolean();
        System.out.print("You want mutton Briyani(True/False):  ");
        boolean s2 = in.nextBoolean();

        System.out.print("You want Coke (True/False) :  ");
        boolean s3 = in.nextBoolean();
        System.out.print("You want Juice (True/False) :  ");
        boolean s4 = in.nextBoolean();


        System.out.print("You want any Dry item :  ");
        boolean s5 = in.nextBoolean();

        choose(s1,s2,s3,s4,s5);
    }
    public static void choose(boolean a, boolean b, boolean c,boolean d, boolean e){
        if(a && c && e){
            System.out.println("You got 10% discount");
        }
        else if(b && d && e){
            System.out.println("You got 20% discount");
        }
        else {
            System.out.println("Sorry you don't have any discounts now better try this combinations of (ChickenBriyani  +Coke + Dryitem) or (MuttonBriyani  +Juice + Dryitem)");
        }
    }
}
