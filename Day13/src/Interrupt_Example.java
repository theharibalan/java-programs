public class Interrupt_Example extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("thread");
        }
        catch (InterruptedException e){
            throw new RuntimeException("hi thread is interrupted"+e);
//            System.out.println("Hi thread is interrupted");
        }
    }

    public static void main(String[] args) {
        Interrupt_Example il = new Interrupt_Example();
        il.start();
        try{
            il.interrupt();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
