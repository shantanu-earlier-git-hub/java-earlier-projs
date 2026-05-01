package basic.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueExamp {
    
    
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        
        for(int num: queue){
            System.out.println("num = " + num);
        }

        int n = queue.size();

        for(int i=0;i < n; i++){
            System.out.println("queue.poll() = " + queue.poll());
        }


    }
}
