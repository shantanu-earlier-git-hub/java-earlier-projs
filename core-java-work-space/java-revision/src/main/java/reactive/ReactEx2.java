package reactive;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Map;

@Slf4j
public class ReactEx2 {


    static void zipIt() {
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        Integer[] arr2 = new Integer[]{6, 7, 8, 9, 10};

        var list1 = Flux.fromArray(arr1);
        var list2 = Flux.fromArray(arr2);

        var list3 = Flux.zip(list1, list2);

        list3.subscribe(System.out::println);

    }


    static void mapIt() {
        var list1 = Flux.just(

                "a: 100",
                "b: 200",
                "c: 300");

        Map<String, String> values =
                list1
                        .collectMap(k -> k.split(":")[0],
                                v -> v.split(":")[1])
                        .block();

        values.forEach((key, value) ->
                System.out.println(key + ": " + value)
        );

    }

    public static void main(String[] args) throws Exception {

        var interval = Flux.interval(Duration.ofMillis(100))
                .take(20);

        interval.subscribe(value ->
                System.out.println("value = " + value)
                );

        Thread.sleep(3000);

    }
}
