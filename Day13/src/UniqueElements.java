import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,1};
        int[] arr1 = new int[arr.length];

        // copy only the distinct element from an actual array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr1[i] = arr[i];
                }
            }
        }
        //compare between original and copy of the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {  // trace out here to solve
                    arr[i] = 0;
                }
            }
        }

        int count = 0;
        // loop to print the unquie element
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
                count++;
            }
//        }
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr));
        }
        if(count==0){
            System.out.println("No unique elements in the array");
        }
    }
}
