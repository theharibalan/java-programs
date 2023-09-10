import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class characterFreq {
    public static <Map> void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        HashMap<Character, Integer> occ = new HashMap<>();
//        for (char i: s.toCharArray()){
//            if(occ.containsKey(i)){
//                occ.put(i, occ.get(i)+1);
//            }
//            else {
//                occ.put(i, 1);
//            }
//        }
        for(char c: s.toCharArray()){
            occ.put(c, occ.getOrDefault(c, 0)+1);
        }

        System.out.println(occ);

    }
}
