public class Secondex implements Firstex {
    public void disp(){
        System.out.println("The variabe values is:: "+a);
    }
    public static void main(String[] args) {
        Secondex se = new Secondex();
        se.disp();
    }
}
