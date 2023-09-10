public class InternMethod {
    public static void main(String[] args) {
        String s1 = "Haribalan";
        System.out.println("Direct display: "+s1);
//        String s2 = s1.intern(); // restore/fetch/retrieve
        String s2 = s1;
        System.out.println("Indirect Display: "+s2);

    }
}
