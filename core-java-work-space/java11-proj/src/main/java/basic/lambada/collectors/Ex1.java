package basic.lambada.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex1 {


    public static void main(String[] args) {
        //toSet();
        partitionBy();
    }

    static void toSet() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        IntStream.of(arr)
                .map(num -> num * 100)
                .filter(num -> num > 200)
                .forEach(num -> System.out.println(" values are " + num));


    }

    static void partitionBy() {

        List<Integer> arrList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOdd =
                arrList.stream()
                        .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        evenOdd.forEach((key, value) -> {
            System.out.println("key:- " + key + " value :- " + value);
        });

    }


}
