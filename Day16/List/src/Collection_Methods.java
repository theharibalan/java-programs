import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Collection_Methods {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Object> b = new ArrayList<>();

        // 1. Method add elements to the list
        System.out.println("1. Method add elements to the list");
        a.add(4);
        a.add(5);
        a.add(5);
        System.out.println(a);

        // 2. Add all at once
        System.out.println("2. Add all at once");
        b.addAll(a);
        System.out.println(b);

        // 3. what if we did give <nothing here>
        System.out.println("3. what if we did give <nothing here>");
        System.out.println("We can add any number of different data items");
        ArrayList li = new ArrayList();
        li.add(1);
        li.add("Hari");
        li.add(7.26f);
        System.out.println(li);

        // 4. Get the particular element from the list
        System.out.println("4. Get the particular element from the list");
        ArrayList<String> str = new ArrayList<>();
        str.add("oppo");
        str.add("vivo");
        str.add("samsung");
        str.add("one plus");
        System.out.println(str);
        System.out.println(str.get(0));

        // 5. Iterating the list
        System.out.println("5. Iterating the list");
        // Traditional for loop
        System.out.println(">>>>>>Traditional for loop<<<<<<");
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }

        //Using hasNext()
        System.out.println(">>>>>>>>Using Iterator<<<<<<<<<<<");
        Iterator itr = str.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Enhanced for loop
        System.out.println(">>>>>>>>Enhanced for loop<<<<<<<<<");
        for(String i:str){
            System.out.println(i);
        }

        // 6. Aslist - > convert form Array to ArrayList
        System.out.println("6. Aslist - > convert form Array to ArrayList");
        String arr[] = new String[]{"hari","balan","raju","ragavi"};
        List name = Arrays.asList(arr);
        for (Object i:name) {
            System.out.println(i);
        }
//        name.add(123);
//        System.out.println(name);

        // 7. Contains - Returns Boolean
        System.out.println("7. whether the value is contained or not");
        if(str.contains("samsung")){
            System.out.println("Samsung is contained : " + str.contains("samsung"));
        }
        else System.out.println("not contained the targeted value");

        // Contains all
        System.out.println("8. Contains all");
        String arr2[] = new String[]{"hari","balan","abinav"};
        List peruh  = Arrays.asList(arr2);
        System.out.println(peruh);
        if(name.containsAll(peruh)) System.out.println("Contains all names in peruh ");
        else System.out.println("Not contained");


        // 9. clear -> clear all the elements from the list
        System.out.println("9. Clear");
//        peruh.clear(); // List doesn't have the operation --->  Exception in thread "main" java.lang.UnsupportedOperationException
//        System.out.println(peruh);

        li.clear(); // Only applicable in array List
        System.out.println(li);

        // 10. Sorting from ascending
        System.out.println("10. Sorting from ascending");
        ArrayList al = new ArrayList();
        al.add("apple");
        al.add("orange");
        al.add("mango");
        al.add("banana");
        System.out.println("Before sort "+al);
        Collections.sort(al); // ascending
        System.out.println("After sort "+al);

        // 11. Descending order
        System.out.println("11. Descending order");
        Collections.reverse(al);
        System.out.println(al);

        // 12. SubList
        System.out.println("12. SubList -> similar to Substring (startindex, endindex) -> startig value included ending value not included");
        System.out.println(al.subList(0,2));

        // 13. indexOf -> opposite of get()
        System.out.println("13. indexOf -> opposite of get()");
        int i = al.indexOf("orange");
        System.out.println(i);
        System.out.println(al.get(i));

        // 14. isEmpty
        System.out.println("14. isEmpty -> whether the list is empty or not");
//        al.clear();
        System.out.println(al.isEmpty());
    }
}