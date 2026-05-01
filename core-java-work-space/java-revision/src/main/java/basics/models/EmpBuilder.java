package basics.models;

import java.time.LocalDate;

public class EmpBuilder {


    public static void main(String[] args) {


        var emp = Emp.builder().
                id(100)
                .name("")
                .doj(LocalDate.of(2023, 11, 12))
                .salary(1000.00)
                .build();

        System.out.println("emp = " + emp);

    }
}
