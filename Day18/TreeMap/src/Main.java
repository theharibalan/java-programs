import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        System.out.println("1. Put method to isnert the values to map");
        tm.put(1,"kuna");
        tm.put(4,"velu");
        tm.put(3,"rajan");
        tm.put(2,"thambi");
        System.out.println(tm);

        System.out.println("2. Duplicate values - > doesn't allow duplicates");
        tm.put(1,"velu");
        System.out.println(tm);


        System.out.println("3. Null - if two null keys it will overriden");
//        tm.put(null,"raj"); // It will throw an exception
        tm.put(4,null); // overriden
        System.out.println(tm);

        System.out.println("4. If Absent -  replace the null value into actual value");
        tm.putIfAbsent(4,"Denis"); // replace the null values into actual values
        System.out.println(tm);

        System.out.println("5. Replace - > replace the values into another");
        tm.replace(4,"rahul");
        System.out.println(tm);

        System.out.println("6. Remove - remove the values in the map using key");
        tm.remove(2);
        System.out.println(tm);

        System.out.println("7. Contains - check whether the values contained are not");
        System.out.println(tm.containsKey(2));
        System.out.println(tm.containsValue("rajan"));

        System.out.println("8. Get - if value contained prints the value if not prints null " +
                "and getOrDefault - if contained prints otherwise prints the default value of the user message");
        System.out.println(tm.get(3));
        System.out.println(tm.getOrDefault(3,"The Key doesn't exist"));


        System.out.println("entrySet - keySet - values");
        System.out.println(tm.entrySet()); // [Key - Value]
        System.out.println(tm.keySet()); // only [Keys]
        System.out.println(tm.values()); // only [values]

    }
}