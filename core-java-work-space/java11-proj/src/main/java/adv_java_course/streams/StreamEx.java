package adv_java_course.streams;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class StreamEx {


    public static void main(String[] args) {

        List<String> fruits = asList("pineapple", "papaya", "water-mellon", "muskMellon");

        System.out.println(processWithStream(fruits));

    }

    static List<String> processWithStream(List<String> fruits){
        return fruits.stream()
                .map(String::toUpperCase)
                .filter( (fruit) -> fruit.startsWith("P".toUpperCase()))
                .sorted()
                .collect(Collectors.toList());

    }

}
