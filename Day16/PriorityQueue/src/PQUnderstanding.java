import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQUnderstanding {
    public static void main(String[] args) {
        System.out.println("Similar to Queue but the advantage it add the element with the sorted manner");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(32);
        pq.add(23);
        pq.add(42);

        System.out.println(pq);

        System.out.println("Used to view the head [peek]: "+pq.peek());
        System.out.println("Used to pop the head: [remove - throws exception when it is empty]    [poll - it shows null value when the queue is empty]: "+pq.remove());
        System.out.println("Used to view the head [peek]: "+pq.peek());
    }
}