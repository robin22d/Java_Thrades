package All_Threads.One_Thread;

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
    }

    // running the thread
    public void run(){
        System.out.println("I am a thread");
    }
}
