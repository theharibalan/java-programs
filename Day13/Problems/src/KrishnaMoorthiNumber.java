import java.util.Scanner;

public class KrishnaMoorthiNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = inp.nextInt();
        int rem = 0;
        int result = 0;
        int temp = num;
        while(num>0){
            rem = num %10;
            result += fact(rem);
            num=num/10;
        }
        if(result == num){
            System.out.println("The givem number "+temp+" is KrishnaMoorthy Number");
        }
        else{
            System.out.println("The givem number "+temp+" is not a KrishnaMoorthy Number");
        }
    }
    static int fact(int n){
        int res = 0;
        for (int i = n; i >=1 ; i--) {
            res = res*i
;        }
        return res;
    }
}
