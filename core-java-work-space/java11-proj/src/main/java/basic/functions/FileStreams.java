package basic.functions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileStreams {


    public static void main(String[] args) throws IOException {
        fileStreams();
    }



    private static void fileStreams() throws IOException {

        Path path = Paths.get("E:\\java11-pra\\java11-pra\\src\\main\\java\\basic\\functions\\data1.txt");
        Stream<String> lines = Files.lines(path);


        Consumer<List<Integer>> consumer = (List<Integer> integers) -> {
            System.out.println(integers.stream().reduce(0,Integer::sum));
        };


        lines.forEach(line -> {
            List<Integer> lineList = Arrays
                    .stream(line.split(","))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            consumer.accept(lineList);
        });
    }

}


