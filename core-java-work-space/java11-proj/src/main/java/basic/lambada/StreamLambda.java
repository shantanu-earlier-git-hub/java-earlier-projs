package basic.lambada;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class StreamLambda {


    private static void meanMedian() {

        // -9 1 2 4 5 10 100
        //List<Integer> values = Arrays.asList(2, 10, 4, 5, 1, -9, 100);

        // -9 1 2 4 10 100
        List<Integer> values = Arrays.asList(2, 10, 4, 1, -9, 100);


        int n = values.size();
        int middle = n / 2;
        int value1, value2 = 0;
        int median = 0;

        int[] arr = (values.stream().sorted()).mapToInt(i -> i).toArray();

        if ((n % 2) == 0) {
            value1 = arr[middle];
            value2 = arr[middle + 1];

            median = (value1 + value2) / 2;

        } else {
            median = arr[middle];
        }
        System.out.println("median = " + median);
    }

    private static void reverse() {

        List<Integer> values = Arrays.asList(2, 10, 4, 5, 1, -9, 100);

        int d = values.size() / 2;

        values
                .stream()
                .sorted(Comparator.reverseOrder())
                .filter(index -> index < d + 1)
                .forEach(System.out::println);
    }

    private static void compareLimitCount() {

        List<Integer> values = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        int n = values.size();
        int notifyCount = 0;
        int d = 2;


        for (int i = 1; d + i <= n; i++) {

            int finalI = i;
            AtomicInteger newInt = new AtomicInteger();

            values
                    .stream()
                    .sorted().filter(index -> newInt.incrementAndGet() < d + finalI)
                    .forEach(System.out::println);

            System.out.println(" ");

            ArrayList<Integer> prvList = new ArrayList<Integer>();
            System.out.println(values
                    .parallelStream()
                    .sorted()
                    .reduce(0, (a, b) -> a.compareTo(b))
                    .toString()
            );
        }
    }

    private static void twoDArray() {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("arr = " + arr[i][j]);
            }
        }

        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            System.out.println("arr diagonal= " + arr[i][j]);
        }

        for (int i = 2, j = 2; i >= 0 && j >= 0; i--, j--) {
            System.out.println("arr reverse diagonal = " + arr[i][j]);
        }

        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.println("arr reverse= " + arr[i][j]);
            }
        }

        int k = 0, l = 0;
        for (int i = 0, j = 0; i < 3; i++) {

            if (i <= 2 && j == 0) {
                System.out.println("all rows first col= " + arr[i][j]);
                if (i == 2) {
                    j = -1;
                    i = 0;
                    k = 1;
                }
            }
            if (i <= 2 && k == 1) {
                System.out.println("all rows sec col= " + arr[i][k]);
                if (i == 2) {
                    k = -1;
                    i = 0;
                    l = 2;
                }
            }

            if (i <= 2 && l == 2) {
                System.out.println("all rows third col= " + arr[i][l]);
                if (i == 2) {
                    l = -1;
                    i = 0;
                }
            }
        }


    }


    public static void main(String[] args) {
        //meanMedian();
        //reverse();
        //compareLimitCount();

        twoDArray();
    }
}
