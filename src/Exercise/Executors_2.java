package Exercise;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by c1526449 on 05/03/2017.
 */
public class Executors_2 {
    int[] MyArray = new int[5];


    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 200; i++) {
                pool.execute(new MyRunnable(i));

        }
        //pool.shutdownNow();
        pool.shutdown();
    }


    private static class MyRunnable implements Runnable {

        private int number;
        // Constructor
        public MyRunnable(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void run(){
            System.out.println("Hello world from: " + getNumber());

        }
    }
}
