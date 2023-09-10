public class Samsung implements MobilePhone {
    public static void main(String[] args) {
       Samsung m = new Samsung();
       m.camera();
       m.display();
    }
    public void camera(){
        System.out.println("I have 32MP camera with sony sensor");
    }
    public void display(){
        System.out.println("I have a display of fullHd");
    }
}