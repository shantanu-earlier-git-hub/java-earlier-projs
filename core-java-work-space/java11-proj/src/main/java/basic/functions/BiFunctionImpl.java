package basic.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionImpl {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Long> biFunction1=  (num1, num2 ) -> (long) (num1 * num2);   ;

        System.out.println("biFunction1 = " + biFunction1.apply(20,300));

        Function<Long, String> func1=  (value) -> String.valueOf(value);

        System.out.println("biFunction1 and then  = " + biFunction1.andThen(func1).apply(10,20));


        //Function<String, Long> f1= (num) -> (long)Integer.parseInt(num) *100;



    }


}
