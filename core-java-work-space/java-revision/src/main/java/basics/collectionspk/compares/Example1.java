package basics.collectionspk.compares;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example1 {

    public static void main(String[] args) {

        /*
            Comparable<Toy> -> int compareTo(Toy t1)
            Comparator<Toy> -> int compare(Toy t1, Toy t2)
        */

        SortedSet<Toy> toySortedSet = new TreeSet<>();

        toySortedSet.add(new Toy(100));
        toySortedSet.add(new Toy(1));
        toySortedSet.add(new Toy(8));
        toySortedSet.add(new Toy(6));
        toySortedSet.add(new Toy(2023));

        toySortedSet.forEach(toy -> {
            System.out.println(toy.getModel());
        });

    }
}
