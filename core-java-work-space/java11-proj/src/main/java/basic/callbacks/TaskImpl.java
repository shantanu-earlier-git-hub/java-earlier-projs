package basic.callbacks;

public class TaskImpl implements Task{

    @Override
    public void doSomething() {
        System.out.println("Printing something after the event in callBack");
    }
}
