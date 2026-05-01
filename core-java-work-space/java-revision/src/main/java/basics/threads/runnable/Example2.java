package basics.threads.runnable;

public class Example2 {


    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 1; i <= 20; i = i + 2) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i + "" + Thread.currentThread().getName());
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        };

        Thread t1 = new Thread(r1, "T1");
        Thread t2 = new Thread(r1, "T2");

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (InterruptedException ie){}


        System.out.println("End! " + Thread.currentThread().getName());
    }

}
