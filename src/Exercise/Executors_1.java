package Exercise;

import java.util.concurrent.Executor;

/**
 * Created by c1526449 on 02/03/2017.
 */
public class Executors_1 {
        String bob;
    public static void main(String[] args) {
        Executor e = new ExecutorImplementation();
        for (int i = 0; i < 200; i++) {
            e.execute(new MyRunnable(i, bob));
        }
    }

    private static class ExecutorImplementation implements Executor {
        public void execute(Runnable r) {
            new Thread(r).start();
        }
    }


    private static class MyRunnable implements Runnable(String jim) {

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
