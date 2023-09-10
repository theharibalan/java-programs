import java.util.Scanner;

public class HighestProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calculateHighestProduct(n));
    }
//    static void Print(int n){

//        if(n<=0){
//            System.out.println(0);
//        }

        // for loop to check the divisibel of that number
//        int k=0,z=0;
//        for (int i = 2; i <= n/2;  i++) {
//            if(n%i==0){
//               k=i;
//               System.out.println(k);
//
//            }
//
//        }

        private static int calculateHighestProduct(int N) {
            if (N <= 1) {
                return 0;
            }

            int maxProduct = 0;

            for (int i = 1; i < N; i++) {
                int product = Math.max(i * (N - i), i * calculateHighestProduct(N - i));
                maxProduct = Math.max(maxProduct, product);
            }

            return maxProduct;
        }

    }
