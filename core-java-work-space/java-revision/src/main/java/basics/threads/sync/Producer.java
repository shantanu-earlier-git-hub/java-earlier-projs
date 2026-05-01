package basics.threads.sync;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {

        Random random = new Random();

        while(true) {
            synchronized (Example1.buket) {
                if (Example1.buket.size() < 10) {
                    int n = random.nextInt(1000);
                    Example1.buket.add(n); //[0, 999]
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException ie){
                        System.out.println(" producer exception" + ie );
                    }
                    System.out.println(Thread.currentThread().getName() + " added value " + n + " in to the bucket");
                }
            }
        }

    }
}
