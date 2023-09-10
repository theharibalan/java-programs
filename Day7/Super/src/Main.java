//If there is a default comstructor it is possible otherwise it don't

class Animal{
    Animal(){System.out.println("animal is created");
    }
    Animal(int n){System.out.println(n);
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("dog is created");
    }
}
class TestSuper4{
    public static void main(String args[]){
        Dog d=new Dog();
        Animal a = new Animal(5);
    }}