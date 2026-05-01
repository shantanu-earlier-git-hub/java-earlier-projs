package reactive;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FluxEx1 {


    public static void main(String[] args) {

      /*  // collect as  list , convert to Mono and then block until next signal

        var list1 = Flux.fromIterable(List.of(7, 8871, -901, 1000, 2, 345, 400, -5, 6))
                .collectList()
                .block(Duration.ofMillis(100l));
        list1.stream().forEach(System.out::println);


        // collect as sorted list , convert to Mono and then block until next signal

        var list2 = Flux.fromIterable(List.of(7, 8871, -901, 1000, 2, 345, 400, -5, 6))
                .collectSortedList()
                .block(Duration.ofMillis(100l));
        list2.stream().forEach(System.out::println);
*/



        // collect nums to sorted list without block().

        var list3 = new ArrayList<Integer>();
        Flux.fromIterable(List.of(7, 8871, -901, 1000, 2, 345, 400, -5, 6))
                .collectSortedList()
                .subscribe(list3::addAll);
        list3.stream().forEach(System.out::println);


    }
}
