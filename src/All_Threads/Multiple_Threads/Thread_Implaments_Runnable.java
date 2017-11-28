package All_Threads.Multiple_Threads;

/**
 * Created by c1526449 on 27/02/2017.
 */
public class Thread_Implaments_Runnable implements Runnable {

    // empty constructor
    public Thread_Implaments_Runnable(){}

    // creating threads
    public static void main(String [] args){
        // Create an array of the class
        Thread[] myThreads = new Thread[5];
        // Loops through 5 times
        for(int i = 0; i < 5; i++){
            // Create threads useing the class
            myThreads[i] = new Thread(new Thread_Implaments_Runnable());
            // Starts threads
            myThreads[i].start();
        }
    }

    // running the thread
    public void run(){
        System.out.println("I am a thread");
    }

}
