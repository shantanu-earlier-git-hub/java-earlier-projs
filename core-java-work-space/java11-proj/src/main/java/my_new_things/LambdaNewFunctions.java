package my_new_things;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaNewFunctions {

    public static void main(String[] args) {

        String[] strValues = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        Add addInterface = new Add() {
            @Override
            public Number add(Number num1, Number num2) {
                return (num1.doubleValue() + num2.doubleValue());
            }
        };

        System.out.println("addInterface.add(200,300) = " + addInterface.add(200, 300));

        BiFunction<Number, Number, Number> addFunction = (num1, num2) -> {
            return num1.doubleValue() + num2.doubleValue();
        };
        Double result = (Double) addFunction.apply(100, 200);

        System.out.println("result = " + result);


        Function<Integer, String> getString = num -> {
            return strValues[num];
        };

        System.out.println("getString.apply(1) = " + getString.apply(1));

    }


}


@FunctionalInterface
interface Add {

    public Number add(Number num1, Number num2);
}
