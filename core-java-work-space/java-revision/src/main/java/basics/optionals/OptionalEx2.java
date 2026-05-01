package basics.optionals;

import java.util.Optional;

public class OptionalEx2 {


    public static void main(String[] args) {

        Optional<String> o1 = Optional.empty();
        Optional<Integer> o2 = Optional.of(10);

        Optional<Integer> o3 = Optional.ofNullable(null);


        String str = o1.orElse("some string");
        Integer val = o2.orElse(0);

        Integer val2 = o3.orElse(-1);
        Integer val3 = o3.orElseGet(() -> -2);

        System.out.println("str -> " + str);
        System.out.println("val -> " + val);

        System.out.println("val2 -> " + val2);
        System.out.println("val3 -> " + val3);

//        Integer val4 = o3.orElseThrow(() -> new RuntimeException("null pointer"));
//        System.out.println("val4 -> " + val4);

        //Integer val5= o1.or(() -> o2).orElse(-1);

        o1.ifPresentOrElse(value -> {
            System.out.println(value);
        }, () -> {
            System.out.println("no data");
        });

        String s = o1.or("empty "::describeConstable).orElse("");
        final Optional<Integer> o10 = Optional.empty();

        Optional<Integer> valueProvider1 = Optional.empty();
        Optional<Integer> valueProvider2 = Optional.ofNullable(null);
        Optional<Integer> valueProvider3 = Optional.ofNullable(0);

        Integer i = o10
                .or(() -> valueProvider1)
                .or(() -> valueProvider2)
                .or(() -> valueProvider3)
                .orElse(-1);

        System.out.println("s value " + s);
        System.out.println("i value " + i);


    }


}
