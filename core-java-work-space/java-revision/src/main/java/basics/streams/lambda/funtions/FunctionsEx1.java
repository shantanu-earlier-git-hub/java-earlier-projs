package basics.streams.lambda.funtions;

import java.util.function.Function;

public class FunctionsEx1 {


    public static void main(String[] args) {

        Function<Integer, Integer> add = number -> number + 1;
        Function<Integer, Integer> doubleIt = number -> number * 2;
        Function<Integer, Integer> subtractIt = number -> number - 2;


        var incrementAndDoubleIt = add.andThen(doubleIt).andThen(subtractIt);

        System.out.println("increment and double it -> " + incrementAndDoubleIt.apply(10));

    }
}
