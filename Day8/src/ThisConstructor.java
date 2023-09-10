//Write a java program to implement this keyword in constructor
public class ThisConstructor {

    int rolno;
    String name;

    ThisConstructor(int rolno, String name){
//        this();
        this.rolno = rolno;
        this.name = name;
        System.out.println("My rollno is: "+rolno+" and my name is: "+name);
//        this.disp();
    }
    ThisConstructor(){
        this(120,"Hari");
        System.out.println("Hi i am non parametrized constructor");
//        new ThisConstructor(120,"surya");
    }


    public static void main(String[] args) {
        ThisConstructor tc = new ThisConstructor();
    }
}
