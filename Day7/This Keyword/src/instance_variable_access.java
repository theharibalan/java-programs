public class instance_variable_access {
    int id;
    String name;
    float fees;

    instance_variable_access(int id, String name, float fees) // No reference
    {
        this.id = id; // instance variable
        this.name = name;
        this.fees = fees;

    }
    public void disp(){
        System.out.println(id+ " "+name+" "+fees);
    }
    public static void main(String[] args) {
        instance_variable_access ivs = new instance_variable_access(123,"Haribalan",1234.32f);
        ivs.disp();
    }
}