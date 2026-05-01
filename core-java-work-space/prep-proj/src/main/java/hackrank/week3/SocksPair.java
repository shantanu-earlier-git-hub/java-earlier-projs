package hackrank.week3;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SocksPair {


    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer, Integer> pairs = ar.stream()
                .collect(Collectors.toMap(
                        Function.identity(),
                        num -> num,
                        (num1, num2) -> num1 + num2 ));

        int pairCount = 0;

        for (Integer item : pairs.keySet()) {
           // System.out.println("key -> " + item + " value -> " + pairs.get(item));
            int totalNoCount = pairs.get(item) / item;

            //System.out.println("totalNoCount ->" + totalNoCount);

            int pair = totalNoCount / 2;

            //System.out.println("pair ->" + pair);

            pairCount += pair;

        }

       // System.out.println("pairCount ->" + pairCount);

        return pairCount;
    }

    public static void main(String[] args) {

        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        System.out.println(sockMerchant(ar.size(), ar));

    }
}
