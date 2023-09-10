public class Multithreading extends Thread{
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
        Multithreading t1 = new Multithreading();
        t1.start();
        Multithreading t2 = new Multithreading();
        t2.start();
        Multithreading t3 = new Multithreading();
        t3.start();
        Sleep_Process t4 = new Sleep_Process();
        t4.start();
    }
}
