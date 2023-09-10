public class Multiple_Excep {
    public static void main(String[] args) {
        try{
//            int a = 10/0;
            int[]arr = new int[10];
            arr[20] = 46;
            System.out.println(arr);
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
        catch (NumberFormatException e2){
            System.out.println(e2);
        }
        catch (ArrayIndexOutOfBoundsException e3){
            System.out.println(e3);
        }
        catch (Exception e4){
            System.out.println(e4);
        }
    }
}
