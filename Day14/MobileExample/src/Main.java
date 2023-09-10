public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new Samsung();
        mp.camera();
        System.out.println("---------------------------------");
        MobilePhone mp1 = new Redmi();
        mp1.camera();
        mp1.display();
    }
}
