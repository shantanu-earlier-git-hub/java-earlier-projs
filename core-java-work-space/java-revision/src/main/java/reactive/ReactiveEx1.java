package reactive;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;

@Slf4j
public class ReactiveEx1 {


    static void generateList() {
        Flux.fromIterable(List.of(10, -19, 300, -4000, 2345))
                .parallel()
                .runOn(Schedulers.parallel())
                .map(num -> num * 3)
                .sequential()
                .onBackpressureBuffer(2)
                .sort((num1, num2) -> num1.compareTo(num2))
                .subscribe(System.out::println);
    }


    static void otherList() {
        var before = LocalTime.ofInstant(Instant.now(), ZoneId.systemDefault());

        Flux.range(0, 100)
                .onBackpressureBuffer(10)
                .parallel()
                .map(n -> n * 10)
                .sequential()
                .sort((n1, n2) -> n1.compareTo(n2))
                .subscribe(System.out::println);
        var after = LocalTime.ofInstant(Instant.now(), ZoneId.systemDefault());

    }


    public static void main(String[] args) {
        //generateList();
        otherList();
    }

}
