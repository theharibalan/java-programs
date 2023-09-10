import netscape.security.UserTarget;

import java.util.Arrays;

public class Array_rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int times = 2;
        int[] temp = new int[arr.length];

        //first seperate from times to end
        int i,j,k;
        for (k=0,i = times; i < arr.length; i++,k++) {
            temp[k] = arr[i];
        }

        // second sepearte the array and add to the temp array
        for (j = k, i=0; i < times; j++, i++) {
            temp[j] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

}
