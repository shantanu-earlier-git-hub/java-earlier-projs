package basics.threads.simple;

public class Example1 {

    public static void main(String[] args) {

        EvenNumThread evenNumThread = new EvenNumThread();
        evenNumThread.start();

        System.out.println("The END !" + Thread.currentThread().getName());

    }
}
