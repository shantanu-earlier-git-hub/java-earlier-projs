package basics.collectionspk.listsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Example1 {


    static private void arrayListRelated(List<Integer> list1){


        list1.add(40);
        list1.add(20);

        list1.addLast(100);
        list1.removeIf(num -> num == 202);

        // list1.reversed()  making it just reversed doesn't change value of list1
        // need to assign back to list1 or other var to get those values.

        list1 = list1.reversed();
        System.out.println(list1);

        int index = list1.indexOf(100);
        list1.remove(index);
        System.out.println(list1);

        //list1.set(0, 100);
        //System.out.println(list1);

        list1.addFirst(100);
        System.out.println(list1);


    }


    public static void main(String[] args) {

        Integer []  arr ={10, 202, 30, 40, 50};

        // prints string representation of array object
        //System.out.println(arr);

        // should always take it as Interface OOA principles.
        List<Integer> list = Arrays.asList(10, 202, 30, 40, 50);

        // array and linked list
        List<Integer> list1 = new ArrayList<>(list);
        List<Integer> list2 = new LinkedList<>(list);

        // ArrayList
        list1.addAll(list);
        //arrayListRelated(list1);

        // LinkedList
        //list2.addAll(list);
        list2.addFirst(100);
        list2.addLast(1000);

        //list2.remove(2);
        list2.remove(list2.indexOf(202));
        System.out.println(list2);

        list2.add(2, 202);

        System.out.println(list2);
        list2.removeIf(num -> num==202);
        //System.out.println(list2);

        list2.forEach( num -> System.out.println(num));



    }
}
