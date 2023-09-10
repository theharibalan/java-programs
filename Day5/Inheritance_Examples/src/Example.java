class C extends B {
    int z = 40;
}

public class Example {
    public static void main(String[] args)
    {
        B b = new B();
//        System.out.println(b.x);

        A a = new C();
//        System.out.println(a.x);

        C c1 = new C();
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);

        B a2 = new C();
        System.out.println(a2.x);
    }
}

