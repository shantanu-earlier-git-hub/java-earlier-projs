package my_new_things;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionImpl {

    public static void main(String[] args) {
        List<Character> values = Arrays.asList('a','b','v','#','%','&','(');
        Conversion conversion= new Conversion() {
            @Override
            public List<Integer> convertCharToInt(List<Character> value) {
                List<Integer> convertedList = new ArrayList<>();
                value.stream().forEach( v -> {
                    convertedList.add(Integer.valueOf(v).intValue());
                });
                return convertedList;
            }
        };
        conversion.convertCharToInt(values).stream().forEach(System.out::println);
    }
}
