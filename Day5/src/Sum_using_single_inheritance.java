class val1{
    int a = 10;
//    int one(){
//        return a;
//    }
}
class val2 extends val1{
    int b = 20,c;
//    public int two(){
//        return b;
//    }
    void print(){
        c = a+b;
        System.out.println(c);
    }
}
public class Sum_using_single_inheritance {
    public static void main(String[] args) {
        val2 s1 = new val2();
        s1.print();
//        int c = s1.a + s1.b;
//        System.out.println("The sum is: "+ c);
    }
}
