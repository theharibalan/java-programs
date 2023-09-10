public class Employee_details {

    int empId;
    String empName;

    String empShift;

    Employee_details(int id, String name, String shift){
        this.empId = id;
        this.empName = name;
        this.empShift = shift;
        System.out.println("The name of the Employee is: "+empName+" and the id is "+empId+" and shift is "+empShift);
    }
    public void display(){
        System.out.println("The name of the Employee is: "+empName+" and the id is "+empId+" and shift is "+empShift);
    }

    public static void main(String[] args) {
        Employee_details emp = new Employee_details(121,"Rahul", "Day");
//        emp.display(); you can also use the method to call the details
        Employee_details emp1 = new Employee_details(122,"Hari", "Night");
        Employee_details emp2 = new Employee_details(123,"Surya", "Day");
        Employee_details emp3 = new Employee_details(124,"Sorna", "Night");
        Employee_details emp4 = new Employee_details(125,"sugan", "Day");
    }
}
