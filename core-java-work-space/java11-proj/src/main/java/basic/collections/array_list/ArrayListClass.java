package basic.collections.array_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        listExample1();

        List<Integer> list1= List.of(1,2,3,45);




    }

    private static void listExample1(){
        List<? super Object> anyList = createList();

        for(Object item : anyList)
            System.out.println("Component Type -> "  + item.getClass().getName().toString() + " -> value = " + item);
    }


    private static List<? super Object> createList(){
        List<? super Object> valueList = new ArrayList<>();

        valueList.add("any string values");
        valueList.add(100);
        valueList.add('a');
        valueList.add(100.00f);
        valueList.add(123456.876252d);

        return valueList;
    }

    private static void arraytoList(){

        List<Integer> list1= List.of(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);




    }



}
