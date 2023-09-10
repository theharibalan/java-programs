import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr ={1,2,3,4,5};
//        List n = Arrays.asList(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {

            list.add(arr[i]);
        }
        System.out.println(list);
        int rot = inp.nextInt();
        int actual = rot % length;

        for (int i = actual; i < length; i++) {
            System.out.print(list.get(i)+" ");
        }

        for (int i = 0; i < actual; i++) {
            System.out.print(list.get(i)+" ");
        }

//        int rot = 2;
//        System.out.print(list.subList(rot,length));
    }
}
