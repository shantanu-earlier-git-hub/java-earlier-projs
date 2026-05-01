package basic.collections.deque;

import java.util.ArrayDeque;

public class ArrDqueue {


    public static void main(String[] args) {

        ArrayDeque<String> arrayDeque=  new ArrayDeque<>();

        arrayDeque.add("sfksdlk");
        arrayDeque.offer("last");
        arrayDeque.offerLast("last again");

        arrayDeque.offerFirst("first");

        arrayDeque.forEach(System.out::println);
        arrayDeque.poll();

        System.out.printf("%s", "  \n");
        arrayDeque.forEach(System.out::println);

    }


}
