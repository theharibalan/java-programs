import java.util.LinkedList;
import java.util.Queue;

public class QUnderstanding {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        System.out.println("In Queue it is First in Last Out its like [Head pointing towards the value]");
        q.add(1);
        q.add(23);
        q.add(32);

        System.out.println(q);

        System.out.println("Used to view the head [peek]: "+q.peek());
        System.out.println("Used to pop the head: [remove - throws exception when it is empty]    [poll - it shows null value when the queue is empty]: "+q.remove());
        System.out.println("Used to view the head [peek]: "+q.peek());

    }
}