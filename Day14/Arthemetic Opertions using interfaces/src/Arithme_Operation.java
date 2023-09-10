import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class Arithme_Operation implements Addition, Subraction, Multiplication{

    public void add(){
        System.out.println("Addition is: "+ (a+b));

    }

    public void sub(){
        System.out.println("Subraction is: "+ (x-y));
    }
    public void mul(){
        System.out.println("Multiplication is: "+ (m*n));
    }


    public static void main(String[] args) {
        Arithme_Operation ap = new Arithme_Operation();
        ap.add();
        ap.sub();
        ap.mul();
    }

}
