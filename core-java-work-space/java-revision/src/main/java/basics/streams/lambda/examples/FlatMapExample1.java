package basics.streams.lambda.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExample1 {


    private static void intFlatMapEx() {
        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4, 5, 6),
                List.of(1, 2, 3, 4, 5),
                List.of(1, 3, 4)
        );

        long sum1 = list.stream()
                .peek(System.out::println)
                //.flatMapToInt(l -> l.stream().mapToInt(v-> v))
                .flatMap(l -> l.stream())
                .peek(System.out::println)
                .mapToInt(v -> v)
                .sum();
    }

    public static void main(String[] args) {

        List<String> list = List.of("jdh73jjj", "78sjsj9", "65sjs7sjs8");
        // digits 2+3 + 4 = 9

        var digits = "0123456789";

        var count = list.stream() // "jdh73jjj", "78sjsj9", "65sjs7sjs8"
                .flatMap(val -> Arrays.stream(val.split(""))) // "j", "d", "h", "7", "3"....
                .filter(o -> digits.contains(o))
                .count();

        System.out.println(count);


        List<Character[]> charsList = Arrays.asList(new Character[]{'1', '2', 'e'}, new Character[]{'a', 'b', '3'});

        long count1 = charsList.stream()
                .flatMap(element -> Arrays.stream(element))
                .filter(ch -> Character.isDigit((char) ch))
                .count();

        System.out.println(count1);


        System.out.println();

        long counts = list
                .stream()
                .map(FlatMapExample1::getCharList)
                .flatMap(charsList1 -> charsList1.stream())
                .filter(ch -> Character.isDigit(ch))
                .mapToInt(ch -> ch)
                .count();

        System.out.println(counts);

    }

    private static List<Character> getCharList(String str) {
        List<Character> list1 = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list1.add(c);
        }
        return list1;
    }
}
