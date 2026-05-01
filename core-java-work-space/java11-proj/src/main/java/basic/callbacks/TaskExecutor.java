package basic.callbacks;


import lombok.NoArgsConstructor;

@NoArgsConstructor

public class TaskExecutor {

    private Task registeredTask;

    public TaskExecutor(Task registeredTask) {
        this.registeredTask = registeredTask;
    }

    public void executeTask(){

        System.out.println("doing something before calling the callback");

        new Thread(new Runnable() {
            @Override
            public void run() {
                registeredTask.doSomething();
            }
        }).start();
    }



}
