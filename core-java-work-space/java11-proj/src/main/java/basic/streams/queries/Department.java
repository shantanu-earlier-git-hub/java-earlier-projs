package basic.streams.queries;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor

@Getter
@Setter

public class Department {

    private int id;

    private String departmentName;


    Set<Emp> emps;

}
