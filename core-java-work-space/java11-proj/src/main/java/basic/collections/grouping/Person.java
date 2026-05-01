package basic.collections.grouping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Person implements Comparator<Person> {

    private Integer id;

    private String fName;

    private String lName;
    private Integer age;

    private Long phone;

    private Double income;

    @Override
    public int compare(Person o1, Person o2) {
        return (o1.age > o2.age  ? 1 : o1.age == o1.age ? 0: -1);
    }
}
