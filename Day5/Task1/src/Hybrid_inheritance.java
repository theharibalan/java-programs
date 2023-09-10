// here we can perform Hybrid with (single + multilevel + hierarchical)

class Grandfather{
    void disp1(){
        System.out.println("I am Grandfather class");
    }
}
class Father extends Grandfather{
    void disp2(){
        System.out.println("I am father class and extend the prop from GF");
    }
}

class So extends Father{
    void disp3(){
        System.out.println("I am son extend prop from father");
    }
}

class Daughter extends Father{
    void disp4(){
        System.out.println("I am daughter extend prop from father");
    }
}

public class Hybrid_inheritance {
    public static void main(String[] args) {
        So s1 = new So();
        s1.disp3();
        s1.disp2();
        s1.disp1();
    }
}

