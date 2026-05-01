package adv;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Range {


    static void listToEnum() {
        Enumeration<String> days = Collections.enumeration(Arrays.asList("Monday", "TuesDay"));

        while (days.hasMoreElements())
            System.out.println("days.nextElement() = " + days.nextElement());
    }

    static void enumToList() {

        Enumeration<String> days = Collections.enumeration(Arrays.asList("Monday", "TuesDay"));
        List<String> daysList = Collections.list(days);
        daysList.forEach(System.out::println);

    }

    static void checkedLists() {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4).stream().collect(Collectors.toList());
        List<Integer> checkedList = Collections.checkedList(intList, Integer.class);
    }




    public static void main(String[] args) {

        Stream<Double> dStream = List.of
                        (1.00d, 2.00d, 3.00d, 4.00d)
                .stream();


        double avg = dStream.collect(Collectors.averagingDouble(d -> d.doubleValue()));
        System.out.println("avarage = " + avg);

        double sum = List.of
                        (1.00d, 2.00d, 3.00d, 4.00d)
                .stream()
                .reduce(0.00d, (d1, d2) -> d1 + d2);
        System.out.println("sum = " + sum);


    }

}



