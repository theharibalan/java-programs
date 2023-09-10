import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap <Integer, String> hm = new HashMap<>();
        System.out.println("1. Put - method to insert the values to map");
        hm.put(1,"Hari");
        hm.put(2,"balan");
        hm.put(3,"vijaya");
        hm.put(4,"siva");
        System.out.println(hm);
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        System.out.println("2. Duplicates keys - It will override the duplicate with the new one");
        hm.put(1,"Harsha"); // It will override the
        System.out.println(hm);

        System.out.println("3. Null - if two null keys it will overriden");
        hm.put(null,"raj");
        hm.put(4,null); // overriden
        System.out.println(hm);

        System.out.println("4. If Absent -  replace the null values into actual values");
        hm.putIfAbsent(4,"Denis"); // replace the null values into actual values
        System.out.println(hm);

        System.out.println("5. Replace - > replace the values into another");
        hm.replace(4,"rahul");
        System.out.println(hm);

        System.out.println("6. Remove - remove the values in the map using key");
        hm.remove(null);
        System.out.println(hm);

        System.out.println("8. Get - if value contained prints the value if not prints null " +
                "and getOrDefault - if contained prints otherwise prints the default value of the user message");
        System.out.println(hm.get(3));
        System.out.println(hm.getOrDefault(3,"The Key doesn't exist"));


        System.out.println("9. entrySet - keySet - values");
        System.out.println("both [Key - Value] ---" + hm.entrySet()); // [Key - Value]
        System.out.println("only [Keys] ---"+ hm.keySet()); // only [Keys]
        System.out.println("only [values] ---"+ hm.values()); // only [values]


        System.out.println("10. remove only key");
        System.out.println(hm.remove(1, "Harsha"));
        System.out.println(hm);

        System.out.println("11. replace");
        System.out.println(hm.replace(2,"balaganesh"));
        System.out.println(hm);

        System.out.println("12. containsKey and Value");
        System.out.println(hm.containsKey(2));
        System.out.println(hm.containsValue("balaganesh"));
        System.out.println(hm);

        System.out.println("13. Get");
        System.out.println(hm.get(3));
//        System.out.println(hm.get("vijaya")); // only keys are allowed

    }
}