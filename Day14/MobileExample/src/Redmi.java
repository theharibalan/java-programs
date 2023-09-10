public class Redmi implements MobilePhone {
    public static void main(String[] args) {
        Redmi m = new Redmi();
        m.camera();
        m.display();
    }
    public void camera(){
        System.out.println("I have 64MP camera with sony sensor");
    }
    public void display(){
        System.out.println("I have a display of Omled Display");
    }
}