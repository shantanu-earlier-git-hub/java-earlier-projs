package basic.collections.grouping;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class PersonGrouping {

    public static void main(String[] args) {

        Person p1 = new Person(100, "fname1", "lname1", 40, 12345678L, 23450.567);
        Person p2 = new Person(200, "fname2", "lname2", 40, 45612378L, 223345.567);
        Person p3 = new Person(300, "fname3", "lname3", 23, 56009789L, 45002.567);
        Person p4 = new Person(400, "fname4", "lname4", 23, 67811125L, 50987.567);

        Person[] persons = {p1,p2,p3,p4};

        Map<Integer, Set<Person>> mapNames =
                List.of(persons)
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(Person::getAge, mapping(p -> p, toSet()))
                        );

        mapNames.forEach((k, v) -> mapNames.get(k).forEach(p-> System.out.println(p.getFName())));

    }
}
