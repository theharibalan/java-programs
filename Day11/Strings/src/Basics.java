public class Basics {

    int id;
    String name;
    public Basics(int id, String name){
        this.id = id;
        this.name = name;
    }

    //Overriding toString() Method
    public String toString(){
        return ""+this.id;
    }

    public static void main(String[] args) {
        String a = "hari";
        String b = "hari";
        System.out.println("This is nothing but a string pooling");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        System.out.println("Why Java is Immutable");
        String s = "MEC";
        String s1 = "MEC";
        String s2 = "MEC";
        String s3 = "MEC";
        String s4 = "MEC";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        System.out.println(" ------------------------------------------------------- ");
        s2 = "MIT";
        System.out.println("String is changable it remove original and pointing to a new one: "+s2.hashCode());
        String s5 = "Harsha";
        System.out.println("It has a different string and pointing to different object: "+s5.hashCode());

        System.out.println(" ------------------------------------------------------- ");
        System.out.println("toString() -  Method Understanding");
        Basics bs = new Basics(21, "Hari"); // Here if we call the object it doesn't have constructor, We need to ovrride the toString() mehod to run
        System.out.println(bs);
        String val = new String("vijayalashmi"); // In default the String class contained toString method to run so it doesn't print the hashCode
        System.out.println(val);

    }
}
