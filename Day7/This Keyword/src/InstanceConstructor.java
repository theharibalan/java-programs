public class InstanceConstructor {
    int id;
    String name;
    float numb;

    InstanceConstructor(int id, String name, float numb){
        this.id = id;
        this.name = name;
        this.numb = numb;
    }

    String add;
    InstanceConstructor(int id, String name, float numb, String add){
        this(id, name, numb); // all to 'this()' must be first statement in constructor body(constructor)
        this.add = add;
//        this(id, name, numb); // it shows compile time error
    }

}

class Run{
    public static void main(String[] args) {
        InstanceConstructor ic = new InstanceConstructor(21, "Hari", 123456.0f, "krishnapuram");
        System.out.println(ic.id+" "+ic.name+" "+ic.numb+" "+ic.add);
    }
}
