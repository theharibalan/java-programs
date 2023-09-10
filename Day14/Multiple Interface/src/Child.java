public class Child implements Parent1, Parent2{
    public void disp() {
        System.out.println("Parent1 class");
    }

    public void disp1() {
        System.out.println("Parent2 class");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.disp();
        c.disp1();
    }
}
