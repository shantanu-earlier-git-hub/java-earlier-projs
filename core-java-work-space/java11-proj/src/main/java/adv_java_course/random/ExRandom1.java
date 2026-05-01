package adv_java_course.random;

import java.text.DecimalFormat;
import java.util.random.RandomGeneratorFactory;

public class ExRandom1 {





    static void randomGen(){

        DecimalFormat df= new DecimalFormat(".##");

        RandomGeneratorFactory
                .getDefault()
                .create()
                .doubles(3,100,200)
                .map(d -> Double.valueOf(df.format(d)))
                .forEach(System.out::println);

    }



    public static void main(String[] args) {
    }
}
