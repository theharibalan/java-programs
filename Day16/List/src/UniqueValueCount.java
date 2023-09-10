import java.util.ArrayList;
import java.util.Arrays;

public class UniqueValueCount {
    public static void main(String[] args) {
        String[] arr = {"Hari", "Balan", "Gogul", "Hari", "Surya"};
        ArrayList<String> al = new ArrayList<>(); //Arrays.asList(arr)
        for(String i:arr){
            if (!al.contains(i)){
                al.add(i);
            }
            else{
                al.remove(i);
            }
        }
        System.out.println(al);
    }
}
