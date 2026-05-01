package basics.optionals;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReductionsEx1 {


    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(1, 2, 3, 4, 5, 6);

        int sum = s1.reduce(0, Integer::sum);

        s1 = Stream.of(1, 2, 3, 4, 5, 6);

        // OptionalInt , OptionalLong , OptionalDouble
        // mapToInt, mapToLong, mapToDouble
        // average() , reduce(), min(), max() -> primitive streams returns optional

        OptionalInt optionalSum =
                s1
                        .mapToInt(v -> v)
                        .reduce(Integer::sum);

        System.out.println(sum);
        optionalSum.ifPresent(System.out::println); //


        // reducing ....
        s1 = Stream.of(1, 2, 3, 4, 5, 6);

        Optional<Integer> sum1 = s1
                .collect(Collectors.reducing(Integer::sum));

        System.out.println(sum1);

    }
}
