import java.util.HashSet;

public class DuplicateInSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,1};
        DuplicateInSet ds = new DuplicateInSet();
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        System.out.println(hs);
    }
}
