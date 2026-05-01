package hackrank.week2;

import java.util.List;

public class DiagonalSum {


    public static int diagonalDifference(List<List<Integer>> arr) {

        int start = 0;
        int end = arr.size() - 1;

        int sum1 = 0;
        int sum2 = 0;

        for (List<Integer> list : arr) {
            sum1 += list.get(start);
            sum2 += list.get(end);

            end--;
            start++;
        }

        return   ( ( sum1 - sum2 > 0 ) ? sum1 - sum2  : sum2 - sum1 ) ;
    }

    public static void main(String[] args) {

        List<List<Integer>> matrix = List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9)
        );

        diagonalDifference(matrix);
    }
}
