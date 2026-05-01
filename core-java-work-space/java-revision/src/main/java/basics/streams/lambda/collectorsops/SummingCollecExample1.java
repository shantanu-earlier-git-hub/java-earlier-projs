package basics.streams.lambda.collectorsops;

import java.util.List;
import java.util.stream.Collectors;

public class SummingCollecExample1 {

    public static void main(String[] args) {

        List<String> strList = List.of("AAA", "BB", "CCCC", "DD", "EEEEE", "FFFFFF", "GGGG");

        int firstSum1 = strList.stream()
                .mapToInt(str -> str.length())
                .sum();

        System.out.println(firstSum1);


        int firstSum2 = strList.stream()
                .map(str -> str.length())
                .reduce(0, Integer::sum);

        System.out.println(firstSum2);


        long secSum = strList.stream()
                .collect(Collectors.summingLong(str -> str.length()));

        System.out.println(secSum);


    }

}
