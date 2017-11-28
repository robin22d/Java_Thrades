package All_Threads.Constructing_Threads;

/**
 * Created by c1526449 on 27/02/2017.
 */
public class Thread_Implaments_Runnable implements Runnable {

    // Setting the number
    private int number;
    // Setting the name
    private String name;

    // Creating a constructor
    public Thread_Implaments_Runnable(int number, String name) {
        this.number = number;
        this.name = name;
    }

    // simple getter
    public int getNumber() {
        return number;
    }
    // simple setter
    public void setNumber(int number) {
        this.number = number;
    }
    // simple getter
    public String getName() {
        return name;
    }
    // simple setter
    public void setName(String name) {
        this.name = name;
    }

    // creating threads
    public static void main(String [] args){
        // Create an array of the class
        Thread[] myThreads = new Thread[5];
        // Loops through 5 times
        for(int i = 0; i < 5; i++){
            // Create threads using the class
                                                // need to give the instance of the class parameters
            myThreads[i] = new Thread(new Thread_Implaments_Runnable(i ,("bob" + i)));
            // Starts threads
            myThreads[i].start();
        }
    }

    // running the thread
    public void run(){
        // Can get the peramiters from the thread and print them
        System.out.println("Hello world from " + this.getName() + ", i am thread " + this.getNumber());
    }

}
