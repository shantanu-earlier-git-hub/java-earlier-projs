package misc.excersize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSetExample1 {

    public static void main(String[] args) {

        var values = new ArrayList<>(List.of(1, 2, 3));

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        list1.set(2, 4);

        System.out.println(list1);
        System.out.println("values = " + values);
        values.remove(1);
        System.out.println("values = " + values);

    }
}
