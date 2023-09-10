package com.library;
import com.account.login.accLogin;
import com.book.display.bookDetails;
import com.borrowbook.Borrow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        while (true){
            System.out.println("------Welcome to Hariee's Library-------");
            System.out.println("1. Login to your account");
//            System.out.println("2. Show Book Details");
            System.out.println("2. Exit");
            int choice = inp.nextInt();
            if(choice == 1) {
                System.out.println("<<<<----------LogIn----------->>>>>");
                System.out.print("Enter your username: ");
                String username = inp.next();
                System.out.print("Enter your password: ");
                String password = inp.next();
                accLogin al = new accLogin();
                al.login(username,password);
            }
//                else if(choice == 2){
//                    bookDetails bd = new bookDetails("Rich dad poor Dad","Robert T. Kiyosaki");
//                    bookDetails bd1 = new bookDetails("War and Peace","Leo Tolstoy");
//                    bookDetails bd2 = new bookDetails("Apple Cart","Arms and the Man");
//                    bookDetails bd3 = new bookDetails("Man and Superman","George Bernard Shaw");
//                    bookDetails bd4 = new bookDetails("The Power of Positive Thinking","Norman  Vincent Peale");
//
//                Borrow b = new Borrow();
//                b.fineAmount();
//
//                }
                else if(choice == 2){
                    break;
                }
                else {
                    System.out.println("invalid Input Try agian another input");
                }
            }

        }

    }
