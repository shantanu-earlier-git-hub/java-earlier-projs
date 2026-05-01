package basics.collectionspk.listsets;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 202, 30, 40, 50);

        Set<Integer> set3 = new LinkedHashSet<>(list);

        SortedSet<Integer> set4 =
                list
                        .stream()
                        .sorted((o1, o2) -> o1.compareTo(o2))
                        .collect(Collectors.toCollection(TreeSet::new));

        NavigableSet<Integer> set6 =
                list
                        .stream()
                        .sorted((o1, o2) -> o1.compareTo(o2))
                        .collect(Collectors.toCollection(TreeSet::new));


//        Set<Integer> set5 = new TreeSet<>();
//        set3.forEach(num -> System.out.println(num));


        set4.forEach(nums -> System.out.println(nums));

        System.out.println(" values strictly less than provided ");
        Set<Integer> headSet  =set4.headSet(202);
        headSet.forEach(val -> System.out.println(val));

        System.out.println(" values more than or equal provided  ");
        int value = set4.getFirst();
        Set<Integer> tailSet1  =set4.tailSet(value);
        tailSet1.forEach(val -> System.out.println(val));

    }
}
