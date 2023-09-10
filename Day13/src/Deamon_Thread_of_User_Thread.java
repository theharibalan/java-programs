public class Deamon_Thread_of_User_Thread extends Thread {

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Deamon thread is working");
        }
        else{
            System.out.println("User thread is working");
        }
    }

    public static void main(String[] args) {
        Deamon_Thread_of_User_Thread t1 = new Deamon_Thread_of_User_Thread();
        Deamon_Thread_of_User_Thread t2 = new Deamon_Thread_of_User_Thread();
        t1.setDaemon(true);
        t2.start();

    }
}
