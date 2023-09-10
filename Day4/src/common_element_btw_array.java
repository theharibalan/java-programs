public class common_element_btw_array {
    public static void main(String args[]){
        int arr1[] = {1,2,3,5,6,7};
        int arr2[] = {2,4,6,8};
        findCommon(arr1,arr2);
    }

    static  void findCommon(int[] arr1, int[] arr2){
        for(int i=0; i < arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}

