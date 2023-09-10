class Animal{
   Animal(String name){
        System.out.println("I am animal called parent "+name);
    }
}

class Dog extends Animal{
    Dog(String name){
        super("Jimmy"); // Parametrized super constructor
        cat();
        System.out.println("I am dog called child");
    }
    void hello(){
        System.out.println("hello from dog methog");
    }

    public void horse(){
        System.out.println("I am horse child as method2 ");
    }

    public void cat(){
        horse();
        System.out.println("I am cat called child as method1");
    }
}

class Insects extends Dog{
    Insects(String name) {
        super(name);
    }
    void hello(){
        System.out.println("hello from insects method my name is");
    }
}

public class Super_constructor {
    public static void main(String[] args) {
//        Dog d1 = new Dog();

        Insects i1 = new Insects("balaji");
        i1.hello();
        System.out.println();
    }
}
