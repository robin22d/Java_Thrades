package All_Threads.Multiple_Threads;

/**
 * Created by c1526449 on 27/02/2017.
 */
public class Thread_Inner_Class {

    public static void main(String[] args){
        // Create an array of the class
        Thread[] myThreads = new Thread[5];
        // Loops through 5 times
        for(int i = 0; i < 5; i++){
            // Create threads using the class
            myThreads[i] = new Thread(new MyThread());
            // Starts threads
            myThreads[i].start();
        }
    }

    // An inner class that can be called when creating threads
    public static class MyThread implements Runnable{
        // empty constructor
        public MyThread(){}

        // running the thread
        public void run(){
            System.out.println("I am a thread");
        }
    }
}
