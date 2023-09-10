public class System_Process_Thread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        System_Process_Thread spt = new System_Process_Thread();
        System_Process_Thread spt1 = new System_Process_Thread();
        System.out.println("The thread name is: "+spt.getName());
        System.out.println("The thread name is: "+spt1.getName());
        System.out.println("The thread id is: "+spt.getId());
        System.out.println("The thread priority is: "+spt.getPriority());
        // can we change the thread name - YES
        spt.setName("Hari");
        System.out.println("Afer change the thread name: "+spt.getName());
    }
}
