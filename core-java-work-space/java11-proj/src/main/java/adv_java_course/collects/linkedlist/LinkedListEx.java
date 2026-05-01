package adv_java_course.collects.linkedlist;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("first item");
        linkedList.add("last item");

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.poll());
        System.out.println(linkedList);

        System.out.println(linkedList.pop());
        System.out.println(linkedList);

        System.out.println(linkedList.poll());
        System.out.println(linkedList.pop());




    }
}
