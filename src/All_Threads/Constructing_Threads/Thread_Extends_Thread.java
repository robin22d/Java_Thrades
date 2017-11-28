package All_Threads.Constructing_Threads;

/**
 * Created by c1526449 on 23/02/2017.
 */

// extends Thread
public class Thread_Extends_Thread extends Thread {

    // Setting the number
    private int number;

    // Creating thread constructor
    public Thread_Extends_Thread(int number) {
        // Calling the default thread constructor
        super();
        // Adding number to default constructor
        this.number = number;
    }

    // simple getter
    public int getNumber() {
        return number;
    }

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
    }

    // running the thread
    @Override
    public void run(){
        // Gets the name from the default thread class
        System.out.println("Hello world from " + this.getName() + ", i am thread " + this.getNumber());
    }

}
