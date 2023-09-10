// Solution:2
// Implementing using polymorphism (super() -> keyword)

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

class P1{
    String name ="sivakumar";
    public void disp(){
//        System.out.println("The parent name is:: "+name);
    }
}

class C1 extends P1{
    String name = "Haribalan";
    public void show(){
        System.out.println("The child name is:: "+name);
        System.out.println("The Parent name is:: "+super.name); // Parent properties are accepting here we used super keyword to access variable
    }

    public void show2() {
        System.out.println("I am show2 method");
        super.disp();
        show();
    }
}

public class Solution2 {
    public static void main(String[] args) {
        C1 c = new C1();
        c.show2();
    }
}
