package basic.threads;

public class FirstThread {


    Runnable r1= new Runnable() {
        @Override
        public void run() {
            System.out.println(" running");

        }
    };


    Runnable r2= new Runnable() {
        @Override
        public void run() {
            System.out.println("walking");

        }
    };

    public static void main(String[] args) {
        Thread t1 = null;
        try {
            t1 = new Thread(new FirstThread().r1);

            t1.start();
            t1.wait(5000);

            Thread t2 = new Thread(new FirstThread().r2);
            t2.start();

        } catch (Exception e) {
            System.out.println(e);
        } finally {

        }
    }


}
