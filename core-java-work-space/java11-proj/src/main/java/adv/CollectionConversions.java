package adv;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CollectionConversions {


    static void stringLocaleList() {


        Stream.of(Locale.getISOCountries())
                .collect(Collectors.toList())
                .stream()
                .filter(loc -> loc.contains("K"))
                .limit(5)
                .forEach(System.out::println);
    }





    static void listToMap() {


        //List<Integer> list = IntStream.range(0,10).boxed().collect(Collectors.toList());

        Map<String, Integer> listMap = IntStream
                .range(0, 10)
                .mapToObj(num -> num)
                .collect(Collectors.toMap(String::valueOf, Function.identity(), (e1, e2) -> e2,
                        HashMap::new));

        System.out.println("listMap = " + listMap);

    }


    static void convertNumberStreamToList() {

/*
        List<Long> longList= LongStream
                                .rangeClosed(0,10)
                                .mapToObj(num -> num)
                .collect(Collectors.toList());
*/

        List<Long> longList = LongStream
                .rangeClosed(0, 10)
                .collect(ArrayList::new, List::add, List::addAll);

        longList.forEach(System.out::println);
    }


    public static void main(String[] args) {

        //convertNumberStreamToList();
        listToMap();
        //stringLocaleList();
    }
}
