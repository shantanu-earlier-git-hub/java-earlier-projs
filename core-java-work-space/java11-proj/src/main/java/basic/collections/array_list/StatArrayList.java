package basic.collections.array_list;

import java.util.DoubleSummaryStatistics;
import java.util.stream.IntStream;

public class StatArrayList {

    public static void main(String[] args) {


        DoubleSummaryStatistics statistics= 
                IntStream.range(0,100)
                        .mapToDouble(d-> Double.valueOf(d))
                        .summaryStatistics();


        System.out.println("statistics = " + statistics);
        
    }
}
