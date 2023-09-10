public class SubString {
    public static void main(String[] args) {
        String s1 = "Hari balan";
//                   0123456789
        System.out.println(s1.substring(2)); //  starting with zero index
        System.out.println(s1.substring(0,2)); //limitation of index ends before the index number
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(2,6)); // starting index included and ending index not included
        System.out.println(s1.substring(6,9));
    }
}
