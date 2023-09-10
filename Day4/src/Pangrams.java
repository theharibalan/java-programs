public class Pangrams {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        String s1 = s.toUpperCase();
        int count = 0;
        for (char i = 65; i <= 90; i++) {
            for (int j = 0; j < s1.length(); j++) {
                if(i==s1.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count == 26){
            System.out.println("Pangrams");
        }
        else{
            System.out.println("Not Pangrams");
        }
    }
}
