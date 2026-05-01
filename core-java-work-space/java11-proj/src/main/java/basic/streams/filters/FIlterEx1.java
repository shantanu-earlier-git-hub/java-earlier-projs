package basic.streams.filters;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FIlterEx1 {


    public static void main(String[] args) {

        Predicate<String> firstCondition = str -> str.toLowerCase().contains("a");
        Predicate<String> secondCondition = str -> str.length() < 2;

        Stream.of(args)
                .filter( firstCondition.and(secondCondition.negate()))
                .forEach( System.out::println)
                ;
   }
}
