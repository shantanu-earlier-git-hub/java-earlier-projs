package basics.threads.simple;

public class EvenNumThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i = i + 2) {
            try {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}
