import java.util.Scanner;

public class Intermission_animation extends Thread {

    public void run(){
        try {
            String inter = "______INTERMISSION______";
            for (int i = 0; i < inter.length(); i++) {
                char c = inter.charAt(i);
                if(c == 95){
                    Thread.sleep(80);
                }
                else{
                    Thread.sleep(500);
                }
                System.out.print(inter.charAt(i));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Intermission_animation ia = new Intermission_animation();
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        System.out.print("\n\n\n\n\t\t\t");
        ia.start();
    }
}
