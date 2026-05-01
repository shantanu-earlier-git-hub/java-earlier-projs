package basics.streams.lambda.collectorsops;

import java.util.List;
import java.util.stream.Collectors;

import static basics.streams.lambda.collectorsops.PersonOps2.getPeople;
import static java.util.stream.Collectors.filtering;

public class PersonOps1 {


    private static List<Person> getPeopleList() {
        return getPeople();
    }

    public static void main(String[] args) {

        List<Person> list = getPeopleList();

//        list.stream()
//                .map(Person::getName)
//                .filter(name -> name.startsWith("M"))
//                .forEach(System.out::println);


        double totalSalary = list.stream().mapToDouble(Person::getSalary).sum();

        System.out.println("total salary -> " + totalSalary);

        double avgSalary = list.stream()
                .collect(Collectors.averagingDouble(Person::getSalary));

        System.out.println("avg salary -> " + avgSalary);


        List<String> genderList =
                list.stream()
                        .map(Person::getGender)
                        .filter(gender -> gender == "M")
                        .toList();

        System.out.println("Male" + genderList);

        List<String> genderList1 =
                list.stream()
                        .map(Person::getGender)
                        .collect(filtering(gender -> gender.equalsIgnoreCase("m"),
                                Collectors.toList()));

        System.out.println(genderList1);


    }
}
