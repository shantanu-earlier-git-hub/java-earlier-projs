package my_new_things;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class StreamsClass {


    public static void main(String[] args) {

        // string streams
        Stream<String> strStream = Stream.of("a", "aa", "b", "ccc", "ddd", "zsas");
        strStream.sorted((s1, s2) -> {
                    return s2.compareTo(s1);
                })
                .filter(s -> {
                    return !s.startsWith("a");
                })
                .map(str -> str.toUpperCase())
                .forEach(System.out::println);

        //
        Map<String, String[]> colourMap = new HashMap<>();

        colourMap.put("Yellow", new String[]{"Banana"});
        colourMap.put("Red", new String[]{"Apple", "BeetRoot"});
        colourMap.put("Green", new String[]{"Watermelon,GreenPaper", "Grapes"});

        colourMap
                .entrySet()
                .stream()
                .flatMap(key -> {
                        return  Stream.of(key.getValue());
                        
                })
                .forEach(val ->{
                    System.out.print(val +" ");
                });
        /// flattering ...

        List<Integer> numberList1= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> numberList2= Arrays.asList(10,20,30,40,50,60,70);
        List<Integer> numberList3= Arrays.asList(100,200,300,400,500,600,700);

        List<List<Integer>> listOfList = Arrays.asList(numberList1,numberList2,numberList3);

        List<Integer> fltternList = listOfList.stream().flatMap(list ->list.stream()).toList();

        fltternList.forEach(val ->{
            System.out.printf("%d ", val);
        });



    }


}
