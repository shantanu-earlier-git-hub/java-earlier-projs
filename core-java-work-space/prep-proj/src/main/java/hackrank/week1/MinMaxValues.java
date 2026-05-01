package hackrank.week1;

import java.math.BigInteger;
import java.util.List;

public class MinMaxValues {

    public static void miniMaxSum(List<Integer> arr) {

        BigInteger bigSum = BigInteger.valueOf( arr
                .stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .reduce(0, Integer::sum));


        BigInteger maxSum = bigSum.subtract(BigInteger.valueOf(arr.get(0)));
        BigInteger minSum = bigSum.subtract(BigInteger.valueOf(arr.get(arr.size() - 1)));

        System.out.println(minSum + " " + maxSum);

    }

    public static void main(String[] args) {

        List<Integer> list= List.of(793810624, 895642170, 685903712, 623789054, 468592370);
        //List<Integer> list = List.of(1, 3, 5, 7, 9);
        miniMaxSum(list);

    }

}
