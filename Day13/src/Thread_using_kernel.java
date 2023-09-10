// USerThread
public class Thread_using_kernel extends Thread {
    public void run(){
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        Thread_using_kernel t1 = new Thread_using_kernel();
        t1.start();
        Thread_using_kernel t2  = new Thread_using_kernel();
        t2.start();
        try{
            t1.yield();
            System.out.println(Thread.currentThread().getName()+" ::main method");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
