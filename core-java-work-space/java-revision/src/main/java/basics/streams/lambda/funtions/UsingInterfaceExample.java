package basics.streams.lambda.funtions;


@FunctionalInterface
interface MathOperation {

    Number multiply(Number value1, Number value2);
}


public class UsingInterfaceExample {

    public static void main(String[] args) {

        MathOperation mathOperation = (value1, value2) -> ((double) value1 * (double) value2);

        System.out.println(mathOperation.multiply(123.23, 345.45));

    }

}
