class Collegename{
    String name = "pkr";

}
class Staffname extends Collegename{
    String name1 = "vani";
}
class Student extends Staffname{
    String name2 = "rajesh";
    void print(){
        System.out.println("Hi I am "+name2+" my staff name is "+name1+" and I belongs to "+name+" college");
    }
}


public class Multilevel_inheritance {
    public static void main(String[] args) {
        Student c1 = new Student();
        c1.print();
    }
}
