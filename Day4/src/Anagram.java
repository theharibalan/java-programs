import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1 = sc.next();
//        String s2 = sc.next();
//        String s1 = "fool";
//        String s2 = "loof";
//
//        int count = 0;
//        int len = s1.length();
//        for (int i = 0; i < len; i++) {
//            for (int j = 0; j < s2.length(); j++) {
//                if(s1.charAt(i) == s2.charAt(j)){
//                    count++;
//                    break;
//                }
//            }
//        }
//        System.out.println(len==count?"Yes the Given Strings are anagram":"No its not a anagram strings");

        System.out.println(isAnagram("ac","bb"));

    }

        public static boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            int n = 0;
            int n1 = 0;
            for(int i=0; i<s.length(); i++){
                n+=s.charAt(i);
                n1+=t.charAt(i);
            }
            if(n==n1){
                return true;
            }
            return false;
        }

}
