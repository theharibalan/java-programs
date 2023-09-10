public class Actual_Deamon extends Thread {
    public void run(){
        System.out.println("Deamon: "+Thread.currentThread().isDaemon());
        System.out.println("Normal: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Actual_Deamon ad = new Actual_Deamon();
        Actual_Deamon ad1 = new Actual_Deamon();
        Actual_Deamon ad2 = new Actual_Deamon();
//        ad.setDaemon(true);
        ad.start();
        ad1.start();
//        ad2.start();
    }

}
