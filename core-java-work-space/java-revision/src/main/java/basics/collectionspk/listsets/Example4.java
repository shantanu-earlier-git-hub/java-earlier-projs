package basics.collectionspk.listsets;

import java.util.*;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,1,100,300,203,111,23,45);

        NavigableSet<Integer> set6 =
                list
                        .stream()
                        .sorted((o1, o2) -> o1.compareTo(o2))
                        .collect(Collectors.toCollection(TreeSet::new));

        // navigable set
        //NavigableSet<Integer> reversed = set6.descendingSet();
        //System.out.println("reversed navigable set");
        //reversed.forEach(num -> System.out.println(num));

        System.out.println("navigable set ascending values");
        set6.forEach(num -> System.out.println(num));

        System.out.println("floor : <= 110 -> " + set6.floor(110));
        System.out.println("ceiling:  >= 108 ->  " + set6.ceiling(108));
        System.out.println("higher: > 111 -> " + set6.higher(111));
        System.out.println("lower: < 111 -> " + set6.lower(111));


        System.out.println("all values inclusive last ->  " + set6.headSet(set6.last(), true));

        System.out.println("poll first -> " + set6.pollFirst());
        System.out.println("all values excluded first -> " + set6.tailSet(set6.first(), false));

        System.out.println("poll last -> " + set6.pollLast());

        System.out.println("all values excluded first -> " + set6.tailSet(set6.first(), false));

    }
}
