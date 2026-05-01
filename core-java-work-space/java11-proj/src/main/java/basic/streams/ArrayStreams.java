package basic.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.stream.Stream;

public class ArrayStreams {

    static String[] strArr = {"a", "b", "c", "d", "e", "f"};

    static void splitPeople(){

        String str = "1,shan ;2,joe; 3,mike";

        Stream.of(str.split(";"))
        .map(persons -> persons.trim().split(","))
                .forEach( person ->{
                    Person newPerson = new Person(Integer.valueOf(person[0]) , person[1]);
                    System.out.println(" Id:->  " + newPerson.getId() +  " name ->  " + newPerson.getName()) ;
                });
    }

    static void splitStr(){
        Stream.of(strArr)
                .forEach(
                        alpha -> {
                            System.out.println(alpha);
                        }
                );
    }


    public static void main(String[] args) {

        splitStr();
        splitPeople();

    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor

class Person {

    int id;
    String name;
}