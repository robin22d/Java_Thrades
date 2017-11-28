package All_Threads;

import All_Threads.Try_Catch_Threads.Multiple.Thread_Implaments_Runnable;

import java.util.Random;

/**
 * Created by c1526449 on 02/03/2017.
 */
public class Arrays implements Runnable {

    int[] testArray = new int[1000];
    Random rand = new Random();

    int random = rand.nextInt(100) + 1;

    // empty constructor
    public Arrays(){}

    // creating threads
    public void main(String [] args){
        // Create an array of the class
        Thread[] myThreads = new Thread[2];
        // Loops through 5 times
        for(int i = 0; i < 2; i++){
            // Create threads useing the class
            myThreads[i] = new Thread(new Thread_Implaments_Runnable());
            // Starts threads
            myThreads[i].start();
        }

        // Loops through 5 times
        for(int i = 0; i < 2; i++){
            try{
                for (int ii = 0; ii < (testArray.length/2); i++) {
                    testArray[ii] = (int) (Math.random() * 10);
                }
                // Joining the thread back to the main thread
                myThreads[i].join();
                System.out.println("im joining " + myThreads[i]);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        for (int i = 0; i < (testArray.length/2); i++) {
            testArray[i] = (int) (Math.random() * 10);
        }

        for (int i = (testArray.length/2); i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 10);
        }


//            try{
//
//                // Joining the thread back to the main thread
//                myThreads[i].join();
//                System.out.println("im joining " + myThreads[i]);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
    //    }
    }

    // running the thread
    public void run(){
        System.out.println("I am a thread");


    }

}
