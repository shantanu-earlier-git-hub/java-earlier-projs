package basics.optionals;

import java.util.Optional;

public class OptionalEx1 {


    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        if (o2.empty().isPresent()) {
            Integer val = o2.get();
        }

        Optional<Object> o3 = Optional.ofNullable(m1());
        Optional<Object> o4 = Optional.ofNullable(o1);

        System.out.println(o3);
        System.out.println(o4);

        boolean b1 = o1.isPresent();
        boolean b2 = o2.isPresent();

        System.out.println("is present b1  " + b1);
        System.out.println("is present b2  " + b2);


    }

    private static Optional<String> m1() {
        return Optional.empty();
    }

}
