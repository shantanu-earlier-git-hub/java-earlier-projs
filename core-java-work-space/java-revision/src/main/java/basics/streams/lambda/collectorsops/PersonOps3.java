package basics.streams.lambda.collectorsops;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static basics.streams.lambda.collectorsops.PersonOps2.getPeople;

public class PersonOps3 {


    private static List<Person> getPeopleList() {

        return getPeople();


    }


    public static void main(String[] args) {

        List<Person> list = getPeopleList();


        double res = list.stream()
                .collect(Collectors.averagingDouble(Person::getSalary));

        DoubleSummaryStatistics salarySummary = list.stream()
                .collect(Collectors.summarizingDouble(Person::getSalary));

        DoubleSummaryStatistics ageSummary = list.stream()
                .collect(Collectors.summarizingDouble(Person::getAge));

//        salarySummary.combine(ageSummary);

        System.out.println("avg sal -> " + res);

        System.out.println("salary summary" + salarySummary);
        System.out.println("age summary" + ageSummary);


    }
}
