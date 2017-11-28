package All_Threads.Threads;

import java.lang.*;
import java.lang.Thread;

public class Main extends Thread{

    public static void main(String[] args) {
        // Creating new thread
        Thread[] myThreads = new Thread[5];
        // Looping through 5 time
        for(int i = 0; i < 5; i++){
            // Creating threads
            myThreads[i] = new Thread(new MyThread(i, ("bob"+ i)));
            // Startin threads
            myThreads[i].start();
        }
    }
}
