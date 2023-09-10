public class antiDiagonalSqaureMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,6},
                {4,5,6,7},
                {7,8,9,10},
                {2,5,7,9}
        };
        antidiagonal(arr);
    }
    static void antidiagonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
//                int val = arr.length-1-i;
                if(i+j == arr.length-1) {
                    System.out.println(arr[i][j]);
                    break;
                }
            }

        }
    }
}

