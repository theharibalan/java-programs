public class Swao_in_substring {
    public static void main(String[] args) {
        String s1 = "haribalan";
        String s2 = "sivakumar";

//        This is applicable only for this raja rani input
//        System.out.print(s1.substring(0,2));
//        System.out.print(s2.substring(2)+" ");
//        System.out.print(s2.substring(0,2));
//        System.out.println(s1.substring(2));

        System.out.println("Before Swapping of strings:: "+s1+" "+s2);
        s1 = s1 + s2; //haribalansivakumar
        s2 = s1.substring(0,(s1.length() - s2.length())); // (0,9) -> haribalan
        s1 = s1.substring(s2.length()); // (9) -> sivakumar
        System.out.println("After Swapping of strings:: "+s1+" "+s2);

    }
}
