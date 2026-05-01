package adv;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;


//BiConsumer
//BiPredicate
//BinaryOperator
//BiFunction
//Function

public class FunClass {




    static void biFunMethod(){
        BiFunction<Integer, Integer, Integer> func1= (num1, num2) -> num1 + num2;
        Function<Integer, String> fun2= result -> "str value " + String.valueOf(result);
        System.out.println("fun2 = " +  func1.andThen(fun2).apply(2,3));
    }

    static void biOpsMethod(){

        BinaryOperator<Integer> op1 = BinaryOperator.maxBy(
                (val1, val2) -> (val1 > val2) ? 1: (val1== val2) ? 0 : -1
        );

        BinaryOperator<Integer> op2 = BinaryOperator.minBy(
                (val1, val2) -> (val1 > val2) ? 1: (val1== val2) ? 0 : -1
        );

        System.out.println("maxBy Value->  " + op1.apply(10,2));
        System.out.println("minBy Value->  " + op2.apply(10,2));
    }


    public static void main(String[] args) throws Exception {

        biOpsMethod();

        //FunClass funClass = new FunClass();

        String  someValue= displayUsingMethodRef(Display.class,
                funPtr-> funPtr.display("hi"));

        System.out.println("someValue = " + someValue);
    }

    private static <T, R> R displayUsingMethodRef(Class<? extends T> anyClass, Function<T, R> anyFunction)
            throws Exception {

        T object = anyClass.getConstructor().newInstance();
        return anyFunction.apply(object);

    }


}
