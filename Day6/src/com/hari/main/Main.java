package com.hari.main;
// Instead of creating seperate import use * to acquire all the package from them
//For that you need to create all the class files under the sub package and the main method in the seperate package
// import com.hari.*;

import com.hari.first.NewExample;
import com.hari.second.NewExample1;

public class Main {
    public static void main(String[] args) {
        NewExample n1 = new NewExample();
        NewExample1 n2 = new NewExample1();
        int c = n1.a+n2.b;
        System.out.println("Addition of two number is "+ c);

        // Note: Within a pack two classes can be import
    }
}
