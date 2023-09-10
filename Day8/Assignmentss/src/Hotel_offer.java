import java.util.Scanner;

public class Hotel_offer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Specify your dish (1. Chicken Briyani, 2. Mutton Briyani : choose btw(1/2)):  ");
        int s1 = in.nextInt();
        System.out.print("Specify your drinks (1. Coke, 2. Juice: choose btw(1/2)):  ");
        int s2 = in.nextInt();
        System.out.print("Specify if you need any dry item (1. Yes / 0. N0):   ");
        int s3 = in.nextInt();

        choose(s1,s2,s3);

    }
    static void choose(int dish, int juice, int dry_item){
        int CB = 200;
        int MB = 400;
        int COKE = 50;
        int JUICE = 30;
        int DRYITEM = 70;
        int total=0;
        float discount=0;

        // For Main dish
        if(dish == 1 ){
            total += CB;
        }
        else {
            total += MB;
        }

        // For drinks
        if(juice == 1){
            total += COKE;
        }
        else {
            total += JUICE;
        }

        // For Dry item
        if(dry_item == 1){
            total += DRYITEM;
            System.out.println("Yout total is: "+total);
            discount = total *10/100;
            System.out.println("And After discount the amount is: "+(total-discount));
        }
        else{
            System.out.println("Total is: "+total);
            discount = total *20/100;
            System.out.println("And After discount the amount is: "+(total-discount));
        }
    }
}
