package Locks;

/**
 * Created by c1526449 on 02/03/2017.
 */
import java.util.concurrent.atomic.AtomicInteger;

public class C1_Locks implements Runnable {

    private static AtomicInteger l1 = new AtomicInteger(0);
    private static long danger = 0;
    int method = 0;
    int m = 0;


    public C1_Locks(int m) { this.method = m; }

    public static void main(String[] args) {

        Thread t1 = new Thread(new C1_Locks(1));
        Thread t2 = new Thread(new C1_Locks(2));
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            if (method == 1) {
                while(l1.getAndSet(1) == 1);
                work(1, 1000);
                l1.set(0);
            } else {
                while(l1.getAndSet(1) ==1);
                work(2, 100);
                l1.set(0);
            }
            System.out.println(i);
        }
    }

    private void work(int method, int x) {
        System.out.println(method +", "+m);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 10000; j++) {
                m++;
            }
        }
        System.out.println(method +", "+m);
        m=0;
    }


}
