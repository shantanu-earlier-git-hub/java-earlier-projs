package adv_java_course.lambdas;

import java.util.List;

import static java.util.Arrays.asList;

public class MethodRef {


    public static void main(String[] args) {

        List<Integer> nums = asList(1,2,3,4,5,6,7,8);


        nums.forEach(new NumberUtil()::oddEven);
    }

}
