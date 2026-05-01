package basics.collectionspk.listsets;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example5 {

    private static SortedSet<Integer> getDataset(){
        //return new HashSet<>(); // not sorted ...
        return  new TreeSet<>();
    }


    public static void main(String[] args) {

        List<Integer> list = List.of(8,34,23,12,5,6,0,-1,200,43);
        //Set<Integer> nSet = getDataset(); // not sorted

        SortedSet<Integer> nSet = getDataset(); // sorted

        nSet.addAll(list);

        nSet.forEach(num -> System.out.println(num));
    }



}
