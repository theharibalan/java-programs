package com.borrowbook;

import java.util.Scanner;

public class Borrow {
    int noOfBooks = 2;
    int noOfResevedBooks = 5;
    double fineAmount = 350;


    public void fineAmount(){
        System.out.println("Number of Books you have: "+this.noOfBooks);
        System.out.println("Number of reserved Books: "+this.noOfResevedBooks);
        System.out.println("Fine amount till now: "+this.fineAmount);
        Scanner ent = new Scanner(System.in);
        System.out.print("Enter the fine amount you whish to pay now: ");
        float fine = ent.nextFloat();
        fineAmount -= fine;
        System.out.println("Remaining Fine Amount is: "+fineAmount);


    }

}
