package basics.streams.lambda.collectorsops;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person implements Comparable<Person> {

    private int id;

    private int age;

    private double salary;

    private String gender;

    private String name;

    private String department;

    @Override
    public int compareTo(Person person) {
        return this.id - person.id;
    }
}
