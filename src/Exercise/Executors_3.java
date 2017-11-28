package Exercise;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by c1526449 on 05/03/2017.
 */
public class Executors_3 {
    static ScheduledExecutorService pool = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) {
        int i = 0;
        final ScheduledFuture<?> cancel = pool.scheduleAtFixedRate(new MyRunnable(i), 2, 2, SECONDS);
        pool.schedule(new Cancel(cancel) , 20, SECONDS);
    }

    private static class Cancel implements Runnable {
        ScheduledFuture<?> cancel;
        public Cancel(ScheduledFuture<?> aCancel){
            cancel = aCancel;
        }
        public void run() {
            System.out.println("ended");
            cancel.cancel(true);
            pool.shutdown();
        }

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
