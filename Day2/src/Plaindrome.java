public class Plaindrome {
    public static void main(String[] args) {
        int n = 181;
        int r, t=0, m;
        m = n;
        while(n>0){
            r = n%10;
            t = (t*10)+r;
            n = n/10;
        }
        System.out.println(m == t?"Palin"+t:"notpalin");
    }
}
