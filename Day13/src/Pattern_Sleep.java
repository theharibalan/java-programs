public class Pattern_Sleep extends Thread {
    static void Pattern(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e){
                    System.out.println(e);
                }
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern(5);
    }
}
