public class Join_user_level extends Thread{
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
        Sleep_Process t2 = new Sleep_Process();
        try{
            t2.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        t2.start();

        Sleep_Process t3 = new Sleep_Process();
        t3.start();

        Sleep_Process t4 = new Sleep_Process();
        t4.start();
    }
}

