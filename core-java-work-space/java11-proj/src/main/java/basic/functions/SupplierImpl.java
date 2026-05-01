package basic.functions;

import lombok.*;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierImpl {


    public static void main(String[] args) {

        Person per1 = factory(Person::new);

        System.out.println("per1 = " + per1.toString());
    }


    private static Person factory(Supplier<? extends Person> supplier) {

        Person person = supplier.get();

        if (person != null) {
            person.builder()
                    .id(new Random(1000).nextInt())
                    .salary(new Random(1000).nextDouble())
                    .code(UUID.randomUUID().toString())
                    .build();
        }

        return person;
    }


}


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
class Person {

    private int id;

    private String code;

    private Double salary;
}
