package basic.collections.deque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayMap {


    public static void main(String[] args) {

        Map<String , Integer> hMap= new HashMap<>();
        hMap.put("1", 2);
        hMap.put("2", 3);

        ArrayList<Integer> integerArrayList = new ArrayList(hMap.values());

        integerArrayList.forEach(System.out::println);



    }
}
