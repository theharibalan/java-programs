interface A2{
    void m1();
    void m2();
    void m3();
    //....
    void m100();
}

//Adapter class
class MyAdapter implements A2{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void m3() {

    }

    @Override
    public void m100() {

    }

}
public class AdaptorClassExample {
    public void m3(){
        System.out.println("m3 method implementation");
    }

    public static void main(String[] args) {

    }
}
