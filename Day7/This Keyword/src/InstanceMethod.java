public class InstanceMethod {
    void disp() {
        System.out.println("I am display method");
    }

    void run() {
//        this.disp();
        System.out.println("I am run method and can extract the disp method using this");
        this.disp();
        System.out.println("Hai");
//        this.run(); // run and exceed once over the memory and shows - Exception in thread "main" java.lang.StackOverflowError
    }

}
class Main{
    public static void main(String[] args) {
        InstanceMethod im = new InstanceMethod();
        im.run();
    }
}
