package All_Threads.Try_Catch_Threads.One;

/**
 * Created by c1526449 on 23/02/2017.
 */

// extends Thread
public class Thread_Extends_Thread extends Thread {

    // empty constructor
    public Thread_Extends_Thread(){}

    // creating threads
    public static void main(String [] args){
        Thread_Extends_Thread t = new Thread_Extends_Thread();
        // starting thread
        t.start();

        // Checking whether it can do the operation
        try{
            // Joining thread back to the main thread
            t.join();
            System.out.println("im joining " + t);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    // running the thread
    public void run(){
        System.out.println("I am a thread");
    }
}
