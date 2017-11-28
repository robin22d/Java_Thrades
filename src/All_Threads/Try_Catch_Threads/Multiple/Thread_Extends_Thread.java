package All_Threads.Try_Catch_Threads.Multiple;

/**
 * Created by c1526449 on 23/02/2017.
 */

// extends Thread
public class Thread_Extends_Thread extends Thread {

    // empty constructor
    public Thread_Extends_Thread(){}

    // creating threads
    public static void main(String [] args){
        // Create an array of the class
        Thread_Extends_Thread[] myThreads = new Thread_Extends_Thread[5];
        // Loops through 5 times
        for(int i = 0; i < 5; i++){
            // Create threads
            myThreads[i] = new Thread_Extends_Thread();
            // Starts threads
            myThreads[i].start();
        }

        // Loops through 5 times
        for(int i = 0; i < 5; i++){
            try{
                // Joining the thread back to the main thread
                myThreads[i].join();
                System.out.println("im joining " + myThreads[i]);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    // running the thread
    public void run(){
        System.out.println("I am a thread");
    }
}
