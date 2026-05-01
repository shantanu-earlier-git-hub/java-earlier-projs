package basic.streams.arrs;

import java.util.stream.IntStream;

public class ArrayStreams {


    public static void main(String[] args) {
        int arr[] = {1,2,3,45};

        IntStream intStream = IntStream.of(arr);

        intStream.forEach(System.out::println);

    }
}
