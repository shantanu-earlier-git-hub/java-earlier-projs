package basic.streams.queries;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmpService {


    static Emp[] init() {

        Emp emp[] = new Emp[5];

        Department d =new Department(10,"HR", null);

        emp[0] = new Emp(10, "bob", 1023.34, 20, "Male", d);
        emp[1] = new Emp(20, "mike", 3456.21, 30, "Female", d);
        emp[2] = new Emp(30, "tom", 4345.70, 40, "Female", d);
        emp[3] = new Emp(40, "shan", 7332.25, 50, "Male", d);
        emp[4] = new Emp(50, "billy", 4567.11, 40, "Male", d);

        return emp;
    }

    static void count(Emp emp[]) {

        List<Emp> empList = Arrays.stream(emp).toList();

        Long count = 0l;
        count = Arrays.stream(emp).count();

        System.out.println("count = " + count);
    }

    static void printDepartments(Emp emp[]) {

        List<Emp> empList = Arrays.stream(emp).toList();

        empList.stream()
                .map(Emp::getDepartment)
                .distinct()
                .forEach(s -> {
                            System.out.print(s + " ");
                        }
                );

    }

/*
    static void deptEmpCount(Emp emp[]){
        Map<String,Long> empMap=  Arrays.stream(emp)
                .collect(Collectors.groupingBy(Emp::getDepartment,Collectors.counting()));

        System.out.println(empMap);

    }
*/

    static void groupBy(Emp emp[]){

        Arrays.stream(emp).collect(Collectors.groupingBy(Emp::getDepartment))
                .forEach( (name, element) -> {
                    System.out.println(" Dept:-> " + name);
                    for(Emp e : element){
                        System.out.println(" " + e.getName());
                    }
                });


    }



    public static void main(String[] args) {

        Emp emp[] = init();
        List<Emp> empList = Arrays.stream(emp).toList();

        groupBy(emp);
        // deptEmpCount(emp);
    }
}
