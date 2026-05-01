package basic.parallel;

import java.util.Arrays;
import java.util.List;

public class TestClass {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4);

        nums.parallelStream().forEach( element ->{

            System.out.println( element +  "  " + Thread.currentThread().getName());
        });

    }
}
