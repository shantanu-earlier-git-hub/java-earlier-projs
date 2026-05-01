package adv_java_course.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new RunnableThread());
        executorService.submit( () -> {
            System.out.println("Hello world from runnable executor service");
        });

        executorService.shutdown();
    }
}
