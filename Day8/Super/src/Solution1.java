//Solution:1
//1. Create Heirachical inheritance

class Parent1{
    public void m1(){
        System.out.println("This is Parent");
    }
}

class Child1 extends Parent1{
    public void m2(){
        System.out.println("This is Child1");
    }
}

class Child2 extends Parent1{
    public void m3(){
        System.out.println("This is Child2");
    }
}

class Child3 extends Parent1{
    public void m4(){
        System.out.println("This is Child3");
    }
}



public class Solution1 {
    public static void main(String[] args) {
        Child3 c3 = new Child3();
        c3.m4(); //It can access it self
        c3.m1(); // accessing parent method
    }
}
