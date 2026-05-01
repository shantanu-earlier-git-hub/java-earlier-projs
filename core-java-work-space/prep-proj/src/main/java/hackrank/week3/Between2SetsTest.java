package hackrank.week3;

import java.util.List;

public class Between2SetsTest {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        return 0;
    }

    public static void main(String[] args) {
//        2 6
//        24 36
//
//        2 4
//        16 32 96

        List<Integer> list1 = List.of(2,6);
        List<Integer> list11 = List.of(24,36);

        getTotalX(list1, list11);


        List<Integer> list2 = List.of(2,4);
        List<Integer> list21 = List.of(16, 32,96);

        getTotalX(list2, list21);


    }
}
