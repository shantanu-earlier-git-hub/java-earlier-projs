package hackrank.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BirdsSelectMin {


    public static int migratoryBirds(List<Integer> arr) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for(Integer value : arr){
            int count =0;
            if(map.keySet().contains(value)) {
               count = map.get(value);
                map.put(value, ++count);
            }else{
                map.put(value, 1);
            }
        }

        int max  = map.values().stream()
                .max((o1, o2) -> o1.compareTo(o2)).get();

        List<Integer> maxKeys = new ArrayList<>();

        for(Integer key : map.keySet()){
            if(max == map.get(key)) {
               maxKeys.add(key);
            }
        }

        return maxKeys.stream().min((o1,o2) -> o1.compareTo(o2)).get();

    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 1, 2, 2, 3);

        System.out.println(migratoryBirds(arr));
    }
}
