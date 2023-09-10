class College{
    int id;
    String name;

    College(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("The id is: "+id);
        System.out.println("The name is: "+name);
    }
}


class Students extends College{
    int regno;
    Students(int id, String name, int regno){
        super(id,name);
        this.regno = regno;
    }
    void display(){
//        super.display();
        System.out.println("The id is: "+id);
        System.out.println("The name is: "+name);
        System.out.println("The regno is: "+regno);
    }
}
class Staff extends College{
    int empid;
    Staff(int id, String name, int empid){
        super(id,name);
        this.empid = empid;
    }
    void display(){
//        super.display();
        System.out.println("The id is: "+id);
        System.out.println("The name is: "+name);
        System.out.println("The empid is: "+empid);
    }
}

public class Main {
    public static void main(String[] args) {
        College s2, s3, s4;
        s2 = new College(21,"Thiru");
        s3 = new Students(22,"Hari",91);
        s4 = new Staff(123,"Raji",3432);
        s2.display();
        s3.display();
        s4.display();

    }
}