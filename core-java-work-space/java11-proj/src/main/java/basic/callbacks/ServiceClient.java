package basic.callbacks;

public class ServiceClient {


    public static void main(String[] args) {

        Task task = new TaskImpl();
        TaskExecutor taskExecutor = new TaskExecutor(task);
        taskExecutor.executeTask();

    }
}
