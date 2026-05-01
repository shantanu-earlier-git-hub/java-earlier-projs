package basic.streams.queries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class DepartmentService {


    static Department[] init(Department dept[]){

        Department[] d= dept;



        List<Department> dList= Arrays
                .asList(new Department(100, "HR", null)
                , new Department(200, "IT", null)
                , new Department(300, "Sales", null)
                , new Department(400, "Research", null)
                , new Department(500, "Admin", null)
        );


        Stream s= Arrays.stream(dList.toArray(), 0, 4);
        s.forEach( element ->{
            System.out.println( ((Department)element).getDepartmentName() );
        });

        d[0] = new Department(100,"HR",null);
        d[1] = new Department(200,"IT",null);
        d[2] = new Department(300,"Sales",null);
        d[3] = new Department(400,"Research",null);
        d[4] = new Department(500,"Admin",null);


        Emp emp[] = new Emp[5];

        emp[0] = new Emp(10, "bob", 1023.34, 20, "Male", d[0]);
        emp[1] = new Emp(20, "mike", 3456.21, 30, "Female", d[0]);
        emp[2] = new Emp(30, "tom", 4345.70, 40, "Female", d[1]);
        emp[3] = new Emp(40, "shan", 7332.25, 50, "Male", d[1]);
        emp[4] = new Emp(50, "billy", 4567.11, 40, "Male", d[1]);

        Set<Emp> hrEmps= new HashSet<>();
        Set<Emp> itEmps= new HashSet<>();

        hrEmps.add(emp[0]);
        hrEmps.add(emp[1]);

        itEmps.add(emp[0]);
        itEmps.add(emp[1]);
        itEmps.add(emp[2]);

        d[0].setEmps(hrEmps);
        d[1].setEmps(itEmps);

        return dept;

    }


    static void count(Department dept[]){


    }


    public static void main(String[] args) {
        Department dept[] = new Department[5];

        dept= init(dept);
    }
}
