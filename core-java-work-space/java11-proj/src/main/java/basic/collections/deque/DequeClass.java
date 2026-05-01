package basic.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeClass {

    public static void main(String[] args) {

        Deque<Integer> arrDeque= new ArrayDeque<Integer>();

        arrDeque.add(10);
        arrDeque.addFirst(100);
        arrDeque.addLast(2);

        arrDeque.forEach(System.out::println);

        Deque<String> listDeque = new LinkedList<>();

        listDeque.addFirst("some");
        listDeque.addLast("4");
        listDeque.offer("jshs");
        listDeque.offerFirst("jsjs");

        listDeque.forEach(System.out::println);

    }
}
