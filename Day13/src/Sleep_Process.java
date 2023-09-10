// This process is also know as threading
public class Sleep_Process extends Thread{
    public void run(){
        for (int i = 0; i <= 10; i++) {
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Sleep_Process t1 = new Sleep_Process();
        t1.start();
    }
}
