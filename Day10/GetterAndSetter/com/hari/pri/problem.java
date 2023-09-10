package com.hari.pri;

class One{
    private int a = 10;
    private void disp(){
        System.out.println("Private variable value is: "+a);
    }
}

public class problem {
    public static void main(String[] args) {
        One o = new One();
//        o.a;
        /* o.disp(); // Cannot be accessed coz: disp() has private access in com.hari.pri.One */
//        If you make any class constructor private, you cannot create the instance of that class from outside the class. For example:
    }
}
