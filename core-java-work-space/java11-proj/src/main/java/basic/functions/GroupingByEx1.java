package basic.functions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupingByEx1 {


    public static void main(String[] args) {
        groupingBy();
    }


    private static void groupingBy() {

        List<String> strList = Arrays.asList("a", "bb", "ccc", "dd");

//        Map<Integer, List<String>> groupByMap = strList
//                .stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println("groupByMap = " + groupByMap);


//        Map<Integer, TreeSet<String>> groupByMap = strList
//                .stream()
//                .collect(Collectors.groupingBy(String::length, Collectors.toCollection(TreeSet::new)));
//        System.out.println("groupByMap = " + groupByMap);


        Map<Integer, Long> groupByMap = strList
                .stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println("groupByMap = " + groupByMap);


    }

}
