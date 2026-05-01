package basics.collectionspk.comparatorsex;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

    public static void main(String[] args) {

        /*
            Comparable<Pet> -> int compareTo(Pet p1)
            Comparator<Pet> -> int compare(Pet p1, Pet p2)
        */

        Comparator<Pet> c1 = Comparator.comparing(Pet::getName);
        Comparator<Pet> c2 = Comparator.comparingInt(Pet::getAge);

        SortedSet<Pet> petSortedSet1 = new TreeSet<>(c1);
        SortedSet<Pet> petSortedSet2 = new TreeSet<>(c2);

        // a < A

        Set<Pet> set = Set.of(
                new Pet("jenny", 10),
                new Pet("ann", 14),
                new Pet("bobby", 2),
                new Pet("ZEN", 22),
                new Pet("XIO", 1),
                new Pet("", 4)

        );
        petSortedSet1.addAll(set);
        petSortedSet2.addAll(set);


        System.out.println("sorted by name \n ");
        petSortedSet1.forEach(System.out::println);

        System.out.println("sorted by age \n ");
        petSortedSet2.forEach(System.out::println);

    }
}
