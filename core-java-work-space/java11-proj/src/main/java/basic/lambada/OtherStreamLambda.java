package basic.lambada;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class OtherStreamLambda {


    private static void getCollections(){


    }

    private static void mathFunctions(){

    }

    private static void func4Arrays(){

        List<Integer> collectList= Arrays.asList(10,20,30,40,50,60,70,80,90);

        // System.out.println( Arrays.stream(collectList.stream().mapToInt(i->i).toArray()).sum());
        //System.out.println("sum  = " + collectList.stream().mapToInt(i -> i).sum());

        OptionalDouble avg =collectList.stream()
                .mapToInt(i->i)
                .average();

        System.out.println("average =  " + avg.getAsDouble());

        OptionalInt max = collectList.stream()
                .mapToInt(i->i)
                .max();
        System.out.println("max = " + max.getAsInt());


        collectList.stream()
                .filter(i -> {
                     return i > 60;
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }







    public static void main(String[] args) {
        func4Arrays();
    }
}
