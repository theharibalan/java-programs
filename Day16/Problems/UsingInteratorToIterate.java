import java.util.ArrayList;
import java.util.Iterator;

public class UsingInteratorToIterate {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(24);
        arrayList.add("hari");
        arrayList.add('h');
        arrayList.add(true);

//        System.out.println(arrayList);
        //Print using Iterator
        Iterator iter = arrayList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
