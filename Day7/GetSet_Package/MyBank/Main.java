package MyBank;

import com.get.set.Get_and_Set;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        // Creating Object for class
        Get_and_Set gs = new Get_and_Set();

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        gs.setName(inp.next()); // It will set the value for setName() method
        System.out.println("The name that are getted is: "+gs.getName());
        // Here the value is retrived using the getName() method

        System.out.print("Enter Your Account No: ");
        gs.setAccno(inp.nextInt());
        System.out.println("The Account no is: "+gs.getAccno());

        System.out.print("Enter Your Password: ");
        gs.setPwd(inp.next());
        System.out.println("The Passsword is: "+gs.getPwd());

    }
}
