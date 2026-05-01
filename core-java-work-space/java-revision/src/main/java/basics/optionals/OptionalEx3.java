package basics.optionals;

import java.util.Optional;

public class OptionalEx3 {


    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        //map /// x -> y
        // flatmap //  x -> Optional<y>

        Integer val1 = o2.map(x -> 2 * x).orElse(-1);
        System.out.println(val1);

        String val2 = o1.map(x -> x.concat("world")).orElse("Hello World !");
        System.out.println(val2);


        Integer val3 = o2.flatMap(OptionalEx3::twice).orElse(-1);
        System.out.println(val3);

    }

    private static Optional<Integer> twice(Integer v) {
        return Optional.of(2 * v);
    }


}
