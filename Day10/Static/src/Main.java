public class Main {
     int x  = 10;
    public static void main(String[] args) {
         int x = 20;
        System.out.println(x);
        staticCheck();
    }
    public static void staticCheck(){
//        static int r = 20; // static varible cannot alloweded inside the block
        System.out.println("Hi i am static method");
    }

}