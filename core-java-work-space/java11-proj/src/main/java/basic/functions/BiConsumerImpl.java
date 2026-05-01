package basic.functions;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class BiConsumerImpl {


    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer1 = (num1, num2) -> System.out.println("value" + num1 * num2);

        biConsumer1.accept(200, 300);

        forEachInRange(IntStream.range(0, 10), (Integer num) -> {
            System.out.println("num = " + num);
        });

        List<Integer> rangeList= IntStream.range(0,10).boxed().collect(toList());

        System.out.println("random value with seed 9 = " +
                RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(9).nextInt());
    }

    static void forEachInRange(IntStream  intStream, Consumer<Integer> consumer) {
         for (int i : intStream.toArray()) {
            consumer.accept(i);
        }
    }

}
