package basics.streams.lambda.collectorsops;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TakeDropOpesEx1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("in", "us", "sri", "", "jpa", "can", "bra");
        List<Integer> list1 = Arrays.asList(4, 4, 4, 4, 4, 4, 66, 1, 6, 6, 9, 9, 9, 9, 8, 8, 8, 10);

        list.stream()
                .takeWhile(str -> !str.equalsIgnoreCase("can"))
                .forEach(System.out::println);

        list.stream()
                .dropWhile(str -> !str.isEmpty())
                .forEach(System.out::println);

        String values = list1.stream()
                .dropWhile(num -> num == 4)
                .distinct()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .map(num -> String.valueOf(num))
                .collect(Collectors.joining(","));

        System.out.println(values);
    }
}
