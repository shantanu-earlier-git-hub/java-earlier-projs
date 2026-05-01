package basics.collectionspk.listsets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2 {

    public static void main(String[] args) {

//         throws Exception for duplicate elements
        Set<Integer> set1 = Set.of(10, 20, 30, 40, 50);

        Set<Integer> set2 = new HashSet<>();

        set2.add(10);
        set2.add(20);
        set2.add(20);// doesn't add to set ...duplicate... but doesn't throw an exception for Duplicate
        set2.add(30);
        set2.add(40);
        set2.add(50);


        System.out.println(" set1 values " );
        for (Integer val : set1) {
            System.out.println(val);
        }


        System.out.println("set2 values");
        System.out.println();
        set2.forEach(num -> System.out.println(num));
    }
}
