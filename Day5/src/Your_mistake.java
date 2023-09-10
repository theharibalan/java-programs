import java.awt.*;

public class Your_mistake {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8};
        Your_mistake e = new Your_mistake();
        e.Even(arr);
    }
    public void Even(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]%2==0?"The number "+arr[i]+" is Even":"The number "+arr[i]+" is Odd");
        }
    }
}