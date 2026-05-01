package basics.optionals;

import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalEx4 {


    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        // streams on Optional

        long count1 = o1.stream()
                .collect(Collectors.counting());

        System.out.println("first = " + count1);

        long count2 = o2.stream()
                .collect(Collectors.counting());

        System.out.println("sec = " + count2);


    }

}
