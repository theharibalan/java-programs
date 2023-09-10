// Importing Essential Libraries
import java.util.*;

// Driver Code
class Main {
    public static void main(String[] args) {
        // Input array
        int i;
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));

        // Printing the elements of the array in Reverse Order
        System.out.print("Reversed Array : [");
        for(i = array.length - 1; i >= 1; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[i] + "]");
    }
}
