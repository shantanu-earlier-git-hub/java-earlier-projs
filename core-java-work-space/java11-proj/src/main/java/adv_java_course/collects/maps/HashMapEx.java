package adv_java_course.collects.maps;

import java.util.HashMap;

public class HashMapEx {

    static void bucketOps(){
        HashMap<String, Integer> bucketMap = new HashMap<>();

        bucketMap.put("apple", 1);
        System.out.println(bucketMap.get("apple"));

        bucketMap.put("apple", 2);
        System.out.println(bucketMap.get("apple"));

        System.out.println(bucketMap.containsKey("apple"));

        bucketMap.merge("apple", 1, Integer::sum);
        bucketMap.merge("orange", 1, Integer::sum);

        System.out.println(bucketMap);

    }





    public static void main(String[] args) {

            bucketOps();

    }
}
