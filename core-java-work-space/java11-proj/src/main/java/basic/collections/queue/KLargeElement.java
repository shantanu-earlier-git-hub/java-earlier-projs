package basic.collections.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KLargeElement {

    private static void getKthElement(List<Integer> nums, int k ){
        Collections.sort(nums,new CompareInt());
        System.out.println("kth largest element : " + nums.get(k-1));

    }

    public static void main(String[] args) {

        int k= 4;
        List<Integer> nums= Arrays.asList(3,2,3,1,2,4,5,5,6);

        getKthElement(nums, k);

    }
}

class CompareInt implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int val= o1.compareTo(o2);

        if(val > 0) return -1;
        else if(val < 0) return 1;
        else return 0;
    }


}