package basics.threads.runnable;

public class Example1 {


    public static void main(String[] args) {

        OddNumThread odd = new OddNumThread();

        Thread t1= new Thread(odd, " T1 "); // new

        t1.start();// runnable

        System.out.println(" End!  " + Thread.currentThread().getName());
    }
}
