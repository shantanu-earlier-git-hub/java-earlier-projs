package basics.optionals;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx6 {


    public static void main(String[] args) {

        //Optional<List<Integer>> listOps = Optional.of(List.of(10, 20, 30, 40));

        Stream<Integer> s2 = Stream.of(10, 20, 30);
        Stream<Integer> s3 = Stream.of(10, 20, 30);
        ;

        Optional<Integer> minValue = s2.min(Comparator.comparingInt(num -> num));
        minValue.ifPresent(System.out::println);


        Optional<Integer> max =
                s3.max(Comparator.comparingInt(n -> n));

        max.ifPresent(System.out::println);


    }

}
