import java.util.HashMap;
import java.util.Scanner;

public class Count_character_using_map {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String n = inp.nextLine();
        String[] arr = n.split(" ");
        HashMap<String,Integer> hm = new HashMap<>();

        int largest = 0;
        String val  = null;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                count++;
            }
            hm.put(arr[i],count); // we can also replace this by  hm.put(arr[i],arr[i].length());
            if(largest < count){
                largest = count;
                val = arr[i];
            }
        }
        for (String i:hm.keySet()) {
            System.out.println(i+" : "+hm.get(i));
        }
        System.out.println("The largest is:: "+val+" : "+ hm.get(val));
    }


}
