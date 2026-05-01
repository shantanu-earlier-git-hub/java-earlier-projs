package basics.streams.lambda.collectors;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import static java.util.stream.Collectors.*;

public class GroupingCollectorExample1 {


    public static void main(String[] args) {

        List<String> strList = List.of("AAA", "BB", "AAA", "BB", "CCCCC", "FFFFFF", "GGGG");

        // removed duplicates as value is TreeSet
        // key is Integer
        Map<Integer, TreeSet<String>> map1 = strList.stream()
                .collect(
                        groupingBy(
                                str -> str.length(),
                                toCollection(TreeSet::new)
                        ));

        System.out.println(map1);


        Map<Integer, String> map2 = strList.stream()
                .collect(
                        groupingBy(
                                str -> str.length(),
                                mapping(
                                        str -> String.valueOf(str.length()),
                                        joining("/"))
                        ));

        System.out.println(map2);
    }
}
