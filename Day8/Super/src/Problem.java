//Problem here is
//1. Same method name in both parent and child, it cant able to access the parent

//3 - here is the best practice to write the inheritance part
    class Parent{
        public void Method1(){
            System.out.println("Hi i am parent class");
        }
    }
    class Child extends Parent{
        public void Method1(){
            System.out.println("Hi i am child class");
        }
    }
 public class Problem {
    public static void main(String[] args) {
        Child c = new Child();
        c.Method1();
    }
}

//Checkout solution.java for understanding