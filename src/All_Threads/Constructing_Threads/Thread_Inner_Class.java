package All_Threads.Constructing_Threads;

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
            myThreads[i] = new Thread(new MyThread(i ,("bob" + i)));
            // Starts threads
            myThreads[i].start();
        }
    }

    // An inner class that can be called when creating threads
    public static class MyThread implements Runnable{
        // Setting the number
        private int number;
        // Setting the name
        private String name;

        // Creating a constructor
        public MyThread(int number, String name) {
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

        // running the thread
        public void run(){
            System.out.println("Hello world from " + this.getName() + ", i am thread " + this.getNumber());
        }
    }
}
