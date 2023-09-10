package Firstex;

public class Subex {
    int a = 1;
     public void disp(){
         // its the problem if we declare the method as defaulr like void disp() :
         // Error: java: disp() is not public in Firstex.Subex; cannot be accessed from outside package
        System.out.println("The value of a is: "+a);
    }
}
