import java.util.Arrays;
import java.util.PriorityQueue;

public class SortArrayUsingPQ {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,1,1,9,8,7,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        // The poll gives the lowest(smallest) number first and empty the Queue
        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArray[i] = pq.poll();
        }

        System.out.println(Arrays.toString(sortedArray));


        //computer solution
//        int[] unsortedArray = {5, 3, 8, 2, 1};
//
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//        // Add elements from the unsorted array to the priority queue
//        for (int num : unsortedArray) {
//            priorityQueue.offer(num);
//        }
//
//        // Retrieve the elements from the priority queue in sorted order
//        int[] sortedArray = new int[unsortedArray.length];
//        int index = 0;
//        while (!priorityQueue.isEmpty()) {
//            sortedArray[index++] = priorityQueue.poll();
//        }
//
//        // Print the sorted array
//        for (int num : sortedArray) {
//            System.out.print(num + " ");
//        }

    }
}
