
public class StringBufferExample {
    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("hari");
        for (int i = 0; i <=1000; i++) {
            sb.append("balan");
        }
        System.out.println(System.currentTimeMillis()-st+" ms");


        // String Builder
        StringBuilder sb1 = new StringBuilder("hari");
        long st1 = System.currentTimeMillis();
        for (int i = 0; i <=1000; i++) {
            sb1.append("balan");
        }
        System.out.println(System.currentTimeMillis()-st1+" ms");
    }
}
