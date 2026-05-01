package basic.collections.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Examp2 {


    public static void main(String[] args) {
        Deque<Integer> intDeque= new ArrayDeque<>(10);

        for(int i= 0; i< 10; i++){
            intDeque.add(i*i);
        }

        System.out.println("size: " + intDeque.size());

        intDeque.add(100);

        System.out.println("new size: " + intDeque.size());

        for(int i=0 ; i< 10 ; i++){
            System.out.println("val = " + intDeque.poll());
        }

        intDeque.add(121);

        System.out.println("new size: " + intDeque.size());





    }
}
