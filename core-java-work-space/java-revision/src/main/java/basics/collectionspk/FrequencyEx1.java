package basics.collectionspk;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FrequencyEx1 {


    public static void main(String[] args) {
        var list1 = List.of(1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7, 7, 6, 4, 3);

        // number of times the element is repeated in the collection.
        var val = 7;
        int freq = Collections.frequency(list1, val);
        System.out.println(
                " value{" +
                        "val + " +
                        "} is repeted {" +
                        " freq  ");


        list1 = list1.reversed();
        System.out.println("list1 = " + list1);

        list1 = new LinkedList<>(List.of(1, 2, 3));

        var list2 = new LinkedList<>(list1);
        Collections.shuffle(list2);
        System.out.println("list2 = " + list2);
    }
}
