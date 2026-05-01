package basics.streams.lambda.funtions;

import java.util.List;
import java.util.Random;
import java.util.function.*;

public class FunctionExample1 {
    /*
        Function
        BiFunction
        Supplier
        Consumer
        BiConsumer
        UnaryOperator
        BinaryOperator
        Predicate
        BiPredicate
     */

    public static void main(String[] args) {

        // consumer
        Consumer<Number> consumer = (value) -> System.out.println(value);
        consumer.accept(100);

        // supplier
        Supplier<? extends Number> supplier = () -> new Random(10).nextDouble();
        System.out.println(supplier.get());

        //BiFunction -> andThen with Function.
        BiFunction<Double, Double, Double> multi = (val1, val2) -> val1 * val2;
        Function<Double, Long> func = d -> d.longValue();
        System.out.println(multi.andThen(func).apply(123.45, 56.78));

        //BiConsumer
        BiConsumer<String, Integer> nameAge = (name, age) -> System.out.println("my name is " + name + " age is " + age);
        nameAge.accept("shan", 46);

        //Predicate
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Predicate<Integer> evenPredicate = num -> num % 2 == 0;
        Predicate<Integer> greaterThan5 = num -> num > 5;
        intList.stream().filter(evenPredicate).forEach(System.out::print);
        intList.stream().filter(greaterThan5).forEach(System.out::print);

        // BiPredicate
        System.out.println();
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2 ? true : num1 == num2 ? true : false;
        System.out.println("bi predicate -> " + biPredicate.test(1000, 1000));

        //BinaryOperator
        System.out.println();
        BinaryOperator<Integer> addTwo = (num1, num2) -> num1 + num2;
        System.out.println(addTwo.apply(100, 200));

        //UnaryOperator
        UnaryOperator<Integer> nextInt = num -> ++num;
        System.out.println(nextInt.apply(200));

        // Boolean Supplier
        BooleanSupplier booleanSupplier = () -> Boolean.TRUE;
        booleanSupplier.getAsBoolean();

        // different Consumers
        LongConsumer longLongConsumer = (value) -> System.out.println(value * 100);
        longLongConsumer.accept(290);

        DoubleConsumer doubleConsumer = value -> System.out.println(value * 100);
        doubleConsumer.accept(290.78);


        // Functions
        Function<Integer, Integer> add10Later = val -> val + 10;
        Function<Integer, Integer> multiply = val -> val * 4;
        add10Later = add10Later.compose(multiply);
        System.out.println("composed func " + add10Later.apply(200));

        // String Functions


    }
}
