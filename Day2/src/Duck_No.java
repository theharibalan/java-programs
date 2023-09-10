
// This is default taken as octal number if it contained as 0 in the starting of that integerx
// Another method is to convert the given number into character and the first character if it is a 0 or not
public class Duck_No {
    public static void main(String[] args) {
        Duck_No dn = new Duck_No();
        // NOTE:
        // Integer literals that start with 0 are octal literals.
        int ans = dn.checkDuck(0120);
        System.out.println(ans>0?"DuckNo":"Not a DuckNo");
    }
    int checkDuck(int n){
        int ch=0;
        for(int i=n; i>0; i = i/10){
            int r = i%10;
            if(r==0){
                ch++;
            }
        }
        return ch;
    }
}
