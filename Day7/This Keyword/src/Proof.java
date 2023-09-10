public class Proof {

    void m() {
        System.out.println(this);
        //prints same reference ID
    }

        public static void main(String args[]) {
            Proof obj = new Proof();
            System.out.println(obj);//prints the reference ID
            obj.m();
        }
}
