package hackrank.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
        Tested for following test cases...

2
5
5
2 3 5 1 4
3 2 6 4 1

 */


public class ZigZagElements {



    private static void findZigZag(int[] lens, List<List<Integer>> arr) {

        for(List list : arr){

            int k = (list.size() + 1 ) / 2 ;
            List<Integer> kList = new ArrayList<>();
            kList.addAll(list.subList(k, list.size()));
            kList.addAll(list.subList(0,k).reversed());

            System.out.println(kList);
        }
    }


    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int testCases = Integer.valueOf(bufferedReader.readLine());
            int[] arrLen = new int[testCases];

            List<List<Integer>> arrList = new ArrayList<>();
            List<Integer> inputList = new ArrayList<>();

            for (int i = 0; i < testCases; i++) {
                arrLen[i] = Integer.valueOf(bufferedReader.readLine());
            }
            for (int i = 0; i < arrLen.length; i++) {
                inputList =
                        Arrays.stream(bufferedReader.readLine().split(" "))
                                .mapToInt(str -> Integer.parseInt(str))
                                .boxed()
                                .collect(Collectors.toList());
//                System.out.println(inputList);
                arrList.add(inputList);
            }
            findZigZag(arrLen, arrList);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
