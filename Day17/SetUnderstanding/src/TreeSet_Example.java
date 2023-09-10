import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet_Example {
    public static void main(String[] args) {
//        int[] arr = {9,7,5,4,3,2,1,1,1,1}; // Sort and dont allow duplicates
        TreeSet<Integer> ts = new TreeSet<Integer> ();

//        for(int i:arr){
//            ts.add(i);
//        }
        System.out.println(ts);

        // it don't allow duplicates
        ts.add(3);
        ts.add(1);
        ts.add(2);
//        ts.add("hi");// it cannot be inserted into treeset because the TreeSet must be sorted so only allow the unique values
        ts.add(2);
        // it also be sorted
        System.out.println(ts);

        // it won't allow null values
        System.out.println(ts.first()+"  "+ts.last());
//        ts.add(null); // It throw an exception -> Exception in thread "main" java.lang.NullPointerException
    }
}
