public class Wrapper_Class {
    public static void main(String[] args) {
        int a = 10; // primitive
        Integer b = new Integer(20); // Object

        // Auto Boxing - primitive to wrapper
        Integer d = a; //Automatic
        Integer d1 = Integer.valueOf(a); // Manual

        //Auto Unboxing - wrapper to primitive
        int d2 = b; //Automatic
        int d3 = b.intValue(); // Manual

        System.out.println("AutoBoxing is: "+d+" : "+ d1);
        System.out.println("Auto UnBoxing is: "+d2+" : "+ d3);


    }
}