public class Bitonic_Array_using_for_if {

    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        int n = inp.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0; i<arr.length; i++){
//            arr[i] = inp.nextInt();
//        }
       int[] arr = {10,20,30,5,3};

        int mid = arr.length / 2;
        int max = 0;
        int min = 9999999;
        int i;
        // loop through every element in the array
        for (i = 0; i < arr.length; i++) {
            // first check upt mid
            if(i<(int) arr.length/2){
                if(arr[i] > max){
                    max = arr[i];
                }
                else {
                    break;
                }
            }
            else{
                if(arr[i] < min){
                    min = arr[i];
                }
                else {
                    break;
                }
            }
        }
        if(i==arr.length) System.out.println("Bitoic");
        else System.out.println("Not Bitonic");
    }
}