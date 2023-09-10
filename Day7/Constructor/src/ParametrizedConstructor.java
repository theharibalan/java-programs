import java.util.Scanner;

public class ParametrizedConstructor {
    int id;
    String name;
    String Address;
    double salary;

    ParametrizedConstructor(int id, String name, String Address, double salary) {
        id = id;
        name = name;
        Address = Address;
        salary = salary;

        System.out.println(id);
        System.out.println(name);
        System.out.println(Address);
        System.out.println(salary);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = inp.nextInt();
        String n = inp.nextLine();
        double s = inp.nextDouble();
        String a = inp.nextLine();
        ParametrizedConstructor pc = new ParametrizedConstructor(i, n, a, s);
    }
}
