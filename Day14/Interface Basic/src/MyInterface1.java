interface MyInterface{
    public abstract void m1();
    public default void m2(){
        System.out.println("This is default method");
    }
     default void main(){
        System.out.println("I am private meyho");
    }
//    In Java 9, we can create private methods inside an interface. Interface allows us to declare private methods that help to share common code between non-abstract methods.
//    private void saySomething() {
//        System.out.println("Hello... I'm private method");
//    }
}
public class MyInterface1 implements MyInterface {

    @Override
    public void m1() {

    }
}
