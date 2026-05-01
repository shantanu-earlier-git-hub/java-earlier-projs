package basics.threads.runnable;

public class OddNumThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i = i + 2) {
            try {
                Thread.sleep(1000);
                System.out.println(i + "" + Thread.currentThread().getName());
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
