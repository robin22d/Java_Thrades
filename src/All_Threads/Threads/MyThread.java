package All_Threads.Threads;

/**
 * Created by c1526449 on 21/02/2017.
 */
public class MyThread implements Runnable{

    // Creating thread

    // Setting the number
    private int number;
    // Setting the name
    private String name;

    // Creating a constructor
    public MyThread (int number, String name) {
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

    @Override
    public void run() {
        System.out.println("Hello world from " + this.getName() + ", i am thread " + this.getNumber());

    }
}
