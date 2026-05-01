package basic.functions;

import java.util.function.BiPredicate;

public class BiPredicateImpl {


    public static void main(String[] args) {

        BiPredicate<Double , Double> biPredicate= (x, y) -> ( (x + y) % 3 ==0);

        System.out.println("biPredicate.test(30,30) = " + biPredicate.test(30d,30d));



    }
}
