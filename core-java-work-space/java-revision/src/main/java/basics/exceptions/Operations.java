package basics.exceptions;

public class Operations implements AutoCloseable {


    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public void close() throws ArithmeticException {

    }
}
