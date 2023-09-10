import java.util.ArrayList;
import java.util.Scanner;

public class Array_Rotation_Using_ArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int[] arr ={10,20,30,40,50};
//        List n = Arrays.asList(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int length = arr.length;
        for (int i = 0; i < length; i++) {

            list.add(arr[i]);
        }
        System.out.print("Enter the rotation time: ");
        int rotate = inp.nextInt();
        rotate %=list.size();
        boolean flag = true;

        while (flag){
            System.out.println("1. Left Rotation");
            System.out.println("2. Right Rotation");
            System.out.println("3. Exit");
            int choice = inp.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Performing Right Rotation");
                    rightRotation(rotate,list);
                    break;
                case 2:
                    System.out.println("Performing Left Rotation");
                    leftRotation(rotate,list);
                    break;
                case 3:
                    flag = false;
                    break;
                default: System.out.println("Invalid Input");
                break;
            }
        }

    }

    // left Rotation
    static void rightRotation(int rotate, ArrayList<Integer> list){
        for (int i = 0; i < rotate; i++) {
            int last = list.get(list.size()-1);
            list.add(0,last);
            list.remove(list.size()-1);
        }
        System.out.println(list);
    }


    // right rotation
    static void leftRotation(int rotate, ArrayList<Integer> list){
        for (int i = 0; i < rotate; i++) {
            int last = list.get(0);
            list.add(list.size(),last);
            list.remove(0);
        }
        System.out.println(list);
    }
}
