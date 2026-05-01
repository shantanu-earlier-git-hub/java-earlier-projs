package basic.collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExamp {

    public static void main(String[] args) {

        //int arr[] = {900,15,234,56,45,10,45,6,1,23,7,-9,-2};

        int arr[] = {4,1,3};

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(new CompareValues());

        for(int i=0; i< arr.length; i++){
            priorityQueue.offer(Integer.valueOf(arr[i]));
        }

        System.out.println("priorityQueue = " + priorityQueue);

        while(!priorityQueue.isEmpty()){
            System.out.println("head value : " + priorityQueue.peek() );
            priorityQueue.poll();
        }
    }
}


class CompareValues implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int val= o1.compareTo(o2);

        if(val > 0) return -1;
        else if(val < 0) return 1;
        else return 0;
    }


}