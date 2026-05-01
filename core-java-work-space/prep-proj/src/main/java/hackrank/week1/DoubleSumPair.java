package hackrank.week1;

import java.util.List;

public class DoubleSumPair {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                long sum = (ar.get(i) + ar.get(j));
                if (sum % k == 0) {
                    ++count;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        int len = list.size();
        int k = 5;
        int value = divisibleSumPairs(len, k, list);
        System.out.println("pairs found -> " + value);
    }


}
