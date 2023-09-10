import java.util.Scanner;
public class Happy_or_Not {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
            int n = num, count = 0, r = 0, t = 0;
            while (n > 0) {
                n /= 10;
                count++;
            }
            int sqr = 0;
            while (n > 0) {
                r = r % 10; //2
                sqr = r * r; // 4
                t = t + sqr; //4
                n /= 10;
            }
            System.out.println(t);
        }

    }
