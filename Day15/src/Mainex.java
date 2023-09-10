class RBI{
    float rroi = 2.5f;
    public float roi(){
        return rroi;
    }
}

class SBI extends RBI{
    float sroi = 3.5f;
    public float roi(){
        return sroi+rroi;
    }
}

class HDFC extends RBI{
    float hroi = 4.5f;
    public float roi(){
        return hroi+rroi;
    }
}

class ICICI extends RBI{
    float icroi = 5.5f;
    public float roi(){
        return icroi+rroi;
    }
}

public class Mainex {
    public static void main(String[] args) {
        RBI r;
        r = new SBI(); // upcasting -> parent properties can be accessed by child
        System.out.println("The parent to child SBI is: "+r.roi());

        r = new HDFC();
        System.out.println("The parent to child HDFC is: "+r.roi());

        r = new ICICI();
        System.out.println("The parent to child ICICI is: "+r.roi());
    }
}