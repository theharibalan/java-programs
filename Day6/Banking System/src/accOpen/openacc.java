package accOpen;

public class openacc {
    int accno = 1234566;
    String name = "Haribalan";
    public static float amt = 1000.456f;

    public void dispInfo(){
        System.out.println("--------------Account Information-------------");
        System.out.println("Account Id: "+accno);
        System.out.println("Account Holder Name: "+name);
        System.out.println("Account Present Balance: "+amt);
    }

}
