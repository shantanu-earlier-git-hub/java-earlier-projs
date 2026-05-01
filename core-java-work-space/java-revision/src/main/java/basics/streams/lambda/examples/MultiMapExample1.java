package basics.streams.lambda.examples;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.List.of;

public class MultiMapExample1 {

    private static void multiMapUsingFlatMap() {
        var list1 = of(of(1), of(2, 3), of());
        var listArr = asList(asList(1, 2, 3, 4, 5), asList(100, 200, 300), asList(300, 700));
        Random random = new Random();
        random.setSeed(9999897);
        double r = Math.abs(random.nextInt());

        System.out.println("r = " + r);

        var newList = list1.stream().flatMap(Collection::stream).toList();

        var map1 = Map.of("1", Arrays.asList(1, 2, 3));
        var map2 = Map.of("2", Arrays.asList(200, 300, 400));
        var map3 = Map.of("3", Arrays.asList(22.3 * r, 35.678 * r, 412.23 * r));
        var map4 = Map.of("4", Arrays.asList(101 * r, 202 * r, 303 * r));


        var mapValues = Map.of("1", map1, "2", map2, "3", map3, "4", map4);

        //newList.stream().forEach(System.out::println);

        //listArr.stream().flatMap(e -> e.stream()).distinct().forEach(System.out::println);
        NumberFormat numberFormat = new DecimalFormat("0");

        List<Double> doubleList = Stream.of(mapValues)
                .flatMap(entries -> entries.values().stream())
                .flatMap(entries -> entries.values().stream())
                .flatMap(entries -> entries.stream())
                .mapToDouble(val -> ((Number) val).doubleValue())
                .boxed()
                .map(num -> Double.parseDouble(numberFormat.format(num * r)))
                .distinct()
                .collect(Collectors.toList());

        doubleList.stream().forEach(System.out::println);

    }

    private static void usingMapMulti() {
        var lists = of(of(1), of(2, 3), List.<Integer>of());

        //List<List<Integer>> listOfList = of(of(1), of(2, 3), List.<Integer>of());

        lists.stream()
                .mapMulti((list, consumer) -> list.forEach(consumer))
                .forEach(System.out::println);

    }


    public static void main(String[] args) {

        var values = Stream.of(42, null, 100)
                .filter(num -> num != null)
                .collect(Collectors.toUnmodifiableList());

        values.stream().forEach(System.out::println);

    }
}
