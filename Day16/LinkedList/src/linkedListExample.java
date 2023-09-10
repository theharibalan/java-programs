import java.util.Iterator;
import java.util.LinkedList;

public class linkedListExample
{
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(5);
        li.add(6);

        //Using iterator to iterate the values
        System.out.println("Using iterator to iterate the values");
        Iterator<Integer> iter = li.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(li);
        System.out.println("Add the value at the first position");
        li.addFirst(0);
        System.out.println(li);

        System.out.println("Add the value at the last position");
        li.addLast(4);
        System.out.println(li);

    }
}