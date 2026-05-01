package basics.optionals;

import java.util.List;
import java.util.Optional;

public class OptionalEx5 {


    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        Optional<List<Integer>> listOps = Optional.of(List.of(10, 20, 30, 40));

        List<Integer> values = listOps.stream()
                .flatMap(val -> val.stream())
                //.sorted(Collections.reverseOrder())
                .dropWhile(num -> !(num > 20))
                .toList();

        System.out.println(values);

    }

}
