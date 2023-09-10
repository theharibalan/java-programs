package com.account.login;
import com.book.display.bookDetails;
import com.borrowbook.Borrow;
import com.library.Main;

import java.util.Scanner;

public class accLogin {
    String username = "haribalans";
    String password = "hari@123";
    Scanner inp = new Scanner(System.in);
    public void login(String username, String password){
                if(username.equals(username) && password.equals(password)){
                    System.out.println("<<<----------------Successfully Logged In--------------------->>>");
                    while (true){
                        System.out.println("1. Home");
                        System.out.println("2. Show Book Details");
                        System.out.println("3. Account Details");
                        int choice = inp.nextInt();
                        if(choice == 1){
                            break;
                        }
                        else if(choice == 2){
                            bookDetails bd = new bookDetails("Rich dad poor Dad","Robert T. Kiyosaki");
                            bookDetails bd1 = new bookDetails("War and Peace","Leo Tolstoy");
                            bookDetails bd2 = new bookDetails("Apple Cart","Arms and the Man");
                            bookDetails bd3 = new bookDetails("Man and Superman","George Bernard Shaw");
                            bookDetails bd4 = new bookDetails("The Power of Positive Thinking","Norman  Vincent Peale");
                        }
                        else if(choice == 3){
                            Borrow b = new Borrow();
                            b.fineAmount();
                        }
                    }
                }

            }

        }
