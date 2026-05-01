package generics;

import java.util.Arrays;
import java.util.List;

public class GenericsEx1 {


    static void displayValues(List<? extends Number> someList){
        someList.forEach(System.out::println);
    }


    public static void main(String[] args) {

        List<Integer> intValues = Arrays.asList(1,2,3,4,5,6,7);
        List<Double> doubleValues = Arrays.asList(1.00d,2.23d,3.44d,4.34d,5.43d,6.67d,7.56d);

        displayValues(intValues);
        displayValues(doubleValues);
    }


}
