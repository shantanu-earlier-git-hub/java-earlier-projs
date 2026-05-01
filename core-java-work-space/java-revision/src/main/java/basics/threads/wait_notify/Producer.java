package basics.threads.wait_notify;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {

        Random random = new Random();

        try {
            while (true) {
                synchronized (Example1.buket) {
                    if (Example1.buket.size() < 10) {
                        int n = random.nextInt(1000);
                        Example1.buket.add(n); //[0, 999]
                        Example1.buket.notifyAll();
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " added value " + n + " in to the bucket");
                    } else {
                        Example1.buket.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}