package basic.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WildCardClass {


    private static Double sum(Collection<? super Number> numCollection){
        Double sum = numCollection
                .stream()
                .mapToDouble(num -> Double.parseDouble(String.valueOf(num))).sum();

    return sum;
    }



    public static void main(String[] args) {

        List<? super Number> numsList = new ArrayList<>();

        numsList.add(10.00f);
        numsList.add(100);
        numsList.add(100.234d);

        numsList.stream().forEach(System.out::println);

        System.out.println("numsList sum = " + sum(numsList));
    }
}
