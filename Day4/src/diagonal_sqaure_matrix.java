import java.util.Scanner;

public class diagonal_sqaure_matrix {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int[][] arr = new int[n][n];

        // To get input array element array from the user
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = inp.nextInt();
            }
        }

//        int[][] arr ={{1,2,3},
//                {4,5,6},
//                {7,8,9}};

        antiDiagonal(arr);

    }
    static void antiDiagonal(int[][] arr){
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==k && j == k){
                   System.out.println(arr[i][j]);
               }
            }
            k++;
        }
    }
}
