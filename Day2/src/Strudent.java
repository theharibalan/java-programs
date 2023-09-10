public class Strudent {
    String name;
    int regno;
    String department;

    Strudent(String name, int regno, String department){
        this.name = name;
        this.regno = regno;
        this.department = department;
    }

    void display(){
        System.out.println("Name: "+name+" regno: "+regno+" department: "+department);
    }
    public static void main(String[] args) {
        Strudent s1 = new Strudent("Hari",120,"CSE");
        Strudent s2 = new Strudent("Balan",121,"ECE");
        Strudent s3 = new Strudent("Raju",122,"EEE");
        s1.display();

    }
}
