package All_Threads.Try_Catch_Threads.One;

/**
 * Created by c1526449 on 27/02/2017.
 */
public class Thread_Implaments_Runnable implements Runnable {

    // empty constructor
    public Thread_Implaments_Runnable(){}

    // creating threads
    public static void main(String [] args){
        // use Thread rather than the class name
        Thread t = new Thread();
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
