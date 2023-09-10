public class Thread_Understanding extends Thread{

    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Thread_Understanding m1 = new Thread_Understanding();
        m1.start();
        Thread_Understanding m2 = new Thread_Understanding();
        m2.start();
    }
}

//        try{
//            m1.start();
//            m1.start();
//        }
//        catch(IllegalThreadStateException e){
//            System.out.println("I caught some error"+e);
//        }

// Main Method is the main thread