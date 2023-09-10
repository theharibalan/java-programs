public class Missing_element_in_array {
    public static void main(String[] args) {
        int[] arr = {11,12,14,15,16};
        int ans = findMissing(arr);
        System.out.println(ans);
    }

   static int findMissing(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i+1] - arr[i];
            if(val!=1){
                return arr[i] + 1;
            }
        }
        return -1;
    }
}
