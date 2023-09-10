public class StringDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hari");
        sb.append("balan");
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
    }
}
