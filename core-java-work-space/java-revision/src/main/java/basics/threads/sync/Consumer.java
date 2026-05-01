package basics.threads.sync;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while(true) {
            synchronized (Example1.buket) {
                if (!Example1.buket.isEmpty()) {
                    int n = Example1.buket.get(0);
                    Example1.buket.remove(0);
                    try{
                        Thread.sleep(500);
                    }catch(InterruptedException ie){
                        System.out.println(" consumer  exception" + ie );
                    }
                    System.out.println(Thread.currentThread().getName() + " removed value " + n + " from the bucket");
                }
            }
        }
    }
}
