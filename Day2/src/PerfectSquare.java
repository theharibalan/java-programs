public class PerfectSquare {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int squ = i*i;
            if(squ==64) {
                System.out.println(i + " " + squ);
            }
        }
    }
}
