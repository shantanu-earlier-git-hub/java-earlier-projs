package adv_java_course.collects.maps;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {
        linkedHashMapOps();

    }

    static void linkedHashMapOps(){

        LinkedHashMap<String, Integer> shoppingCart = new LinkedHashMap<>(10,0.75f, true);

        shoppingCart.put("apple", 2);
        shoppingCart.put("orange", 1);
        shoppingCart.put("banana", 3);

        shoppingCart.get("banana");

        shoppingCart.forEach((key, value) -> {
            System.out.println("key : " + key + " value :" + value);
        });




    }
}
