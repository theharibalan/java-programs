public class Equals {
    public static void main(String[] args) {
        String s1 = "Hari";
        String s2 = "balan";
        String s3 = "HARI";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        //Compares this String to another String, ignoring case considerations. Two strings are considered equal ignoring case if they are of the same length and corresponding characters in the two strings are equal ignoring case.
        //Two characters c1 and c2 are considered the same ignoring case if at least one of the following is true:
    }
}