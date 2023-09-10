import java.util.Arrays;
import java.util.Scanner;

public class two_D_Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=inp.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // Searching
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 9) {
                    continue;

                }

                System.out.print(arr[i][j]);
            }
        }

    }
}
