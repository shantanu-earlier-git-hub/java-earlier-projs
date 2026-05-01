package basics.threads.wait_notify;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (Example1.buket) {
                    if (!Example1.buket.isEmpty()) {
                        int n = Example1.buket.get(0);
                        Example1.buket.remove(0);
                        Example1.buket.notifyAll();
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " removed value " + n + " from the bucket");
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
