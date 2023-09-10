class RBI{
    int roi = 2;
}

class HDFC extends RBI{
    int hroi = 6;
    void disp1(){
        int tot = hroi + roi;
        System.out.println("The HDFC rate of intreset is "+tot);
    }
}
class SBI extends RBI{
    int sroi = 7;
    void disp2(){
        int tot1 = sroi + roi;
        System.out.println("The SBI rate of intreset is "+tot1);
    }
}

class ICICI extends RBI{
    int icroi = 8;
    void disp3(){
        int tot2 = icroi + roi;
        System.out.println("The ICICI rate of intreset is "+tot2);
    }
}


public class Heirarchical_inheritance {
    public static void main(String[] args) {
        ICICI ic = new ICICI();
        SBI sb = new SBI();
        HDFC hd = new HDFC();
        hd.disp1();
        sb.disp2();
        ic.disp3();

    }
}
