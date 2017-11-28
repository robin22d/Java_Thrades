package All_Threads.One_Thread;

/**
 * Created by c1526449 on 27/02/2017.
 */
public class Thread_Inner_Class {

    public static void main(String[] args){
        // use Thread rather than the class name
        Thread t = new Thread(new MyThread());
        // starting thread
        t.start();
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
