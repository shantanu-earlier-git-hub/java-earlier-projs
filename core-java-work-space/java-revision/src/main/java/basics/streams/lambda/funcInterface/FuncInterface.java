package basics.streams.lambda.funcInterface;

@FunctionalInterface
public interface FuncInterface {

    default void someOtherFunctionality(Boolean flag) {
        if (flag) callForSomeOtherFunction(flag);
    }

    private void callForSomeOtherFunction(Boolean flag) {
        System.out.println(" called " + flag);
    }


    String returnString();
}
