import java.util.Scanner;

public class Anagram_Simple_way {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s1 = inp.nextLine();
        String s2 = inp.nextLine();
        int n1 = 0;
        int n2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            n1 +=s1.charAt(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            n2 +=s2.charAt(i);
        }
        if(n1==n2){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
