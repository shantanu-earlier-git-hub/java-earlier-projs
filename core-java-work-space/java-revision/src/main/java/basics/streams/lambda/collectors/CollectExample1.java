package basics.streams.lambda.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExample1 {


    static private long calculate() {
        List<Integer[]> integersList = List.of(
                new Integer[]{1, 2, 3},
                new Integer[]{4, 5, 3, 2, 1},
                new Integer[]{6, 7, 8, 5, 4, 9, 10, 11, 12}
        );

        long sum = integersList.stream()
                .flatMap(arr -> Arrays.stream(arr))
                .reduce(0, (a, b) -> a + b);

        return sum;
    }


    private static void collections() {
        List<Integer> list = List.of(1, 2, 1, 3, 4, 5, 6, 6, 6, 6, 6);

//        Collection<Integer> collection = list.stream()
//                .toList();
//
//        List<Integer> collectionList = list.stream()
//                .toList();
//
//        Set<Integer> collectionSet = list.stream()
//                .collect(Collectors.toSet());
//
//        // specific
//        TreeSet<Integer> treeSet = list.stream()
//                .collect(Collectors.toCollection(TreeSet::new));


        // should have key comparator or comparable
        // merge function decides what to do in case of duplicates...
        // replace , sum do some ops , keep 1st / 2nd etc..
        TreeMap<Integer, Integer> intMap =
                list.stream()
                        .collect(Collectors.toMap(
                                k -> k,
                                v -> v * 10,
                                (a, b) -> a + b,
                                TreeMap::new));
        //System.out.println(intMap);

        List<List<Integer>> lists = List.of(
                List.of(1, 2, 3),
                List.of(10, 20, 30),
                List.of(100, 200, 300)
        );

        Map<String, Integer> valuesMap = lists.stream()
                .flatMap(list2 -> list2.stream())
                .collect(Collectors.toMap(
                        k -> String.valueOf("key" + k),
                        v -> v * new Random().nextInt(100),
                        (v1, v2) -> v2,
                        TreeMap::new
                ));

        System.out.println(valuesMap);
    }


    public static void main(String[] args) {

        List<String> strList = List.of("aaa", "bbb", "abacdea", "xyz");

        String conStr = strList.stream().collect(Collectors.joining(
                ",",
                "{ ",
                " }"
        ));
        System.out.println(conStr);


        List<Object> genList = strList.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.joining("->"),
                (first, second) -> List.of(first, second)
        ));

        System.out.println(genList);


    }
}
