public class Exception_types_to_handle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7};
        try{
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("The value is: "+arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("I handled exception here ");

//            System.out.println(e); // system provided exceptiom

            e.printStackTrace(); // combination of two or more ->
            // java.lang.ArrayIndexOutOfBoundsException: 6 at Main.main(Main.java:6)
        }
        System.out.println("Hari Balan");
    }
}