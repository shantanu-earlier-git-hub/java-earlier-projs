package basic.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class NumSumCost {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        List<Integer> pairs = new ArrayList<Integer>();

        PriorityQueue<Integer> numQueue = new PriorityQueue<>(5);

        for (int i = 0; i < arr.length; i++) {
            numQueue.add(Integer.valueOf(arr[i]));
        }

        while (numQueue.size() > 1) {
            int first = 0;
            int second = 0;
            first = numQueue.poll();
            second = numQueue.poll();
            numQueue.offer((first + second));
            pairs.add(first);
            pairs.add(second);
        }

        int sum = 0;
        for (int num : pairs) {
            sum = sum + num;
        }
        System.out.println("sum = " + sum);


    }
}
