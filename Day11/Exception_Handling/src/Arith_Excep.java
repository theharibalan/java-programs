// Exceptions are the unexpected event that distrub the normal flow of execution the main objective of exception
// handling to terminate the program gracefully
public class Arith_Excep {
    public static void main(String[] args) {
        try{
            int a = 100 / 0;
            System.out.println(a);
        }
        catch (Exception h){
            System.out.println(h); // System provided exception and it handled it
//            h.printStackTrace();
            //java.lang.ArithmeticException: / by zero at Arith_Excep.main(Arith_Excep.java:4)
        }
    }
}
