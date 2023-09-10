import java.util.*;

public class count_the_word_character_in_string {
    public static void main(String[] args) {
                Scanner inp = new Scanner(System.in);
                String n = inp.nextLine();
                String[] arr = n.split(" ");

        HashMap<String, Integer> hs = new HashMap<>();

        int largest = 0;
                String val  = null;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                count++;
            }
            System.out.println(arr[i] + " : "+ count);

            hs.put(arr[i],count);

            if(largest < count){
                largest = count;
                val = arr[i];
            }
        }
        System.out.println("By for each loop of HashMap");
        for(Map.Entry m: hs.entrySet()){
            System.out.println(m.getValue()+" : "+m.getKey());
        }
        System.out.println(hs);
        System.out.println("The largest is:: "+val+" : "+ largest);
    }
}
