package adv_java_course.lambdas;

public class NumberUtil {

    public NumberUtil(){

    }
    public NumberUtil(Integer num){
        num =0;
    }

    public void oddEven(Integer num ){

        if(num % 2 == 0 )
            System.out.println(num + " is even ");
        else
            System.out.println(num + " is odd ");
    }
}
