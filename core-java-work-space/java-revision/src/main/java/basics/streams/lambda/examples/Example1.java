package basics.streams.lambda.examples;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.summingDouble;

public class Example1 {

    public static void main(String[] args) {
        someMethod();
    }

    // shouldn't append/assign/modify/update anything outside the function
    static void someMethod() {

        //y =g(h(f(x)))

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 8, 10);

        // Don't
//        List<Integer> oddList = new ArrayList<>();
//        intList.stream().filter( num -> num % 2 ==1).forEach( odd -> oddList.add(odd));

        // Should be
        List<Integer> oddList = intList
                .stream()
                .filter(num -> num % 2 == 1)
                .toList();


    }


    static void checkIfException() {

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 8, 10);
        List<Integer> oddList = intList
                .stream()
                .filter(num -> filterItDecorator(num))
                .toList();
    }

    static boolean filterIt(int value) throws Exception {
        return (value % 2 == 1);
    }

    static boolean filterItDecorator(int value) {
        boolean res = false;
        try {
            res = filterIt(value);
        } catch (Exception e) {
            // do something
        }
        return res;
    }

    static void checkOptionals() {

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 8, 10);

        Optional<Integer> maxVal =
                intList.stream()
                        .max((o1, o2) -> o1.compareTo(o2));

        Optional<Integer> val1 = intList.stream().max(Integer::compareTo).get().describeConstable();

        Optional<Integer> someValue = Integer.valueOf("100").describeConstable();

    }

    static void findOutMean() {

        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 8, 10);

        double mean = intList.stream()
                .collect(
                        Collectors.teeing(
                                summingDouble(num -> num),
                                counting(), (sum, n) -> sum / n));


    }


}
