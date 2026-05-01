package my_new_things;

import java.util.LinkedList;
import java.util.List;

public class Collections1 {

    public static void main(String[] args) {

        List<Object> list1= createGenericList();

        list1.forEach( item -> {
            if(item instanceof  String) System.out.println(String.valueOf(item));
            if(item instanceof  Integer) System.out.println(((Integer) item).intValue());
        });
    }


    static <T> List <Object> createGenericList(){

        List<Object> list1= new LinkedList<>();

        list1.add("some text");
        list1.add(1);

        return list1;
    }

}
