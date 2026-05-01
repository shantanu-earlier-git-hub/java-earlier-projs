package basics.streams.lambda.collectorsops;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class PersonOps2 {


    private static List<Person> getPeopleList() {

        return getPeople();


    }

    static List<Person> getPeople() {
        Person person1 = Person.builder().id(10).age(25).salary(12345.56).gender("M")
                .name("Mike").department("IT").build();

        Person person2 = Person.builder().id(20).age(50).salary(345678.00).gender("F")
                .name("Masha").department("Operations").build();

        Person person3 = Person.builder().id(30).age(34).salary(10000.00).gender("M")
                .name("Zack").department("HR").build();

        Person person4 = Person.builder().id(40).age(45).salary(200000.00).gender("F")
                .name("Stefani").department("Sales").build();

        Person person5 = Person.builder().id(50).age(38).salary(123000.00).gender("F")
                .name("Smith").department("Sales").build();

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        return list;
    }

    public static void main(String[] args) {

        List<Person> list = getPeopleList();

        Map<String, List<Double>> nameSalMap = list
                .stream()
                .collect(groupingBy(Person::getName,
                                mapping(Person::getSalary,
                                        Collectors.toList())
                        )
                );

        Set<String> keys = nameSalMap.keySet();

        for (String key : keys) {
            System.out.print(key + " :");
            nameSalMap.get(key).stream()
                    .forEach(System.out::println);
        }


        Map<String, TreeSet<Double>> names = list
                .stream()
                .collect(Collectors
                        .groupingBy(Person::getDepartment,
                                Collectors.mapping(person -> person.getSalary(),
                                        Collectors.toCollection(TreeSet::new)
                                )));

        System.out.println(names);


    }
}
