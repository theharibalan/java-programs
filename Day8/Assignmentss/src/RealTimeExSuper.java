class Emp {
    int id;
    String name;

    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

    class Person extends Emp{
        float salary;
        Person(int id, String name, float salary){
            super(id, name);
            this.salary = salary;

        }
        void display(){
            System.out.println("Employee id is: "+id+" his/her name is: "+name+" he got salary about "+salary);
        }
    }
    class Main{
        public static void main(String[] args) {
            Person p1 = new Person(21,"haribalan",2000000f);
            p1.display();
        }
    }
