package basics.strings.strings.Ex1;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    private static void stringPool() {
        String s1 = "There";
        String s3 = "There";
        System.out.println((s1 == s3) + "");
        s1 = "here";
        System.out.println(s1 == s3);
        System.out.println(s3);
    }

    public static void main(String[] args) {

//        int res =  "abc".compareTo("ABC");
//        System.out.println("res = " + res);
//

//        String s1= "hello";
//        String s2= "world";
//
//        s1= s1.concat(s2);
//        System.out.println("s1 = " + s1);

//        Stream.of("abs").forEach( str ->{
//            String str1= "";
//            str1= str;
//
//            System.out.println(str1==str);
//        });

        List<String> strings = Arrays.asList("abc", "bcd", "efg", "hij");

        List<Integer> intValues = Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 77, 7, 8, 88, 8, 9, 89, 100);

//        String value = values.stream()
//                .sorted((s, s2) -> s2.compareTo(s))
//                .collect(Collectors.collectingAndThen(Collectors.joining(","), s -> {
//                    return s.toUpperCase();
//                }));
//        long sum  = intValues.parallelStream()
//                .sorted((o1, o2) -> o1.compareTo(o2))
//                        .reduce(0, Integer::sum);
//
//        System.out.println(value);
//
//        System.out.println("sum -> " + sum);

        StringBuilder stringBuilder = new StringBuilder("xyz");
        char firstChar = stringBuilder.charAt(0);
        stringBuilder = stringBuilder.replace(0, 1,
                Character.toString(Character.toUpperCase(firstChar)));
        System.out.println(stringBuilder);

        strings.stream().forEach(str -> {
            String firstLetter = str.substring(0, 1);
            str = str.replace(firstLetter, firstLetter.toUpperCase());
            System.out.println(str);
        });


    }
}
