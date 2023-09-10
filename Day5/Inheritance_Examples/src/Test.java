public class Test {
    public static void main(String[] args)
    {
        beta b = new beta();
        b.m2();

        alpha a = new alpha();
        a.m2();

        alpha a2 = new beta();
        a2.m2();
//        a2.m1();
        // Refer here to understand this https://www.geeksforgeeks.org/upcasting-in-java-with-examples/
        //Child c = new Child(): The use of this initialization is to access all the members present in both parent and child classes, as we are inheriting the properties.
        //Parent p = new Child(): This type of initialization is used to access only the members present in the parent class and the methods which are overridden in the child class. This is because the parent class is upcasted to the child class.
        System.out.println(a2.a);
    }
}