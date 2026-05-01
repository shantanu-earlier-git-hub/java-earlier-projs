package basics.streams.lambda.examples;

import java.util.List;
import java.util.stream.IntStream;

public class MappingExample {

    //Stream
    // map(Function) Stream -> Stream
    // mapToInt(ToIntFunction) // Stream -> IntStream
    // mapToLong (ToLongFunction)  // Stream -> LongStream
    // mapToDouble (ToDoubleFunction) // Stream -> DoubleStream
    // mapToObject (IntFunction)  IntStream -> Stream

    //IntStream
    // map(ToIntFunction) IntStream -> IntStream
    // mapToLong(ToLongFunction) IntStream -> LongStream
    // mapToDouble (ToDoubleFunction) IntStream -> DoubleStream
    // mapToObj(IntFunction) IntStream -> Stream

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        long count = list.stream()
                .mapToInt(value -> value)
                .count();

        System.out.println(count);

        List<? extends Object> genList = List.of("", 2, 2.3, Double.valueOf(12.23));
        var values = IntStream.range(1, 20);

        values
                .mapToObj(value -> Integer.toBinaryString(value))
                .map(val -> val.length() < 5 ?
                        new StringBuilder("0".repeat(5 - val.length())) + val : val)
                .forEach(System.out::println);

    }
}
