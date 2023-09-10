public class ThisMethodEx {
    public void disp(int x){
        System.out.println("Hello disp");
        System.out.println(x);
    }
    public void show(){
        System.out.println("Hi show");
        this.disp(2);
    }
    public static void main(String[] args) {
        ThisMethodEx m1 = new ThisMethodEx();
//        m1.disp();
        m1.show();
    }
}