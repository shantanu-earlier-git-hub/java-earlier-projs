package basics.streams.lambda.collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PartitionCollectorExample1 {


    public static void main(String[] args) {


        List<String> strList = List.of("AAA", "BB", "AAA", "BB", "CCCCC", "FFFFFF", "GGGGGGGGG");

        Map<Boolean, List<String>> map1 =
                strList.stream()
                        .collect(
                                partitioningBy
                                        (str -> str.length() > 2));

        System.out.println(map1);


        Map<Boolean, Set<String>> map2 =
                strList
                        .stream()
                        .collect(partitioningBy(
                                str -> str.length() > 2,
                                Collectors.toSet()
                        ));

        System.out.println(map2);


        Map<Boolean, String> map3 =
                strList
                        .stream()
                        .collect(partitioningBy(
                                str -> str.length() % 2 == 0,
                                joining("->")));

        System.out.println(map3);

        Map<Boolean, String> map4 =
                strList
                        .stream()
                        .collect(partitioningBy(
                                str -> str.length() % 2 == 0,
                                mapping(
                                        val -> String.valueOf(val.length()),
                                        joining("->")
                                )));

        System.out.println(map4);


    }
}
