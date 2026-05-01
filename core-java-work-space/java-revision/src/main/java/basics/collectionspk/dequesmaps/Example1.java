package basics.collectionspk.dequesmaps;

import java.util.ArrayDeque;
import java.util.Deque;

public class Example1 {


    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque();


        // when use add acts as queue
/*
        deque.add(10);
        deque.add(20);
        deque.add(30); // res -> 10, 20 , 30

*/

        // when use push then acts as stack LIFO
/*
        deque.push(10);
        deque.push(20);
        deque.push(30); // 30, 20, 10
*/

        // addLast method as below make Deque -> Queue and FIFO
/*
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30); // res-> 10, 20, 30
*/


        /*deque.offer(10);
        deque.offer(20);
        deque.offer(30); // res -> same as addLast -> 10, 20, 30 acts as Queue
*/

/*
        deque.add(10);
        deque.add(20);
        deque.add(30);
        deque.pop();
        // acts as queue , but pop() will remove first element.. res-> 20, 30
*/

        deque.add(10);
        deque.add(20);
        deque.add(30);

/*
        int val = deque.peek(); // get first but doesn't remove from collection.
        System.out.println("peek" + val); // 10
*/

        deque.forEach(System.out::println);
    }
}
