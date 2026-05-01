package basics.collectionspk.dequesmaps;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example2 {

    public static void main(String[] args) {

        // Deque -> stack -> LIFO
        // Deque -> queue -> FIFO

        Deque<Integer> deque = new ArrayDeque<>();

        /*

        // when use addFirst, push , add (10,20, 30)  res -> [20,10, 100]
        deque.addFirst(10);
        deque.push(20);
        deque.add(100);
*/


        /*// same as before when use push , AddFirst , add (10,20, 30)  res -> [20,10, 100]
        deque.push(10);
        deque.addFirst(20);
        deque.add(100);
*/


        // combinations - for queue
        // offer -> pop
        // push -> removeLast



        System.out.println(deque);


    }
}
