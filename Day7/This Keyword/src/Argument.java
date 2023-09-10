class S2{
    void m(S2 obj){ // argument to be needed for achieving that we use this as a empty passing
        System.out.println("method is invoked");
    }
    int x;
    void m1(int x){
        this.x = x;
        System.out.println(x);
    }
    void p(){
        m(this);
    }
    void p1(){
        m1(2);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
        s1.p1();
    }
}  